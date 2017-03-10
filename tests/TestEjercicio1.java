import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ignacio on 10/3/2017.
 */
public class TestEjercicio1 {
    @Test
    public void evaluatesBusquedaSecuencial(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] intArray = new int[] {1,4,6,7,2,1};
        int result = ejercicio1.busquedaSecuencial(intArray,4);
        assertEquals(1,result);
    }

    @Test
    public void evaluatesBusquedaBinaria(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] intArray = new int[] {1,4,6,7,9,15};
        int result = ejercicio1.busquedaSecuencial(intArray,9);
        assertEquals(4,result);
    }
}
