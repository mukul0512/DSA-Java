/*

Access Modifiers ->

4 types of Access Modifiers in java ->

1. Public -> can be access by anyone in the class or object or package

2. Private -> Can be access within a class using getters and setters function but can't be access beyond the class.

3. Protected -> Able to access within their own package but can be access only sub classes for the another package.

4. Default -> without any access modifier is the default access modifier

ex -> int id;

*/

package Oops;

class Friends {
    public String name; // public access modifier
    int id; // default access modifier
    protected String email; // protected access modifier
    private String password; // private access modifier

    // getters and setters function
    public String getPassword() { // getter function
        return this.password;
    }

    public void setPassword(String pwd) { // setter function
        this.password = pwd;
    }

    // private void setPassword(String pwd) { // setter function
    //     this.password = pwd;
    // }
    
}

public class AccessModifiers {
    public static void main(String[] args) {
        Friends friend1 = new Friends();
        friend1.name = "Algo";
        friend1.id = 5;
        friend1.email = "mukulkarnwal.mca2022@ritroorkee.com";
        // friend1.password = "helloWorld";  // can't be access 
        friend1.setPassword("Password");
        // friend1.setPassword("Password"); // can't able to call because of private function
        System.out.println(friend1.getPassword());

    }

}
