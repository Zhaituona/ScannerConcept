package scannerConcept;
import java.util.Scanner;

public class UseScanner3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter double amount like :   12.78");
        Double  amount = input.nextDouble();

        int changeAmount = (int) (amount * 100);// this is compute double to int
        System.out.println("the change amount  is:  " + changeAmount);

        int dollar = changeAmount/ 100;
        changeAmount = changeAmount % 100;

        System.out.println("The change amount is " + " "+ changeAmount);
        System.out.println("The dollar is  " + "  "+ dollar);


    }
}
