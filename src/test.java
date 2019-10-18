import java.util.Scanner ;
public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String srt;
        String av = "";
        System.out.print("Enter Sentence :");
        srt = in.nextLine();
        String[] aa = srt.split(" ");
        System.out.println("ความยามสตริง is : " + srt.length());
        for (int i = 0; i < aa.length; i++) {
            av += aa[i];
        }
        System.out.println("ข้อความ คือ : " + av);
    }
}
