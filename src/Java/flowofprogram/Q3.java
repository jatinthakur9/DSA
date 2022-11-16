package Java.flowofprogram;

import java.util.*;
//Take a number as input and print the multiplication table for it.
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print multiplication table ");
        int num = sc.nextInt();

        Mtalbe(num);

    }


    static  void Mtalbe(int num ){

        for(int i=1 ; i<=10 ;i++){
            System.out.println( num + " * " + i +  " = " + (num*i)  );
        }
    }


}
