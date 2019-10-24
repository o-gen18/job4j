package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray(){
        Turn turner=new Turn();
        int[] input=new int[]{1,2,3,4,5,6};
        int[] result=turner.back(input);
        int[] expect= new int[]{6,5,4,3,2,1};
        assertThat(result,is(expect));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray(){
        Turn turner=new Turn();
        int[] input=new int[]{11,22,33,44,55,66,77,88,99};
        int[] result=turner.back(input);
        int[] expect=new int[]{99,88,77,66,55,44,33,22,11};
        assertThat(result,is(expect));
    }
}
