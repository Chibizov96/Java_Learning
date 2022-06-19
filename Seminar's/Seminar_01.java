// 1. Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: 1 (!!!)
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.pow;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;

public class Seminar_01 {

    public static void main(String[] args) throws IOException {
        // System.out.println(aPowb(3, -2));
        int[] array = Reader();
        int a = array[1];
        int b = array[0];
        Writer(aPowb(a, b));

    }

    public static String aPowb(int a, int b) {

        try {
            pow(a, b);
        } catch (InputMismatchException exception) {
            System.out.println("Введено не число");
        }
        return Double.toString(Math.pow(a, b));
    }

    public static int[] Reader() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:/Lerning/Year_2/Java/Java_Learning/Seminar's/input.txt"));
        int[] array = { 0, 0 };
        String[] splitted;
        while (sc.hasNextLine()) {
            splitted = sc.nextLine().split(" ");
            array[0] = Integer.parseInt(splitted[1]);
            splitted = sc.nextLine().split(" ");
            array[1] = Integer.parseInt(splitted[1]);
        }
        return array;
    }

    public static void Writer(String str) throws IOException {
        FileWriter writer = new FileWriter("E:/Lerning/Year_2/Java/Java_Learning/Seminar's/output.txt", false);
        writer.write(str);
        writer.close();
    }
}