import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestEjercicio2 {
    @Test
    public void evaluatesSelection(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        Integer[] result = ejercicio2.selection(ints);
        Integer[] answer = new Integer[]{1,3,4,4,5,9,10};

        assertEquals(true,answer==result);
    }

    @Test
    public void evaluatesInsertion2(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        Integer[] result = ejercicio2.insertion(ints);
        Integer[] answer = new Integer[]{1,3,4,4,5,9,10};

        assertEquals(true,answer==result);
    }

    @Test
    public void evaluatesBubbleSort(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        Integer[] result = ejercicio2.bubbleSort(ints);
        Integer[] answer = new Integer[]{1,3,4,4,5,9,10};

        assertEquals(true,answer==result);
    }

    @Test
    public void recursiveSelection(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        Integer[] result = ejercicio2.recursiveSelection(ints);
        Integer[] answer = new Integer[]{1,3,4,4,5,9,10};

        assertEquals(true,answer==result);
    }

}
