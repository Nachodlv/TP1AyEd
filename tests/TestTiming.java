import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTiming {
    Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
    Integer[] intArray = ejercicio2.random(10000);

    //125 ms, 10000 numeros
    //19s 454ms, 100000 numeros
    @Test
    public void testSelection(){
        ejercicio2.selection(intArray);
    }

    //192 ms, 10000 numeros
    //34s 627ms 100000 numeros
    @Test
    public void testInsertion(){
        ejercicio2.insertion(intArray);
    }

    //423 ms, 10000 numeros
    //36s 30ms, 100000 numeros
    @Test
    public void testBubble(){
        ejercicio2.bubbleSort(intArray);
    }

}
