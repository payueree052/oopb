
package chap5;

public class MyAccount {
    public static void main(String[] args) {
//         BankAccount ba = new BankAccount(121, "Payueree Nawae", 25000.0);
//         System.out.println("ba : "+ba);
//         ba.printDeatails();
//         ba.deposit(500);
//         ba.deposit(300);
//         ba.withdraw(500);
//         ba.withdraw(300);
//         ba.printDeatails();

//    SavingAccount sa = SavingAccount.createSA(2001, "Payueree Nawae", 150);
//    System.out.println("SA = "+sa);
//        if (sa == null) {
//            System.out.println("ต้องเปิดบัญชีขั้นต่ำ 100 บาทครับ");
//        } else {
//            sa.printDeatails();
//            sa.deposit(100);
//            sa.printDeatails();
//            sa.withdraw(170);
//            sa.printDeatails();
//        }

    FixedDepositAccount sa = FixedDepositAccount.createFDA(101, "ayie", 1000);
        System.out.println("SA : "+sa);
        if (sa == null) {
            System.out.println("ต้องเปิดบัญชีขั้นต่ำ 1000 บาทครับ");
        } else {
            sa.printDeatails();
            sa.deposit(200);
            sa.printDeatails();
        }
    }
}