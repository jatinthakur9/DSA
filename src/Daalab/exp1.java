package Daalab;

import java.util.Scanner;

//gcd
public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int n1 =sc.nextInt();
        System.out.println("Enter number two ");
        int n2 =sc.nextInt();

        System.out.println("Gcd of number is " + Euclid_gcd(n1 , n2 ));

        System.out.println("Lcm of number is " + (n1*n2)/gcd(n1 , n2 ));


    }


    static  int gcd(int n1 , int n2 ){
        int gcd = 1;

        int min = minimum(n1 , n2 );
        for (int i = 1; i <= min; i++) {
            if(n1 %i == 0 && n2%i == 0){
                gcd = i;
            }
        }


        return  gcd;
    }

     static int minimum(int n1, int n2) {
        if(n1<n2){
            return n1 ;
        } else {
            return  n2 ;
        }
    }


    static  int Euclid_gcd(int n1, int n2 ){




        if(n2 ==0){
            return n1;

        }
        else return Euclid_gcd(n2 , n1%n2);
    }


}



