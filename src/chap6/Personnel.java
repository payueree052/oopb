package chap6;

public class Personnel {

    String name = "Personnel";

    void printName() {
        System.out.println("I'm " + name + ".");
    }    
    void getAddress() {
        System.out.println("I live in Bkk");
    }
}//end class personnel

class Manager extends Personnel {

    String name = "Manager";

    void printName() {
        System.out.println("I'm " + name + ".");
    }
    void getDepartment() {
        System.out.println("I work in the accounting department");
    }
}//end class manager

class Staff extends Personnel {

    String name = "Staff";

    void printName() {
        System.out.println("I'm " + name + ".");
    }

}//end class staff
