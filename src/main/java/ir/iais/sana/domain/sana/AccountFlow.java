package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.annotation.SetterPoiColumn;

public class AccountFlow {

    private String bankName;
    private String bankBranchNum;
    private String bankAccNum;
    private String itemNum;
    private String itemDate;
    private Integer transactionType;
    private String actorName;
    private String description;
    private Long debtor;
    private Long creditor;
    private Long remaind;

    public String getBankName() {
        return bankName;
    }

    @SetterPoiColumn("BANKNAME")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchNum() {
        return bankBranchNum;
    }

    @SetterPoiColumn("Bankbranchnum")
    public void setBankBranchNum(String bankBranchNum) {
        this.bankBranchNum = bankBranchNum;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    @SetterPoiColumn("bankaccnum")
    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getItemNum() {
        return itemNum;
    }

    @SetterPoiColumn("itemnum")
    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemDate() {
        return itemDate;
    }

    @SetterPoiColumn("itemdate")
    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    @SetterPoiColumn("noe_tarakonesh")
    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public String getActorName() {
        return actorName;
    }

    @SetterPoiColumn("actorname")
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDescription() {
        return description;
    }

    @SetterPoiColumn("description_")
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDebtor() {
        return debtor;
    }

    @SetterPoiColumn("debtor")
    public void setDebtor(Long debtor) {
        this.debtor = debtor;
    }

    public Long getCreditor() {
        return creditor;
    }

    @SetterPoiColumn("creditor")
    public void setCreditor(Long creditor) {
        this.creditor = creditor;
    }

    public Long getRemaind() {
        return remaind;
    }

    @SetterPoiColumn("remaind")
    public void setRemaind(Long remaind) {
        this.remaind = remaind;
    }
}
