import java.util.Scanner;

public class Basic_A3c {

        public static void main(String args[]) {

            int n ;

            Scanner in = new Scanner(System.in);
            System.out.print("Enter any number: ");
            n = in.nextInt();

            switch (n){
                case 1:
                    System.out.println("It is Monday");
                    break;
                case 2:
                    System.out.println("It is Tuesday");
                    break;
                case 3:
                    System.out.println("It is Wednesday");
                    break;
                case 4:
                    System.out.println("It is Thursday");
                    break;
                case 5:
                    System.out.println("It is Friday");
                    break;
                case 6:
                    System.out.println("It is Saturday");
                    break;
                case 7:
                    System.out.println("yeah it is Sunday");
                    break;
                default :
                    System.out.println("The week has only 7 days");
            }

        }

    }

