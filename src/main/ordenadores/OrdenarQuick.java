package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivot = array[0];
        for (int i = inicio; i <= fim; i++){
            if(array[i] < pivot){
                array[i-1] = array[i];
                array[i] = pivot;
            }
        }
        return array[pivot+1];
    }
    
}