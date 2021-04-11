package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class Program {
    private String progCode;
    private String progTitle;


    public String getProgCode() {
        return progCode;
    }

    @SetterPoiColumn("ProgCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public String getProgTitle() {
        return progTitle;
    }

    @SetterPoiColumn("ProgTitle")
    public void setProgTitle(String progTitle) {
        this.progTitle = progTitle;
    }
}
