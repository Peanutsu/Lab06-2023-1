package ordenadores;
public class OrdenarPorContagem implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] temp = new int[max +1];

        for (int i = 0; i< n;i++) {
            temp[array[i]]++;
        }

        int[] ordenado = new int[n];
        int indiceOrdenado = 0;
        for (int i = 0; i <= max; i++) {
            while (temp[i] > 0) {
                ordenado[indiceOrdenado] = i;
                indiceOrdenado++;
                temp[i]--;
            }
        }
        return ordenado;
    }
}
