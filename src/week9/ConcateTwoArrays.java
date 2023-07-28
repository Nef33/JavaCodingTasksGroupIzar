package week9;

import java.util.Arrays;

public class ConcateTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 2, 3};
        int[] array2 = {4, 7, 19, 23};
        System.out.println("merge Arrays " + Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];//to make sure that 3rd array has enough capacity to contain all the elements of array 1 and two
        int k = 0; //index numbers of 3rd array
        for (int i = 0; i < arr1.length; i++, k++) {//i: for first arrays index number
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {// i for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }
}
