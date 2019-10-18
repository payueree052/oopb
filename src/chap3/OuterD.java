package chap3;

class printer {

    void print() {
        System.out.println("Printer : print()");
    }
}//end class

public class OuterD {

    static void printReport(printer pnt) {
        pnt.print();
    }

    public static void main(String[] args) {
        printReport(new printer() {
            public void print() {
                System.out.println("Annonymous inner");
            }
        });
        printReport(new printer() {
            public void print() {
                System.out.println("Annonymous inner");
            }
        });
    }
}//end class
