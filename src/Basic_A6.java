import java.util.Scanner;

public class Basic_A6 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your salary here ");
        float basicSalary = sc.nextFloat();

       if (basicSalary <= 1000) {
           System.out.println(basicSalary + basicSalary * 0.2 + 1000 * 0);
       } else if (basicSalary > 1000.01 && basicSalary <= 2000 ){
           System.out.println(basicSalary + basicSalary * 0.25 + basicSalary * 0.2);
        } else {
           System.out.println(basicSalary + basicSalary * 0.3 + basicSalary * 0.3);
       }
    }
}


