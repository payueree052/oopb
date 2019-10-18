package chap6;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        try { //1 try มีหลาย catch ได้
            int zero = 10;
            int result = 1500/zero;
        } catch (ArithmeticException e) { //ถ้าไม่เกิด exception จะไม่ทำ #catch , exception เล็กไปใหญ่
            System.out.println("ArithmeticException");
        } catch (Exception e) { //ถ้าไม่เกิด exception จะไม่ทำ #catch
            System.out.println("NullPointerException");
        } finally {
            
            System.out.println("BYE BYE EEEEEEEE");
        }

        try {
            String str = null;
            System.out.println("str = " + str.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        try {
            int x[] = new int[2];
            x[0] = 0;
            x[2] = 1;
            x[3] = 2; //เกินขนาดของอาร์เรย์
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        try {
            int num = Integer.parseInt("aa");
            System.out.println("num = " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

    }
}
