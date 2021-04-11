package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class DetailedAccCode5 {
    private String detailedAccCode5;
    private String detailedAccTitle;
    private String ledgerAcccode;


    public String getDetailedAccCode5() {
        return detailedAccCode5;
    }

    @SetterPoiColumn("DetailedAccCode5")
    public void setDetailedAccCode5(String detailedAccCode5) {
        this.detailedAccCode5 = detailedAccCode5;
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
