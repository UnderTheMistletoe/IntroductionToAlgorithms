package Chapter1;

import java.util.Arrays;

/**
 * Created by zt199 on 4/4/2017.
 */
public class BinaryAdd {
    public static void add(int[] arrayA, int[] arrayB) {
        if (arrayA.length != arrayB.length)
            throw new RuntimeException("length error");
        int[] arrayC = new int[arrayA.length + 1];
        boolean flag = false;
        for (int i = arrayA.length - 1; i >= 0; i--) {
            int res = arrayA[i] + arrayB[i];
            if (!flag) {
                arrayC[i + 1] = res % 2;
                flag = (res / 2) >= 1;
            } else {
                arrayC[i + 1] = (res + 1) % 2;
                flag = ((res + 1) / 2) >= 1;
            }
        }
        if (flag) {
            arrayC[0] = 1;
        } else {
            arrayC[0] = 0;
        }

        System.out.println(Arrays.toString(arrayC));

    }
}
