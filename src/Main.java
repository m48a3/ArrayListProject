import java.util.Comparator;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Main {
    public static void main(String[] args) {
    // Создаем новый объект MyArrayList и добавляем элементы
    MyArrayList<Float> myList = new MyArrayList<>();
        myList.add(5.1F);
        myList.add(3F);
        myList.add(8F);

    // Выводим размер списка
        System.out.println("Размер списка: " + myList.size());

    // Выводим элементы списка
        for (int i = 0; i < myList.size(); i++) {
        System.out.println("Элемент " + i + ": " + myList.get(i));
    }

    // Сортируем список с использованием QuickSort
        QuickSort.sort(myList, Comparator.naturalOrder());

    // Выводим отсортированный список
        System.out.println("Отсортированный список:");
        for (int i = 0; i < myList.size(); i++) {
        System.out.println("Элемент " + i + ": " + myList.get(i));
    }
}
}