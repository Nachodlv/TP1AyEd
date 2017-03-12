import java.util.Random;

public class Ejercicio2 <T extends Comparable>  {

    /**
     * It search for the minimum value in the list and it changes it with the first value. Then, it starts
     * searching for the next minimum value and changes it with the second value in the array and so on.
     * @param array The array of type T that will be sorted.
     * @return  The array of type T sorted
     */
    public T[] selection(T[] array){
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i;j<array.length;j++){
                if(array[min].compareTo(array[j])==1){
                    min = j;
                }
            }
            T t = array[i];
            array[i] = array[min];
            array[min] = t;
        }
        return array;
    }

    /**
     * Moves one element from the input data, finds the location it belongs within the sorted list,
     * and inserts it there. It repeats until no input elements remain.
     * @param array The array of type T that will be sorted.
     * @return The array of type T sorted
     */
    public T[] insertion (T[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i;j>=0;j--){
                if(array[j+1].compareTo(array[j])==-1){
                    T t = array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }
        }
        return array;
    }

    /**
     * Repeatedly steps through the list to be sorted, compares each pair of adjacent items and
     * swaps them if they are in the wrong order. It pass through the list is repeated until no
     * swaps are needed, which indicates that the list is sorted.
     * @param array The array of type T that will be sorted.
     * @return The array of type T sorted.
     */
    public T[] bubbleSort(T[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j].compareTo(array[j+1])==1){
                    T t = array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }

        }
        return array;
    }

    /**
     * Generate a random ints array of size n.
     * @param n Determines the size of the array.
     * @return the random array.
     */
    public Integer[] random(int n){
        Integer[] intArray = new Integer[n];
        for(int i=0;i<n;i++){
            intArray[i] = new Random().nextInt();
        }
        return intArray;
    }


    public T[] recursiveSelection(T[] array){
        return recursiveSelection(array,0);
    }

    private T[] recursiveSelection(T[] array, int posicion){
        if(posicion==array.length-1){
            return array;
        }
        int min = posicion;
        for(int i=posicion;i<array.length;i++){
            if(array[min].compareTo(array[i])==1){
                min=i;
            }
        }
        T t = array[posicion];
        array[posicion] = array[min];
        array[min] = t;
        return recursiveSelection(array,posicion+1);
    }
}
