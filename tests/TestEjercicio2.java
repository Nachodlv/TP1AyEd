import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestEjercicio2 {
    @Test
    public void evaluatesSelection(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        printList(ejercicio2.selection(ints));
    }

    @Test
    public void evaluatesInsertion2(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        printList(ejercicio2.insertion(ints));
    }

    @Test
    public void evaluatesBubbleSort(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        printList(ejercicio2.bubbleSort(ints));
    }

    @Test
    public void recursiveSelection(){
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<>();
        Integer[] ints = new Integer[]{9,4,1,5,3,4,10};
        printList(ejercicio2.recursiveSelection(ints));
    }

    private void printList(Integer[] list){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + "\t");
        }
        System.out.println();
    }

}
