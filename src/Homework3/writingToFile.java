package Homework3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writingToFile {
    public static void main(String[] args) {

        try {
            String [] strings = inputData();
            saveToFile(strings);
        } catch (MyFormatElementException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String [] inputData() throws MyFormatElementException {
        System.out.println("Введите данные через пробел: Фамилия Имя Отчество Номер телефона ");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String[] strings = input.split(" ");

            int codeResult = lengthArray(strings);
            if (codeResult == -1) {
                System.out.println("Количество введённых данных меньше, чем требуется");
            } else if (codeResult == -2) {
                System.out.println("Количество введённых данных больше, чем требуется");
            } else {
                String lastName = strings[0];
                String firstName = strings[1];
                String patronymic = strings[2];
                int phone = Integer.parseInt(strings[3]);
                return strings;
            }
        } catch (NumberFormatException e) {
            throw new MyFormatElementException("Номер телефона указан неверно!");
        }

        return new String[0];
    }

    public static int lengthArray(String[] strings) {
        if (strings.length < 4) {
            return -1;
        } else if (strings.length > 4) {
            return -2;
        }
        return 0;
    }

/*Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
в него в одну строку должны записаться полученные данные, вида
<Фамилия><Имя><Отчество><номер_телефона>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
     */
    private static void saveToFile (String [] filename) {
        try (FileWriter fw = new FileWriter(filename[0], true)) {
            for (String s : filename) {
                fw.write("<"+ s + ">");
            }
            fw.write("\n");
            System.out.println("Файл успешно сохранен под именем: "+ filename[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка введённых данных");
        }
    }
}

class MyFormatElementException extends Exception {
    public MyFormatElementException(String s) {
        super(s);
    }
}

