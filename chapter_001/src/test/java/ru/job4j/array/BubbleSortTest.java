package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray(){
        BubbleSort bubbleSort=new BubbleSort();
        int[] array={10,9,8,7,6,5,4,3,2,1};
        int[] result=bubbleSort.sort(array);
        int[] expect={1,2,3,4,5,6,7,8,9,10};
        assertThat(result,is(expect));

    }
    @Test
    public void whenSortArrayWithFifteenElementsThenSortedArray(){
        BubbleSort bubbleSort=new BubbleSort();
        int[] array={67,33,42,2,8,50,33,678,332,99,100,12,7,47,2};
        int[] result=bubbleSort.sort(array);
        int[] expect={2,2,7,8,12,33,33,42,47,50,67,99,100,332,678};
        assertThat(result,is(expect));
    }
}
