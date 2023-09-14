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
        BankAccount acct2 = new BankAccount();
        
       account.setAcctBal(10);
       
       System.out.println("Current Balance: "+ account.getAcctBal());
       System.out.println("\nDeposit P 5.00");
       account.printBal(account.depositCash(5));
       
       System.out.println("\nWithdraw P 100.00");
       account.printBal(account.withdrawCash(100));
       
       System.out.println("\nWithdraw P 8.00");
       account.printBal(account.withdrawCash(8));
       
       System.out.println("\nTransfer P 8.00");
       account.printBal(account.transferCash(acct2, 8));
       
       System.out.println("\nTransfer P 2.00");
       account.printBal(account.transferCash(acct2, 2));
       
    }
    
}
