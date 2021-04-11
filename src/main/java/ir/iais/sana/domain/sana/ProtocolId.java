package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class ProtocolId {
    private String protocolName;
    private String version;
    private String orgCode;
    private String divanOrgCode;
    private String orgTitle;
    private String provinceName;
    private String startDate;
    private String endDate;
    private String repDate;
    private String repTime;
    private String producerName;
    private String producerRole;
    private String description;

    public String getProtocolName() {
        return protocolName;
    }

    @SetterPoiColumn("protocolName")
    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getVersion() {
        return version;
    }

    @SetterPoiColumn("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    public String getOrgCode() {
        return orgCode;
    }

    @SetterPoiColumn("orgCode")
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getDivanOrgCode() {
        return divanOrgCode;
    }

    @SetterPoiColumn("DivanorgCode")
    public void setDivanOrgCode(String divanOrgCode) {
        this.divanOrgCode = divanOrgCode;
    }

    public String getOrgTitle() {
        return orgTitle;
    }

    @SetterPoiColumn("orgtitle")
    public void setOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
    }

    public String getProvinceName() {
        return provinceName;
    }

    @SetterPoiColumn("provincename")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getStartDate() {
        return startDate;
    }

    @SetterPoiColumn("startdate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @SetterPoiColumn("enddate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRepDate() {
        return repDate;
    }

    @SetterPoiColumn("repdate")
    public void setRepDate(String repDate) {
        this.repDate = repDate;
    }

    public String getRepTime() {
        return repTime;
    }

    @SetterPoiColumn("reptime")
    public void setRepTime(String repTime) {
        this.repTime = repTime;
    }

    public String getProducerName() {
        return producerName;
    }

    @SetterPoiColumn("producerName")
    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerRole() {
        return producerRole;
    }

    @SetterPoiColumn("producerRole")
    public void setProducerRole(String producerRole) {
        this.producerRole = producerRole;
    }

    public String getDescription() {
        return description;
    }

    @SetterPoiColumn("Description_")
    public void setDescription(String description) {
        this.description = description;
    }
}
