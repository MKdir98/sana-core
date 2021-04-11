package ir.iais.sana.domain.sana;


import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class DetailedAccCode2 {
    private String detailedAccCode2;
    private String detailedAccTitle;
    private String ledgerAcccode;


    public String getDetailedAccCode2() {
        return detailedAccCode2;
    }

    @SetterPoiColumn("DetailedAccCode2")
    public void setDetailedAccCode2(String detailedAccCode2) {
        this.detailedAccCode2 = detailedAccCode2;
    }

    public String getDetailedAccTitle() {
        return detailedAccTitle;
    }

    @SetterPoiColumn("DetailedAccTitle")
    public void setDetailedAccTitle(String detailedAccTitle) {
        this.detailedAccTitle = detailedAccTitle;
    }

    public String getLedgerAcccode() {
        return ledgerAcccode;
    }

    @SetterPoiColumn("LedgerAcccode")
    public void setLedgerAcccode(String ledgerAcccode) {
        this.ledgerAcccode = ledgerAcccode;
    }
}
