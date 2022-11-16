package Daalab;

// matrix chain multiplication
public class exp5 {
    public static void main(String args[])
    {
        int arr[] = new int[] { 1, 2, 3, 4, 3 ,5};
        int N = arr.length;

        // Function call
        System.out.println(

                         Mcm(arr, 1, N - 1));
    }


    static int Mcm(int p[], int i, int j)
    {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;


        for (int k = i; k < j; k++) {
            int count = Mcm(p, i, k)
                    + Mcm(p, k + 1, j)
                    + p[i - 1] * p[k] * p[j];

            if (count < min)
                min = count;
        }


        return min;
    }

}


