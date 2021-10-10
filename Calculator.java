import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the value of A & b");
        int a = s1.nextInt();
        int b = s1.nextInt();
      //submisstion of two numbers
        int c= a+b;
        System.out.println("submission="+c);
        
        c=a-b;
        System.out.println("Subtraction="+c);
    }


}
