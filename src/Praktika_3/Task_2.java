package Praktika_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: n не может быть <= 0");
            return;
        }

        int summa = 0;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int c_chet = 0;
        int c_nechet = 0;

        System.out.println("Введите сами числа: ");
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            summa += a;

            if (a % 2 == 0) {
                c_chet += 1;
            } else {
                c_nechet += 1;
            }

            if (a > maximum) maximum = a;
            if (a < minimum) minimum = a;
        }

        System.out.println("Сумма всех введённых чисел: " + summa);
        System.out.printf("Среднее арифметическое: %.2f%n", (double) summa / n);
        System.out.println("Максимальное значение: " + maximum);
        System.out.println("Минимальное значение: " + minimum);
        System.out.println("Количество чётных чисел: " + c_chet);
        System.out.println("Количество нечётных чисел: " + c_nechet);
    }
}
