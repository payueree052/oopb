package chap4;

import java.util.Scanner;

public class CirclrCalculation {

    public static void main(String[] args) {
        int menu;
        System.out.println("---------------Menu---------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Calculate Diameter (เส้นผ่านศุนย์กลาง)");
        System.out.println("2 : Calculate Circumference (เส้นรอบวง)");
        System.out.println("3 : Calculate Area(พื้นที่)");
        System.out.println("4 : All");

        do {
            System.out.println("------------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter Menu[0-4] : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Enter Radias(รัศมี) : ");
                    double radias = sc.nextDouble();
                    Circle cc = new Circle(radias);
                    System.out.println("Diameter : "+Math.floor(cc.computeDiameter()));
                    break;
                case 2:
                    System.out.print("Enter Radias(รัศมี) : ");
                    double radias1 = sc.nextDouble();
                    Circle cc1 = new Circle(radias1);
                    System.out.println("Circumference : "+Math.floor(cc1.computeCircumference()));
                    break;
                case 3:
                    System.out.print("Enter Radias(รัศมี) : ");
                    double radias2 = sc.nextDouble();
                    Circle cc2 = new Circle(radias2);
                    System.out.println("Area : "+Math.floor(cc2.computeArea()));
                    break;
            }
            System.out.println("Menu = " + menu);
        } while (menu < 4 && menu > 0);
        
    }
}
