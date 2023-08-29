package Homework1;


class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int [] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) {
            arr [i] = 1;
        }

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 2;
        int b = 0;
        int c = a / b;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str1 = "12a";
        int num = Integer.parseInt(str1);

    }
}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
