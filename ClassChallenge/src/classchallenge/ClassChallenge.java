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
public class ClassChallenge {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
       account.setAcctBal(10);
       
       account.printBal(account.Deposit(5));
       account.printBal(account.Withdraw(100));
       account.printBal(account.Withdraw(8));
       
    }
    
}
