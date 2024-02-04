import java.util.Random;

public class task2_5_4_17 {
    public static int SIZE = 5;
    public static int MIN = -10;
    public static int MAX = 10;

    public static void main(String[] args) {
        // Создаём матрицу
        int[][] arr = fillRandomIntVector();

        System.out.println("Созданная матрица:");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }


        int sum = 0;
        int count = 0;
        float average;
        System.out.println("\nПроизведение отрицательных эл. в каждом столбце:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                if (arr[i][j] > 0){
                    sum += arr[i][j];
                    count++;
                    System.out.println("Текущий элемент: " + arr[i][j]);
                }
            }
        }
        average = (float) sum /count;
        System.out.println("Среднее арифм. — " + average);
    }
    private static int[][] fillRandomIntVector(){
        int[][] RandArr = new int[SIZE][SIZE];
        Random rn = new Random();
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                RandArr[i][j] = rn.nextInt(MAX - MIN + 1) + MIN;
        return RandArr;
    }
}