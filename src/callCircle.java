
import chap4.Circle;


public class callCircle {
    public static void main(String[] args) {
        Circle cc = new Circle(5.5);
        System.out.println("Radius : "+Math.floor( cc.getRedius() ));
        System.out.println("Area : "+Math.floor( cc.computeArea() ));
        System.out.println("Circumference : "+Math.floor( cc.computeCircumference() ));
        System.out.println("Diameter : "+Math.floor( cc.computeDiameter() ));
    }
}//end class
