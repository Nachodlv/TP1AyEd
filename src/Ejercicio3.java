
/**
 * Created by GonzaOK on 12/3/17.
 */
public class Ejercicio3{

    /**
     *
     * @param sortedListA list that must be sorted
     * @param sortedListB another list that also must be sorted
     * @return the result of two merged sorted lists
     */

    public Integer[] merge(Integer[] sortedListA, Integer[] sortedListB){

        Integer[] sortedListC = new Integer[sortedListA.length + sortedListB.length];

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while(indexA != sortedListA.length && indexB != sortedListB.length){

            if(sortedListA[indexA].compareTo(sortedListB[indexB]) == -1){
                sortedListC[indexC] = sortedListA[indexA];
                indexA ++;

            }else{
                sortedListC[indexC] = sortedListB[indexB];
                indexB ++;
            }
            indexC ++;
        }

        if(indexA == sortedListA.length){
            for(int i=indexC; i<sortedListC.length; i++){
                sortedListC[i] = sortedListB[indexB];
                indexB ++;
            }

        }else{
            for(int i=indexC; i<sortedListC.length; i++) {
                sortedListC[i] = sortedListA[indexA];
                indexA ++;
            }
        }

        return sortedListC;
    }
}
