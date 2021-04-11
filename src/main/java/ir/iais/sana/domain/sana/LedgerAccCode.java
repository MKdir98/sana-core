package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class LedgerAccCode {
    private String ledgerAcccode;
    private String ledgerAccTitle;
    private String gnrlAccCode;
    private String divanLedgerAcccode;

    public String getLedgerAcccode() {
        return ledgerAcccode;
    }

    @SetterPoiColumn("LedgerAcccode")
    public void setLedgerAcccode(String ledgerAcccode) {
        this.ledgerAcccode = ledgerAcccode;
    }

    public String getLedgerAccTitle() {
        return ledgerAccTitle;
    }

    @SetterPoiColumn("LedgerAccTitle")
    public void setLedgerAccTitle(String ledgerAccTitle) {
        this.ledgerAccTitle = ledgerAccTitle;
    }

    public String getGnrlAccCode() {
        return gnrlAccCode;
    }

    @SetterPoiColumn("GnrlAccCode")
    public void setGnrlAccCode(String gnrlAccCode) {
        this.gnrlAccCode = gnrlAccCode;
    }

    public String getDivanLedgerAcccode() {
        return divanLedgerAcccode;
    }

    @SetterPoiColumn("DivanLedgerAcccode")
    public void setDivanLedgerAcccode(String divanLedgerAcccode) {
        this.divanLedgerAcccode = divanLedgerAcccode;
    }
}
