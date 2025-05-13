package SortPack;

import com.example.CountingSort;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CountingSortTest {

    @Test
    public void testCountSort() {
        int[] sourceArray = new int[]{5, 4, 10, 2, 1, 8, 5, 0};
        int[] expectedArray = new int[]{0, 1, 2, 4, 5, 5, 8, 10};

        CountingSort sorter = new CountingSort(sourceArray);
        sorter.countSort();

        assertThat(sorter.getArray()).isEqualTo(expectedArray);
    }

    @Test
    public void testRadixSort() {
        int[] sourceArray = new int[]{5, 410, 10, 2, 1, 850, 5, 0};
        int[] expectedArray = new int[]{0, 1, 2, 5, 5, 10, 410, 850};

        CountingSort sorter = new CountingSort(sourceArray);
        sorter.radixSort();

        assertThat(sorter.getArray()).isEqualTo(expectedArray);
    }
}