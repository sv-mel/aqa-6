import java.util.Random;
//Дан массив случайного размера. Составить программу:
//1. расчета квадратного корня из любого элемента массива;
//2. расчета среднего арифметического двух любых элементов массива.

public class RandomArray {
    public static void main(String[] args) {
        Random r = new Random();
        Random r2 = new Random();
        int[] array = new int[r.nextInt(3, 10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 10);
            System.out.println(array[i]);
        }

        // выбор рандомного элемента массива
        System.out.println("длина массива " + array.length);
        int randomElement = r.nextInt(0, array.length);
        // вызов метода
        System.out.println("Рандомный элемент массива " + (randomElement+1));
        System.out.println("Квадратный корень от числа " + array[randomElement]+" равен: " + sqrtFromElement(array[randomElement]));


        average(array[0], array[1]);

    }
    public static double sqrtFromElement (int number) {
        return Math.sqrt(number);
    }

    public static void average (int number1, int number2) {
        System.out.println("Среднее арифметическое 1 и 2 элемента массива = " + (number1 + number2) / 2);
    }
}
