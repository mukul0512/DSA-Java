package ClassObject;

class Faculties {
    String name;
    String contact;

    public void printDetains() {
        System.out.println(this.name);
        System.out.println();
        System.out.println(this.contact);
        System.out.println();
    }
}

// Blueprint of a Marker 
class Marker {
    // Properties of a Marker
    String color;
    String type; // ballpoint; gel;

    // Methods or function
    public void write() {
        System.out.println("Writing something");
        System.out.println();
    }

    public void printColor() {
        System.out.println(this.color);
        System.out.println();
    }

    public void printType() {
        System.out.println(this.type);
        System.out.println();
    }
}

public class ClassAndObject {
    public static void main(String args[]) { // main function
        // creating object of a Marker
        Marker marker1 = new Marker();
        marker1.color = "blue";
        marker1.type = "gel";

        // call to method
        marker1.write();

        marker1.printType();
        marker1.printColor();

        Marker marker2 = new Marker();
        marker2.color = "red";
        marker2.type = "ballpoint";
        // call to method
        marker2.printColor();
        marker2.printType();

        Faculties faculty1 = new Faculties();
        faculty1.name = "Shivani Chauhan";
        faculty1.contact = "9759876842";

        // call to method
        faculty1.printDetains();

        Faculties faculty2 = new Faculties();
        faculty2.name = "Aasya Khatoon";
        faculty2.contact = "7595792584";

        // call to method
        faculty2.printDetains();

        Faculties faculty3 = new Faculties();
        faculty3.name = "Manoj Kumar";
        faculty3.contact = "9746286846";  
        
        // call to method
        faculty3.printDetains();
    }
}
