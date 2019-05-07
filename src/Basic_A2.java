    import java.util.Scanner;

    public class Basic_A2   {


        public static void main(String[] args) {

            float n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any number ");
            n = s.nextFloat();

            if(n == 0) {
                System.out.println("The number " + n + " is zero");
            } else if (n < 1) {
                if(n < 0) {
                    System.out.println("The number " + n + "is negative");
                } else {
                    System.out.println("The number " + n + " is positive small");
                }
            } else if (n > 1000000) {
                System.out.println("The number " + n + " is large positive");
            } else {
                System.out.println("The number " + n + " is positive");
            }

        }

    }

