package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class BankAccount {
    private String bankAccCode;
    private String bankName;
    private String shobe_bank;
    private String bankbranchNum;
    private String bankAccNum;
    private String shaba;
    private Integer noe_hesab_banki;

    public String getBankAccCode() {
        return bankAccCode;
    }

    @SetterPoiColumn("BankAccCode")
    public void setBankAccCode(String bankAccCode) {
        this.bankAccCode = bankAccCode;
    }

    public String getBankName() {
        return bankName;
    }

    @SetterPoiColumn("BankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getShobe_bank() {
        return shobe_bank;
    }

    @SetterPoiColumn("shobe_bank")
    public void setShobe_bank(String shobe_bank) {
        this.shobe_bank = shobe_bank;
    }

    public String getBankbranchNum() {
        return bankbranchNum;
    }

    @SetterPoiColumn("bankbranchNum")
    public void setBankbranchNum(String bankbranchNum) {
        this.bankbranchNum = bankbranchNum;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    @SetterPoiColumn("bankAccNum")
    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getShaba() {
        return shaba;
    }

    @SetterPoiColumn("shaba")
    public void setShaba(String shaba) {
        this.shaba = shaba;
    }

    public Integer getNoe_hesab_banki() {
        return noe_hesab_banki;
    }

    @SetterPoiColumn("Noe_hesab_banki")
    public void setNoe_hesab_banki(Integer noe_hesab_banki) {
        this.noe_hesab_banki = noe_hesab_banki;
    }
}
