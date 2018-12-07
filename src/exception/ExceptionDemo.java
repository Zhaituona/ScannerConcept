package exception;

public class ExceptionDemo {

    //ExceptionDemo ex = new ExceptionDemo();
   /* int b = 5;
    int c = 0;
    int k = b / c;

    public void getData() {
        System.out.println(k);
    }*/

    public static void main(String[] args) {

       // int b = 5;
       // int c = 0;
       // int k = b / c;
        int [] ary = new int [6];

        try {
            //System.out.println(k);
            System.out.println(ary[7]);
        }
        //catch(Exception e ){
        //System.out.println("This is an exception");

        catch (ArithmeticException er) {
            System.out.println("This is an ArithmeticException ");
        }
       // catch (IndexOutOfBoundsException  ex){
            //System.out.println("this is method ");

        finally {
            System.out.println("delete cookies");
        }
        // it means there is exception ,but finally block still can execute .


    }

}