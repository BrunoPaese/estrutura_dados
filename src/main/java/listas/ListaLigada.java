package listas;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Elemento get(int index) {
        Elemento atual = primeiro;
        for (int i = 0; i < index; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void adicionar(String valor) {
        Elemento elemento = new Elemento(valor);
        if (primeiro == null && ultimo == null) {
            primeiro = elemento;
            ultimo = elemento;
        } else {
            ultimo.setProximo(elemento);
            ultimo = elemento;
        }
        tamanho++;
    }

    public void remover(String valor) {

    }
}
