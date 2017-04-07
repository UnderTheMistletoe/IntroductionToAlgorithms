package Main;

import Chapter1.*;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by zt199 on 4/4/2017.
 */
public class Launcher {


    public static void main(String[] args) {
        int[] a = {11,23,4,5,12,3,4,5,6,6,7,8,352,2,1,1,};

        MergeSort.sort(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
