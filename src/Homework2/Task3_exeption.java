package Homework2;

public class Task3_exeption {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {  //добавил дополнительную обработку ошибки
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {                            //остальные ошибки должны быть всегда в конце
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) { //удаляем лишнее throws FileNotFoundException
        System.out.println(a + b);
    }

}
