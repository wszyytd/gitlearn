import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] array = { 1, 2, 3 };
        paiLie(array, 0);
    }

    public static void paiLie(int[] array, int index) {
        if (index == array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, i, index);
            paiLie(array, index + 1);
            swap(array, i, index);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}