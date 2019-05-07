import java.util.Scanner;

public class Basic_A3 {

    /**
     * Write a Java program that keeps an integer  between 1 and 7 in a variable  and displays the name of the
     * weekday based on that number
     *
     * a) solve it with with if/else
     * for 1, output is:
     *
     * Today is Monday
     *
     * for 3, output is:
     *
     * Today is Wednesday
     *
     *
     * b) for 8, output is:
     *
     * Week has only 7 days!
     *
     *
     * c) rewrite solution with switch statement
     */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter weekday number");
            int day = sc.nextInt();

            if(day == 1){
                System.out.println("Today is Monday");
            }else if(day == 2){
                System.out.println("Today is Tuesday");
            }else if(day == 3){
                System.out.println("Today is Wednesday");
            }else if(day == 4){
                System.out.println("Today is Thursday");
            }else if(day == 5){
                System.out.println("Today is Friday");
            }else if(day == 6){
                System.out.println("Today is Saturday");
            }else if(day == 7){
                System.out.println("Today is Sunday");
            }else {
                System.out.println("Week has only 7 days");
            }
        }
    }


