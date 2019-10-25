package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray(){
        BubbleSort bubbleSort=new BubbleSort();
        int[] array={3,2,7,5,9,1,8,10,4,6};
        int[] result=bubbleSort.sort(array);
        int[] expect={1,2,3,4,5,6,7,8,9,10};
        assertThat(result,is(expect));

    }
}
