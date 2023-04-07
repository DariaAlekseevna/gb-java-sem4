import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
 * принимает от пользователя строку вида text~num
 * нужно рассплитить строку по ~ и сохранить text в связный список на позицию num
 * если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка
 */

public class task2_1 {

    public static void main(String[] args) {

        // метод заполняет пустой LinkedList с заданным количеством элементов
        LinkedList<String> LL = new LinkedList<String>();
        LL = FillLL(LL, 13);
        System.out.println(LL);

        // метод принимает от пользователя данные text~num или print~num
        Scanner scanner = new Scanner(System.in);


        // метод анализирует полученные данные и либо кладет их в список либо выводит
        // строку из позиции num и удаляет ее из списка
        boolean bool = true;
        while (bool == true) {
            String StartEnd = readString(scanner, "Для начала/продолжения работы введи 1, для завершения 0: ");
            if (StartEnd.equals("0")) {
                System.out.println("bye");
                bool = false;
            } else {
                String text = readString(scanner, "enter a line: ");
                LL = DataManipulating(LL, text);
            }
        }

        scanner.close();
    }

    // метод создает пустой LinkedList с заданным количеством элементов
    private static LinkedList<String> FillLL(LinkedList<String> LL, int LLsize) {
        for (int i = 0; i < LLsize; i++) {
            LL.add("_");
        }
        return LL;
    }

    // метод принимает от пользователя данные text~num или print~num
    private static String readString(Scanner scanner, String message) {
        System.out.print(message);
        String text = scanner.nextLine();
        return text;
    }

    // метод анализирует полученные данные и либо кладет их в список либо выводит
    // строку из позиции num и удаляет ее из списка
    private static LinkedList<String> DataManipulating(LinkedList<String> LL, String text) {
        String[] textSplit = text.split("~");
        if (textSplit[0].equals("print")) {
            // вывести строку на позиции num и удалить из LL
            for (int j = 0; j < LL.size(); j++) {
                if (Integer.parseInt(textSplit[1]) == j) {
                    System.out.println("Извлекаемый элемент: " + LL.get(j-1));
                    LL.remove(j-1);
                    LL.add(j-1, "_");
                    System.out.println(LL);
                }
            }
        } else {
        // либо кладет их в список
            for (int i = 0; i < LL.size(); i++) {
                if (Integer.parseInt(textSplit[1]) == i) {
                    LL.remove(i-1);
                    LL.add(i-1, textSplit[0]);
                    System.out.println(LL);
                } 
            }
        }
        return LL;
    }

}
