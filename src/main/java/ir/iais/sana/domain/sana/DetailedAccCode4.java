package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class DetailedAccCode4 {
    private String detailedAccCode4;
    private String detailedAccTitle;
    private String ledgerAcccode;

    public String getDetailedAccCode4() {
        return detailedAccCode4;
    }

    @SetterPoiColumn("DetailedAccCode4")
    public void setDetailedAccCode4(String detailedAccCode4) {
        this.detailedAccCode4 = detailedAccCode4;
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
