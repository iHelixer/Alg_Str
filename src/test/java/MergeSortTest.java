import com.example.MergeSort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MergeSortTest {

    @Test
    public void testMergeSort(){
        Integer [] sourceArray = new Integer[] {-5, 4, 10, 2, 1, 8, -5, 0};
        Integer [] expectArray = new Integer[] {-5, -5, 0, 1, 2, 4, 8, 10};
        MergeSort<Integer> mergeSortAlg = new MergeSort<>(sourceArray);
        mergeSortAlg.mergeSort();
        assertThat(mergeSortAlg.getArray()).isEqualTo(expectArray);
    }

}
