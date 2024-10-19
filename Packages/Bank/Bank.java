// User defined package

package Packages.Bank;

public class Bank {
    public static void main(String[] args) {
        System.out.println("PNB");
        Account myAccount = new Account("abcd");
        myAccount.setPassword("abcd");
        System.out.println(myAccount.getPassword());
        myAccount.name = "Customer";
        myAccount.email = "mukul@gmail.com";
    }
}
 