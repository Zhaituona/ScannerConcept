package scannerConcept;
import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String i = sc.nextLine();

        System.out.println("How old are you?");
        int a = sc.nextInt();

        System.out.println("Are you single?");
        String c = sc.nextLine();
        System.out.println(sc.nextLine());
        sc.close();


    }
}
