package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class CostCenter {
    private String costcenterCode;
    private String costcenterName;
    private String costcenterType;
    private String description;

    public String getCostcenterCode() {
        return costcenterCode;
    }

    @SetterPoiColumn("CostcenterCode")
    public void setCostcenterCode(String costcenterCode) {
        this.costcenterCode = costcenterCode;
    }

    public String getCostcenterName() {
        return costcenterName;
    }

    @SetterPoiColumn("CostcenterName")
    public void setCostcenterName(String costcenterName) {
        this.costcenterName = costcenterName;
    }

    public String getCostcenterType() {
        return costcenterType;
    }

    @SetterPoiColumn("CostcenterType")
    public void setCostcenterType(String costcenterType) {
        this.costcenterType = costcenterType;
    }

    public String getDescription() {
        return description;
    }

    @SetterPoiColumn("Description_")
    public void setDescription(String description) {
        this.description = description;
    }
}
