package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommission {

    public static void main(String[] args) {
        int menu;
        ArrayList<SaleMan> saleList = new ArrayList<>();
        do {
            System.out.println("--------Menu--------");
            System.out.println("0 : Exit");
            System.out.println("1 : Sale infomation");
            System.out.println("2 : Commission Summary");
            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter Menu[0-2] : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Sale Class : ");
                    int saleClass = sc.nextInt();
                    System.out.print("Enter Sale Total : ");
                    double saleTotal = sc.nextDouble();

                    SaleMan sm = new SaleMan();
                    sm.setId(id);
                    sm.setName(name);
                    sm.setSurname(surname);
                    sm.setSaleClass(saleClass);
                    sm.setSaleTotal(saleTotal);
                    saleList.add(sm);

                    break;
                case 2:
                    for (int i = 0; i < saleList.size(); i++) {
                        SaleMan sObj = saleList.get(i);
                        System.out.println("-----------------------------");
                        System.out.println("ID : " + sObj.getId());
                        System.out.println("Name : " + sObj.getName());
                        System.out.println("Surname : " + sObj.getSurname());
                        System.out.println("Class : " + sObj.getSaleClass());
                        System.out.println("Total : " + sObj.getSaleTotal());
                        System.out.println("-----------------------------");
                        
                        
                    }
                    break;
            }
        } while (menu != 0);
    }
}
