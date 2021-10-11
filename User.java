import java.util.Scanner;

public class User {

    public static int isValidAge(int age){
        if(age>18){
            System.out.println("Eligible!!for voting");
        }else{
            System.out.println("not Eligible for voting");
        }
        return age;
    }
    public static String isValidname(String name){

        String S="^[a-zA-Z][a-zA-Z\\d]{7,29}$";

      if(name.matches(S)){
          System.out.println("Valid name");
      }else{
          System.out.println("Invalid name");
      }
        return S;
    }

    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter name and age");
        int age=s1.nextInt();
        String name=s1.next();


        int r2=isValidAge(age);
        String r1=isValidname(name);





    }





    }




