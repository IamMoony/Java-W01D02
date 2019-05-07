import java.util.Scanner;

public class Basic_A7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type first number here");
        int a = sc.nextInt();
        System.out.println("Type second number here");
        int b = sc.nextInt();
        System.out.println("Type third number here");
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println(a + "is the biggest number" + b + " is the second biggest number" + c + " is the third biggest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + "is the biggest number");
        } else {
            System.out.println(c + " is the biggest number");
        }

    }
}


