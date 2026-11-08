package Practika_2;

import java.util.Scanner;

public class Task_2 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        String operation = in.next();
        double b = in.nextInt();
        switch (operation) {
            case "+":
                System.out.println("Результат: " + (a + b));
                break;
            case "-":
                System.out.println("Результат: " + (a - b));
                break;
            case "*":
                System.out.println("Результат: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                    break;
                }
                else {
                    System.out.println("Ошибка: На нол делить нельзя");
                    break;
                }
            default:
                System.out.println("Оштбка: Неизвестный символ операции");
                break;
        }
    }
}
