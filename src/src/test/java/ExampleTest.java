import org.example.Example;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @Test
    public void testIsEvenReturnsTrueForEvenNumber(){
      assertTrue(Example.isEven(4));
    }
    @Test
    public void testIsEvenReturnsFalseForOddNumber(){
        assertFalse(Example.isEven(5));
    }
    @Test
    public void testIsEvenReturnsTrueForZero(){
        assertTrue(Example.isEven(0));
    }
    @Test
    public void testIsEvenReturnsTrueForNegativeNumbers(){
        assertTrue(Example.isEven(-4));
    }
}
