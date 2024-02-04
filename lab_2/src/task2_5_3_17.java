import java.util.Random;

public class task2_5_3_17 {
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


        int multiple;
        System.out.println("\nПроизведение отрицательных эл. в каждом столбце:");
        for (int i = 0; i < arr.length; i++) {
            multiple = 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] < 0)
                    multiple *= arr[j][i];
            }
            System.out.print(multiple + "\t");
        }
        System.out.println();
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