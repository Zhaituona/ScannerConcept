package scannerConcept;
import java.util.Scanner;
import java.lang.StringBuffer;

public class UseScanner2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What are you learning?");
        String st = sc.nextLine();

        StringBuffer  s1= new StringBuffer(st.substring(1));// StringBuffer will change the String , is mutable
        System.out.println(s1);
        System.out.println("java is fun");
        System.out.println("please");

        //System.out.println(s1+ " " + sc.nextInt());
        System.out.println(s1 + " " + sc.nextLine());
        System.out.println("true");
        Boolean b = sc.hasNextBoolean();
        System.out.println(sc.hasNextBoolean());



    }
}
