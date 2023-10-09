import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {

    @Test
    public void testAddElement() {
        // Given
        MyArrayList<Integer> list = new MyArrayList<>();

        // When
        list.add(1);
        list.add(2);

        // Then
        assertEquals(2, list.size());
    }

    @Test
    public void testQuickSort() {
        // Given
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        // When
        QuickSort.sort(list, Comparator.naturalOrder());

        // Then
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }
}
