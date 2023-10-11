
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account newAccount = new Account("Matthews account", 1000.0);
        Account newAccount2 = new Account("My account", 0);
        newAccount.withdrawal(100.0);
        newAccount2.deposit(100.0);
        System.out.print(newAccount + " \n " + newAccount2);
    }
}
