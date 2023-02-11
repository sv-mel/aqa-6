/*Дан двумерный массив.
1. Вывести на экран элемент, расположенный в правом верхнем углу массива
2. Вывести на экран элемент, расположенный в левом нижнем углу массива*/

import java.util.Random;

public class TwoArray {
    public static void main(String[] args) {


        // 1 1 1 2
        // 2 3 3 4
        // 1 1 2 1
        double[][] array = new double[3][2];
        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = r.nextDouble(0, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //System.out.println(array[0[2]);
    }
}
