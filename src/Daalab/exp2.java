package Daalab;
//https://leetcode.com/problems/powx-n/
//LEETOCDE 50
public class exp2 {

    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }

    static  double myPow(double x, int n){

        if(n<0){
            return negative(x, n);

        }else {
            return positive(x,n);

        }

    }

    static double positive(double x, int n) {
        if(n==0){

            return 1;

        }

        double a = myPow(x, n/2);
        double ans = 1;
        if(n%2==0){
            ans = a*a;
        }  else {

            ans = x*a*a;
        }

        return ans ;
    }

     static double negative(double x, int n) {
        if(n==-1){
            return 1/x;
        }


        double a = myPow(x,n/2);
         double ans = 1;
         if(n%2==0){
             ans = a*a;
         }  else {

             ans = (1/x)*a*a;
         }
        return ans ;
    }


}
