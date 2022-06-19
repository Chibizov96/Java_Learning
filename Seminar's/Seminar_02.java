
// Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;

public class Seminar_02 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("number for search: ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println(Triangle(n));
    }

    public static String Triangle(int n) {
        if (n < 1) {
            return ("Неверное Число");
        } else {
            var Triangle_n = n * (n + 1) / 2;
            return (n + "-ое треугольное число равно: " + Triangle_n);
        }
    }
}
