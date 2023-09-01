/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classchallenge;

/**
 *
 * @author User
 */
public class BankAccount {
    private int acctNo;
    private float acctBal;
    private String custNo;
    private String custEmail;
    private int phoneNo;

    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }

    public float getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(float acctBal) {
        this.acctBal = acctBal;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public boolean Deposit(int money){
        if(money > 0){
            this.acctBal += money;
            return true;
        }
        return false;
    }
    
    public boolean Withdraw(int money){
        if((this.acctBal - money) >= 0){
            this.acctBal -= money;
            return true;
        }
        return false;
    }
}
