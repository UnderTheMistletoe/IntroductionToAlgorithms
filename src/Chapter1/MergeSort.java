package Chapter1;

import java.util.Arrays;

/**
 * Created by zt199 on 4/6/2017.
 */
public class MergeSort {
    public static void sort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(array, start, mid);
            sort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }


    private static void merge(int[] array, int start, int mid, int end) {

        int lLength = mid - start + 1;
        int rLength = end - mid;
        int[] left = new int[lLength + 1];
        int[] right = new int[rLength + 1];

//        System.out.println("lLength = " + lLength);
//        System.out.println("rLength = " + rLength);

        for (int i = 0; i < lLength; i++) {
            left[i] = array[start + i];
        }
        for (int i = 0; i < rLength; i++) {
            right[i] = array[mid + i + 1];
        }

        left[lLength] = Integer.MAX_VALUE;
        right[rLength] = Integer.MAX_VALUE;


//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
        int lIndex = 0, rIndex = 0;
        for (int i = start; i <= end; i++) {
            if (left[lIndex] <= right[rIndex]) {
                array[i] = left[lIndex];
                lIndex++;
            } else {
                array[i] = right[rIndex];
                rIndex++;
            }
        }

//        System.out.println(Arrays.toString(array));

    }
}
