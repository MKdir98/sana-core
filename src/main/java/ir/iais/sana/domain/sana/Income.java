package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class Income {
    private String incomeCode;
    private String incomeTitle;

    public String getIncomeCode() {
        return incomeCode;
    }

    @SetterPoiColumn("incomeCode")
    public void setIncomeCode(String incomeCode) {
        this.incomeCode = incomeCode;
    }

    public String getIncomeTitle() {
        return incomeTitle;
    }

    @SetterPoiColumn("incomeTitle")
    public void setIncomeTitle(String incomeTitle) {
        this.incomeTitle = incomeTitle;
    }
}
