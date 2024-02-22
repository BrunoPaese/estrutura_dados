package buscas;

import java.util.List;

public class BuscaBinaria {

    private List<Integer> listaOrdenada;
    private int numero;
    private boolean encontrou;

    public BuscaBinaria(List<Integer> listaOrdenada, int numero) {
        this.listaOrdenada = listaOrdenada;
        this.numero = numero;
        encontrouNumero();
    }

    public int buscaMetade(int indexInicio, int indexFim) {
        return (indexFim - indexInicio) / 2;
    }

    public void encontrouNumero() {
        int indexInicio = 0;
        int indexFim = listaOrdenada.size() - 1;
        encontrou = false;
        while (!encontrou) {
            int indexMeio = buscaMetade(indexInicio, indexFim) + indexInicio;
            int numeroMeio = listaOrdenada.get(indexMeio);
            if (numeroMeio == numero) {
                encontrou = true;
            } if (numeroMeio < numero) {
                indexInicio = indexMeio + 1;
            } if (numeroMeio > numero){
                indexFim = indexMeio - 1;
            } if (indexInicio > indexFim) {
                break;
            }
        }
    }

    public boolean isEncontrou() {
        return encontrou;
    }
}
