package Homework2;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task1_float {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        while (number == 0) {
            System.out.println("Введите дробное число: ");
            String input = scanner.next();
            try {
                number = Float.parseFloat(input);
            }
            catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение");
            }
        }
        System.out.println(number);
    }
}
