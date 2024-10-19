package Packages.Bank;

public class Account {
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
    
    public Account(String password) {
        this.password = password; // this keyword is the current object
    }
}
