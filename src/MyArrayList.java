import java.util.Arrays;

/**
 * Класс MyArrayList представляет собой собственную реализацию списка.
 *
 * @param <T> Тип элементов в списке.
 */
public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Создает новый экземпляр MyArrayList с начальной емкостью.
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Добавляет элемент в список.
     *
     * @param item Элемент для добавления.
     */
    public void add(T item) {
        ensureCapacity();
        elements[size++] = item;
    }

    /**
     * Возвращает размер списка.
     *
     * @return Размер списка.
     */
    public int size() {
        return size;
    }


    /**
     * Получает элемент по индексу.
     *
     * @param index Индекс элемента.
     * @return Элемент по указанному индексу.
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    /**
     * Устанавливает значение элемента по индексу.
     *
     * @param index Индекс элемента.
     * @param item  Новое значение элемента.
     */
    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        elements[index] = item;
    }

    /**
     * Внутренний метод для увеличения емкости списка при необходимости.
     */
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }
}
