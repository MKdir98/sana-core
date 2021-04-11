package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class GeneralAccCode {
    private String gnrlaccCode;
    private String gnrlAccTitle;
    private String divanGnrlAccCode;

    public String getGnrlaccCode() {
        return gnrlaccCode;
    }

    @SetterPoiColumn("GnrlaccCode")
    public void setGnrlaccCode(String gnrlaccCode) {
        this.gnrlaccCode = gnrlaccCode;
    }

    public String getGnrlAccTitle() {
        return gnrlAccTitle;
    }

    @SetterPoiColumn("GnrlAccTitle")
    public void setGnrlAccTitle(String gnrlAccTitle) {
        this.gnrlAccTitle = gnrlAccTitle;
    }

    public String getDivanGnrlAccCode() {
        return divanGnrlAccCode;
    }

    @SetterPoiColumn("DivanGnrlAccCode")
    public void setDivanGnrlAccCode(String divanGnrlAccCode) {
        this.divanGnrlAccCode = divanGnrlAccCode;
    }
}
