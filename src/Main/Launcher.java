package Main;

import Chapter1.BinaryAdd;
import Chapter1.InsertionSort;
import Chapter1.Search;
import Chapter1.SelectSort;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by zt199 on 4/4/2017.
 */
public class Launcher {


    public static void main(String[] args) {
        int[] a = {122, 11, 111, 1, 3};

        SelectSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
