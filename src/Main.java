
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("enter the first number");
        num1 = s.nextInt();
        System.out.println("enter the second number");
        num2 = s.nextInt();
        System.out.println("enter the third number");
        num3 = s.nextInt();

        if ((num1 > num2) && (num1 > num3)){
            System.out.println(num1 + " is the  greatest");

        } else if ((num2 > num3) && (num2 > num1)) {
            System.out.println(num2 + " is the  greatest");
        }
        else {
            System.out.println(num3 + " is the  greatest");
        }



    }
}