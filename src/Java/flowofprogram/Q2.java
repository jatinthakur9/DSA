package Java.flowofprogram;
 import java.util.Scanner;
//Take two numbers and print the sum of both.
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one ");

        int one = sc.nextInt();
        System.out.println("Enter the number two ");

        int two = sc.nextInt();
         int ans = sum(one , two);
         System.out.print("Sum of two number is :");
         System.out.println(ans);

    }


    static int sum(int one , int two ){

        return one+two;
    }

}
