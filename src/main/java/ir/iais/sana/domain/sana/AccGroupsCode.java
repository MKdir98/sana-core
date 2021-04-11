package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class AccGroupsCode {

    private String code;
    private String accGroupsTitle;
    private String divanAccGroupsCode;

    public String getCode() {
        return code;
    }

    @SetterPoiColumn("AccGroupsCode")
    public void setCode(String code) {
        this.code = code;
    }

    public String getAccGroupsTitle() {
        return accGroupsTitle;
    }

    @SetterPoiColumn("AccGroupsTitle")
    public void setAccGroupsTitle(String accGroupsTitle) {
        this.accGroupsTitle = accGroupsTitle;
    }

    public String getDivanAccGroupsCode() {
        return divanAccGroupsCode;
    }

    @SetterPoiColumn("DivanAccGroupsCode")
    public void setDivanAccGroupsCode(String divanAccGroupsCode) {
        this.divanAccGroupsCode = divanAccGroupsCode;
    }
}
