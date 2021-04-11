package ir.iais.sana.exceptions;

import org.apache.poi.ss.usermodel.CellType;

public class CellTypeNotSupportException extends SanaException {
    private CellType cellType;

    public CellTypeNotSupportException(CellType cellType) {
        super();
        this.cellType = cellType;
    }
}
