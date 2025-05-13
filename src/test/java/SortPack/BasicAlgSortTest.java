package SortPack;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BasicAlgSort;
import org.junit.jupiter.api.Test;
import java.util.Random;

class BasicAlgSortTest {

    @Test
    public void testBubbleSortWhenArraysWithIntegerTypesAndRangeEqualsLength(){
        Integer [] sourceArray = new Integer[] {5,4,10,2,1};
        Integer [] destArray = new Integer[] {1,2,4,5,10};
        BasicAlgSort<Integer> integerBasicAlgSort= new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.bubbleSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testSelectionSortWhenArraysWithIntegerTypesAndRangeEqualsLength(){
        Integer [] sourceArray = new Integer[] {5,4,10,2,1};
        Integer [] destArray = new Integer[] {1,2,4,5,10};
        BasicAlgSort<Integer>integerBasicAlgSort = new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.selectionSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testInsertionSortWhenArraysWithIntegerTypesAndRangeEqualsLength(){
        Integer [] sourceArray = new Integer[] {5,4,10,2,1,8,-5,0};
        Integer [] destArray = new Integer[] {-5,0,1,2,4,5,8,10};
        BasicAlgSort<Integer>integerBasicAlgSort = new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.insertionSortWithLinearSearchAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testInsertionSortWithBinarySearchWhenArraysWithIntegerTypesAndRangeEqualsLength(){
        Integer [] sourceArray = new Integer[] {5,4,10,2,1,8,-5,0};
        Integer [] destArray = new Integer[] {-5,0,1,2,4,5,8,10};
        BasicAlgSort<Integer>integerBasicAlgSort = new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.insertionSortWithBinarySearchAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }


    public static Integer[] getRandomInteger(int n){
        Integer [] sourceArray = new Integer[n];
        for (int i=0; i < n; i++){
            sourceArray[i] = new Random().nextInt(200)-100;
        }
        return sourceArray;
    }



}
