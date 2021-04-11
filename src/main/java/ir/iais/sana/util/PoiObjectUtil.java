package ir.iais.sana.util;


import ir.iais.sana.domain.annotation.SetterPoiColumn;
import ir.iais.sana.exceptions.CellTypeNotSupportException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiObjectUtil {

    private PoiObjectUtil() {
    }

    private static final Logger logger = LogManager.getLogger(PoiObjectUtil.class);

    public static <T> List<T> getObjectFromSheet(Sheet sheet, Class<T> aClass) {
        List<T> results = new ArrayList<>();
        Map<String, Method> columnDetails = fillColumnAndMethodsDetails(sheet, aClass);
        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            try {
                T poiObject = aClass.newInstance();
                for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                    String columnName = sheet.getRow(0).getCell(j).getStringCellValue();
                    Cell cell = sheet.getRow(i).getCell(j);
                    if (cell != null) {
                        setCellValueInPoiObject(columnDetails, poiObject, columnName, cell);
                    }
                }
                results.add(poiObject);
            } catch (Exception e) {
                logger.error(e, e);
            }
        }
        return results;
    }

    private static <T> void setCellValueInPoiObject(Map<String, Method> columnDetails, T poiObject, String columnName, Cell cell) throws IllegalAccessException, InvocationTargetException, CellTypeNotSupportException {
        Class<?> parameterClassType = columnDetails.get(columnName).getParameters()[0].getType();
        if (parameterClassType.equals(Long.class)) {
            columnDetails.get(columnName).invoke(poiObject, Double.doubleToLongBits(cell.getNumericCellValue()));
        } else if (parameterClassType.equals(Integer.class)) {
            columnDetails.get(columnName).invoke(poiObject, (int) cell.getNumericCellValue());
        } else {
            if (cell.getCellType().equals(CellType.NUMERIC)) {
                columnDetails.get(columnName).invoke(poiObject, Double.toString(cell.getNumericCellValue()));
            } else if (cell.getCellType().equals(CellType.STRING)) {
                columnDetails.get(columnName).invoke(poiObject, cell.getStringCellValue());
            } else {
                throw new CellTypeNotSupportException(cell.getCellType());
            }
        }
    }

    private static <T> Map<String, Method> fillColumnAndMethodsDetails(Sheet sheet, Class<T> aClass) {
        Map<String, Method> columnDetails = new HashMap<>();
        for (int i = 0; i < aClass.getDeclaredMethods().length; i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                SetterPoiColumn annotation = aClass.getDeclaredMethods()[i].getAnnotation(SetterPoiColumn.class);
                if (annotation != null && sheet.getRow(0).getCell(j).getStringCellValue().equals(annotation.value())) {
                    columnDetails.put(sheet.getRow(0).getCell(j).getStringCellValue(), aClass.getDeclaredMethods()[i]);
                    break;
                }
            }
        }
        return columnDetails;
    }
}
