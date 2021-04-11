package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class DetailedAccCode1 {
    private String detailedAccCode1;
    private String detailedAccTitle;
    private String ledgerAcccode;


    public String getDetailedAccCode1() {
        return detailedAccCode1;
    }

    @SetterPoiColumn("DetailedAccCode1")
    public void setDetailedAccCode1(String detailedAccCode1) {
        this.detailedAccCode1 = detailedAccCode1;
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
