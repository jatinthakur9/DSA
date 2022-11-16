package Daalab;
//Find frequency of elements in a given array o(n)


import java.util.Arrays;

public class exp3 {

    public static void main(String[] args) {
        int[] array = {1 ,2 ,4 ,0,5,7,7,8,9,8};
        int[]  ans = frequency(array);
        System.out.println(Arrays.toString(ans));

    }

    static int[] frequency(int[] a ){
        int arr[] = new int[a.length];

        for (int i = 0; i < a.length ; i++) {
            arr[a[i]]  ++;

        }

         return  arr;
    }

}
