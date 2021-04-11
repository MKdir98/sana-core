package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class DetailedAccCode3 {
    private String detailedAccCode3;
    private String detailedAccTitle;
    private String ledgerAcccode;


    public String getDetailedAccCode3() {
        return detailedAccCode3;
    }

    @SetterPoiColumn("DetailedAccCode3")
    public void setDetailedAccCode3(String detailedAccCode3) {
        this.detailedAccCode3 = detailedAccCode3;
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
