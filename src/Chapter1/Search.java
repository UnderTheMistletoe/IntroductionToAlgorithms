package Chapter1;

/**
 * Created by zt199 on 4/4/2017.
 */
public class Search {
    public static void search(int[] array, int value) {
        boolean isSuccess = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("the index is " + i);
                isSuccess = true;
            }
        }
        if (!isSuccess) {
            System.out.println("null value");
        }
    }
}
