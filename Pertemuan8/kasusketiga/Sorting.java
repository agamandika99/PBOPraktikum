package kasusketiga;

public class Sorting {
    // Menggunakan generic type T yang membatasi T harus mengimplementasi Comparable
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        int min;
        T temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // asc --> desc
    // Menggunakan generic type T yang membatasi T harus mengimplementasi Comparable
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;
            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
