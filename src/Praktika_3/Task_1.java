package Praktika_3;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main() {
        Random random = new Random();
        int number = random.nextInt(0, 101);
        System.out.println("Угадайте число в диапозоне от 1 до 100");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (number != a) {
            if (a < 1 || a > 100) {
                System.out.println("Ошибка: вы ввели число вне диапозона (1-100)");
                break;
            }
            else {
                if (a < number) {
                    System.out.println("Загаданное число больше");
                    a = in.nextInt();
                }
                else {
                    System.out.println("Загаданное число меньше");
                    a = in.nextInt();
                }
            }
        }
        if (a == number) {
            System.out.println("Вы угадали!");
        }
    }
}
