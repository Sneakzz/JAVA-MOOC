
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // testing smallest value
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + smallest(values));

        // testing index of smallest value
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        // testing index of smallest value from specific index
        int[] values2 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 4));

        // testing swapping values
        int[] values3 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(values3));

        swap(values3, 1, 0);
        System.out.println(Arrays.toString(values3));

        swap(values3, 0, 3);
        System.out.println(Arrays.toString(values3));

        // testing selection sort
        int[] values4 = {8, 3, 7, 9, 1, 2, 4};
        sort(values4);
    }

    // ARRAY SORTING - Smallest value
    public static int smallest(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < (array.length - 1); i++) {
            int tempValue = array[i + 1];
            if (tempValue < minValue) {
                minValue = tempValue;
            }
        }
        return minValue;
    }

    // ARRAY SORTING - Index of the smallest value 
    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int minValue = array[0];
        int tempValue;

        for (int i = 0; i < (array.length - 1); i++) {
            tempValue = array[i + 1];
            if (tempValue < minValue) {
                minValue = tempValue;
                index = i + 1;
            }
        }
        return index;
    }

    // ARRAY SORTING - Index of the smallest starting from a specific index
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int idx = index;
        int minValue = array[idx];
        int tempValue;

        for (int i = idx; i < (array.length - 1); i++) {
            tempValue = array[i + 1];
            if (tempValue < minValue) {
                minValue = tempValue;
                idx = i + 1;
            }
        }

        return idx;
    }

    // ARRAY SORTING - Swapping values
    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        int value2 = array[index2];

        array[index1] = value2;
        array[index2] = value1;
    }

    // ARRAY SORTING - Selection sorting
    public static void sort(int[] array) {
        int idxOfSmallest;
        // print before sorting
        System.out.println(Arrays.toString(array));

        // initial loop that goes over every number
        for (int i = 0; i < array.length - 1; i++) {
            idxOfSmallest = indexOfTheSmallestStartingFrom(array, i);

            if (idxOfSmallest != i) {
                swap(array, i, idxOfSmallest);
            }
                System.out.println(Arrays.toString(array));

        }
        
    }

}
