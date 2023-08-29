package Homework2;

public class Task2_devide0 {
    public static void main(String[] args) {

        // не создан массив
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0; //ловим ошибку деления на ноль
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e); //можно изменить текст "На ноль делить нельзя"
        } catch (IndexOutOfBoundsException e) {             //добавил ещё одно исключение
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

}
