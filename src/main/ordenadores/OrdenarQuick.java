package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivot = array[0];
        int aux = 0;
        for (int i = inicio; i <= fim; i++){
            if(array[i] < pivot){
                array[i-1] = array[i];
                array[i] = pivot;
            }
        }
        for (int j = 0; j <= array.length-1; j++){
            if (array[j] == pivot){
                aux = j;
            }
        }
        return aux-1;
    }
    
}