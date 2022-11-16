package Java.flowofprogram;
import java.util.*;
//Take 2 numbers as inputs and find their HCF and LCM.
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/01-flow-of-program.md
public class Q4 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one ");
        int one = sc.nextInt();
        System.out.println("Enter the number two ");
        int two  = sc.nextInt();

        System.out.println("HCF : " + Euclid_hcf(one , two ));
        System.out.println("LCM : " + lcm(one , two ));




    }


    static  int Euclid_hcf(int n1 ,int  n2 ){

        if(n2==0){
            return n1 ;
        }
        else return Euclid_hcf(n2 , n1%n2);
    }



    static  int lcm(int n1 , int n2 ){

        return  (n1*n2)/Euclid_hcf(n1,n2 );
    }









}
