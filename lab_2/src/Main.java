import java.util.Random;

public class Main {
    public static int SIZE = 5;
    public static int MIN = -10;
    public static int MAX = 10;

    public static void main(String[] args) {
        // Создаём матрицу
        System.out.println("Массив:");
        int[][] arr = random();
        System.out.println("Диагональ выше параллели главной диагонали");
        System.out.println(minElement(arr));

    }
    private static int[][] random(){
        int[][] RandArr = new int[SIZE][SIZE];
        Random rn = new Random();
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                RandArr[i][j] = rn.nextInt(MAX - MIN + 1) + MIN;

        for (int[] i : RandArr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        return RandArr;
    }
    private static int minElement(int[][] arr){
        int idx = 1;
        int min = arr[0][1];
        for (int i = 0; i < arr.length; i++) {
            if(idx!=arr.length) {
                System.out.print(arr[i][idx] + "\t");
                if (arr[i][idx] > min){
                    min = arr[i][idx];
                if (arr[i][idx] < min && min > 0)
                    min = arr[i][idx];}
            }
            idx+=1;
        }
        System.out.println("\n" + "Минимальный элемент:");
        return min;
    }

} //y x