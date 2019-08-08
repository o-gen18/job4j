package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax(){
        MultiMax check=new MultiMax();
        int result=check.max(66,23,87);
        assertThat(result,is(87));
    }
    public void whenSecondMax2(){
        MultiMax check=new MultiMax();
        int result=check.max(12,43,2);
        assertThat(result,is(43));
    }
    public void whenSecondMax3(){
        MultiMax check=new MultiMax();
        int result=check.max(7,6,4);
        assertThat(result,is(7));
    }
    public void whenSecondMax4(){
        MultiMax check=new MultiMax();
        int result=check.max(32,32,32);
        assertThat(result,is(32));
    }

}
