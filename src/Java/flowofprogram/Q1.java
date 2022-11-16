package Java.flowofprogram;

import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class Q1 {
    /*public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number of days in year ");
        int days = i.nextInt();

        Leapyear(days);
    }

       static  void  Leapyear(int days ){

        if(days==366){
            System.out.println("It is a leap year ");
       } else if (days==365) {
            System.out.println("It is a normal year ");
        } else {
            System.out.println("Invalid input ");
        }


       }*/





    //Better program to find the leap year


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int year = sc.nextInt();
        boolean ans = Leap(year);
      if(ans==true){
          System.out.println("It is a leap year ");
      }else{
          System.out.println("It is not a leap year ");
      }



    }

    static boolean Leap(int year ){

        boolean ans = false;
        if(year%4==0){
              ans = true ;
              if(year%100==0){
                        if(year%400==0){
                            ans = true ;
                        }else {
                            ans = false ;
                        }
              }
        }else{
            ans = false;
        }


        return ans;
    }




}


