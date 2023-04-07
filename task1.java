import java.util.ArrayList;
import java.util.LinkedList;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
// измеряем время создания массива из 10 000 элементов
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.printf("ArrayList spent time: %d\n", endTime - startTime);
        
// измеряем время создания linkedlist из 10 000 элементов
        LinkedList<Integer> linkedlist = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedlist.addFirst(i);
        }
        endTime = System.nanoTime();
        System.out.printf("LinkedList spent time: %d\n", endTime - startTime);
    }
    // linkedlist быстрее чем arraylist на добавление переменных
}