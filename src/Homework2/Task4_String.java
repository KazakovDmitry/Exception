package Homework2;

import java.util.Scanner;

public class Task4_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();
        try {
            if (str == null || str.isEmpty()) throw new Exception();
            System.out.println("Вы ввели: " + str);
        } catch (Exception e) {
            System.out.println("Ошибка! Пустые строки вводить нельзя");
        }

    }
}
