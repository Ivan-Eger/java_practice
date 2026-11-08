package Practika_2;
import java.util.Scanner;

public class Task_1 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму заказа: ");
        double summa = in.nextInt();
        System.out.print("Введите код региона: Если Москва - 1; Если область - 2; Если другие регионы - 3: ");
        int kod = in.nextInt();
        if (summa < 0) {
            System.out.print("Ошибка: Сумма заказа отрицательна");
        }
        else {
            if (summa > 0 & summa < 5000) {
                if (kod == 1) {
                    System.out.print("Доставка 300 рублей");
                }
                if (kod == 2) {
                    System.out.print("Доставка 450 рублей");
                }
                if (kod == 3) {
                    System.out.print("Доставка 700 рублей");
                }
                else {
                    System.out.print("Ошибка: Введён не существующий код региона");
                }
            }
            else {
                if (kod == 1 || kod == 2 || kod == 3) {
                    System.out.print("Доставка бесплатная");
                }
                else {
                    System.out.print("Ошибка: Введён не существующий код региона");
                }
            }
        }
    }
}
