
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Sorting {

    public void sort(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Integer Array (Ascending): " + Arrays.toString(array));
    }

    public void sort(String[] array) {
        Arrays.sort(array);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(array));
    }

    public void sort(int[] array, boolean descending) {
        Arrays.sort(array);
        if (descending) {
            reverse(array);
            System.out.println("Sorted Integer Array (Descending): " + Arrays.toString(array));
        } else {
            System.out.println("Sorted Integer Array (Ascending): " + Arrays.toString(array));
        }
    }

    public void sort(String[] array, boolean descending) {
        Arrays.sort(array);
        if (descending) {
            Collections.reverse(Arrays.asList(array));
            System.out.println("Sorted String Array (Descending): " + Arrays.toString(array));
        } else {
            System.out.println("Sorted String Array (Ascending): " + Arrays.toString(array));
        }
    }

    // Helper method to reverse an integer array
    private void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");

        Sorting sorting = new Sorting();
        Random rand = new Random();

        // Integer array with random values
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100); // Random numbers from 0 to 99
        }

        String[] strArray = {"Ali", "Asad", "Minhal", "Raza", "Ammar"};

        System.out.println("\nOriginal Integer Array: " + Arrays.toString(intArray));
        sorting.sort(intArray);

        System.out.println("\nOriginal String Array: " + Arrays.toString(strArray));
        sorting.sort(strArray);

        System.out.println("\nSorting Integer Array in Descending Order:");
        sorting.sort(intArray, true);

        System.out.println("\nSorting String Array in Descending Order:");
        sorting.sort(strArray, true);
    }
}
