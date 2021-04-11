package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class Plan {
    private String planCode;
    private String planTitle;
    private String startDate;
    private String endDate;
    private Long predictedTotalCrd;

    public String getPlanCode() {
        return planCode;
    }

    @SetterPoiColumn("PlanCode")
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    @SetterPoiColumn("PlanTitle")
    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    @SetterPoiColumn("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @SetterPoiColumn("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getPredictedTotalCrd() {
        return predictedTotalCrd;
    }

    @SetterPoiColumn("PredictedTotalCrd")
    public void setPredictedTotalCrd(Long predictedTotalCrd) {
        this.predictedTotalCrd = predictedTotalCrd;
    }
}
