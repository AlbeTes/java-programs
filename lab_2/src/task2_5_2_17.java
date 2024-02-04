import java.util.Arrays;
import java.util.Collections;

public class task2_5_2_17 {
    public static void main(String[] args) {
        // Исходный массив
        Integer[] arr = {4, -2, 3, 5, 3, -7, 1, 9, 0, 2, -3, 6, -1, 5, -2};
        System.out.println("Исходный массив:\n" + Arrays.toString(arr));

        // Узнаём индекс элемента 1
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                index = i;
            }
        }

        System.out.println("Индекс элемента 1: " + index);
        Arrays.sort(arr, index + 1, arr.length, Collections.reverseOrder());
        System.out.println("Отсортированный массив:\n" + Arrays.toString(arr));
    }
}