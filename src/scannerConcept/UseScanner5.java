package scannerConcept;
import java.util.Scanner;

public class UseScanner5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("please enter your age ");
        while(!input.hasNextInt()){// it will check what you input what input type you have
            input.next(); // just scan then throw , then check the condition , then do the while loop
            System.out.println("please enter number ");
        }
        int age = input.nextInt();
        System.out.println("your age is " + " " + age);

    }
}
