import org.junit.Test;

/**
 * Created by GonzaOK on 12/3/17.
 */
public class TestEjercicio3 {

    @Test
    public void testMerge(){
        Ejercicio3 ejercicio3 = new Ejercicio3();

        Integer[] sortedListA = {2, 4, 6, 8};
        Integer[] sortedListB = {1, 3, 5, 7};

        printList(ejercicio3.merge(sortedListA, sortedListB));
    }

    private void printList(Integer[] list){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + "\t");
        }
    }
}
