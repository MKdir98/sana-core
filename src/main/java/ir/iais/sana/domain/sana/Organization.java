package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class Organization {
    private String orgCode;
    private String orgTitle;

    public String getOrgCode() {
        return orgCode;
    }

    @SetterPoiColumn("Orgcode")
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgTitle() {
        return orgTitle;
    }

    @SetterPoiColumn("orgTitle")
    public void setOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
    }
}
