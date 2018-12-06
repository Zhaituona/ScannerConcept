package scannerConcept;
import java.util.Scanner;

public class UseScanner4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age :");

        if(input.hasNextInt()){
           int age = input.nextInt();
            System.out.println("your age is : " + age);
        }
        else{
            System.out.println("please enter number  ");
        }
    }
}
