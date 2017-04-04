package Chapter1;

/**
 * Created by zt199 on 4/4/2017.
 */
public class SelectSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < key) {
                    key = array[j];
                    index = j;
                }
            }
            //swap array[i] array[index]
            key = array[i];
            array[i] = array[index];
            array[index] = key;
        }
    }
}
