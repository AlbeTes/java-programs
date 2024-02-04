import java.util.Arrays;
public class task2_5_1_17 {
    public static void main(String[] args) {
//        // Создаем массив чисел
//        int[] c = {2, -13, 0, -9, 7, -6, 5, 0};
//        int[] x = new int[c.length];
//
//        int j = 0;
//        // Умножаем каждый не нулевой элемент массива
//        for (int i = 0; i < x.length; i++) {
//            if (c[i] != 0) {
//                x[j] = 4 * c[i];
//                j++;
//            }
//        }

        // Альт-версия:
        // Создаем массив чисел
        int[] c = {2, -13, 0, -9, 7, -6, 5, 0};

        // Узнаём кол-во ненулевых элементов массива
        int NotZero = 0;
        for (int i : c) {
            if (i != 0) {
                NotZero++;
            }
        }
        int[] x = new int[NotZero];

        // Умножаем каждый не нулевой элемент массива
        int j = 0;
        for (int k : c) {
            if (k != 0) {
                x[j] = 4 * k;
                j++;
            }
        }

        // Выводим результат
        System.out.println("Массив после сжатия: " + Arrays.toString(x));
    }
}