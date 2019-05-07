import java.util.Scanner;

public class Basic_A1 {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number");
        n = s.nextInt();

        if(n > 0)
        {
            System.out.println("The number given " + n + " is positive");
        }
        else if (n < 0)
        {
            System.out.println("The number given " + n + " is negative");
        }
    }
}

