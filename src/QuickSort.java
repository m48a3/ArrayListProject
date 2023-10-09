import java.util.Comparator;

/**
 * Класс QuickSort содержит алгоритм сортировки QuickSort.
 */
public class QuickSort {
    /**
     * Сортирует список с использованием алгоритма QuickSort.
     *
     * @param list       Список для сортировки.
     * @param comparator Компаратор для сравнения элементов.
     * @param <T>        Тип элементов в списке.
     */
    public static <T> void sort(MyArrayList<T> list, Comparator<T> comparator) {
        quickSort(list, 0, list.size() - 1, comparator);
    }

    private static <T> void quickSort(MyArrayList<T> list, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int partitionIndex = partition(list, low, high, comparator);
            quickSort(list, low, partitionIndex - 1, comparator);
            quickSort(list, partitionIndex + 1, high, comparator);
        }
    }

    private static <T> int partition(MyArrayList<T> list, int low, int high, Comparator<T> comparator) {
        T pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) < 0) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private static <T> void swap(MyArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
