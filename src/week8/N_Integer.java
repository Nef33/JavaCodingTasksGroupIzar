package week8;

import java.util.Arrays;

public class N_Integer {
    public static int[] nUniqueIntegersSumToZero(int N){
        int[] arr = new int[N];//array of size N to store unique integers
        int sum = 0;
        for(int i=0; i < N-1; i++) {
            arr[i] =i;
            sum += i;
        }
        arr[N-1] = -sum;
        return arr;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println("nUniqueIntegersSumToZero(n) = " + Arrays.toString(nUniqueIntegersSumToZero(n)));
    }
    //Array - N unique integers that sum up to 0
    //Write a function that given an integer N (1 < N < 100), returns an array
    //containing N unique integers that sum up to 0. The function can return any
    //such array.
    //For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    //The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    //For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    //correct answers).
}
