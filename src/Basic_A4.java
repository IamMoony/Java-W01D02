import java.util.Scanner;

public class Basic_A4 {


    /**
     * write a program to find maximum between two numbers
     */
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int first = sc.nextInt();
            System.out.println("Enter second number");
            int second = sc.nextInt();

            if(first < second){
                System.out.println(second + " is the maximum");
            }else{
                System.out.println(first + " is the maximum");
            }

        }
    }


