package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class Project {
    private String projectcode;
    private String projectTitle;
    private String planCode;
    private String startDate;
    private String endDate;
    private Long predictedTotalCrd;

    public String getProjectcode() {
        return projectcode;
    }

    @SetterPoiColumn("projectcode")
    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    @SetterPoiColumn("projectTitle")
    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getPlanCode() {
        return planCode;
    }

    @SetterPoiColumn("PlanCode")
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getStartDate() {
        return startDate;
    }

    @SetterPoiColumn("startDate")
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
