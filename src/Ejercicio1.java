
public class Ejercicio1 {

    /**
     * Search a number in an array in a sequential form.
     * @param intArray the array where the method will search.
     * @param target the number searched.
     * @return the index where the number was found.
     */
    public int busquedaSecuencial(int[] intArray, int target){
        for(int i=0;i<intArray.length;i++){
            if(target==intArray[i]){
                return i;
            }
        }
        throw new numberNotFoundExc();
    }

    private int busqueda(int[] intArray, int target, int first, int last){
        int middle = (last-first)/2+first;
        if(intArray[middle]==target){
            return middle;
        }
        if(last==first){
            throw new numberNotFoundExc();
        }
        if(intArray[middle]>target){
            return busqueda(intArray,target,first,middle-1);
        }else{
            return busqueda(intArray,target,middle+1,last);
        }
    }

    /**
     * Search a number in an array in a binary form.
     * @param intArray the array where the method will search, it must be sorted.
     * @param target the number searched.
     * @return the index where the number was found.
     */
    public int busquedaBinaria(int[] intArray,int target){
        return busqueda(intArray,target,0,intArray.length-1);
    }
}
