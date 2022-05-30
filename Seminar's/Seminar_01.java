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

import java.util.Scanner;
import java.lang.Math;

public class Seminar_01 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("int a:");
        double a = iScanner.nextInt();
        System.out.println("int b:");
        int b = iScanner.nextInt();
        iScanner.close();
        System.out.println("Число " + a + " в степени " + b + " равно " + Math.pow(a, b));
    }
}