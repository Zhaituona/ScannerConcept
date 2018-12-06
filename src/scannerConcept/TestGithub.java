package scannerConcept;
import java.util.Scanner;
import java.util.Random;

public class TestGithub {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please Enter Username :  ");
        String  Username = input.nextLine();
        System.out.println("Hello " + Username);
        Random ran = new Random(Username.hashCode());

        System.out.println("please enter Email :" );
        String email = input.nextLine();
        System.out.println("welcome " + email);
        System.out.println("Here is your random number : " + " " + ran.nextInt(20) +" "+  ran.nextInt(20)+" " +ran.nextInt(20));
         // if I  put the bound is same will be same , different bound not be same .
        System.out.println("Please enter Password : ");
        int password = 123456;
        int inputPassword = input.nextInt();


        if(inputPassword == password){
            System.out.println(" please welcome  " + Username);
        }
        else {
            System.out.println("Opps , please enter valid password ");
        }
        int newPassword = input.nextInt();
        System.out.println("Github welcome  "+ Username );

    }
}
