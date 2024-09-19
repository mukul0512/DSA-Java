package Oops.Bank;

public class Account {
    protected String name;
    String password;
    
    public Account(String password) {
        this.password = password; // this keyword is the current object
    }
}
