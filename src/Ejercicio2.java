/**
 * Created by Ignacio on 10/3/2017.
 */
public class Ejercicio2 <T extends Comparable>  {

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
}
