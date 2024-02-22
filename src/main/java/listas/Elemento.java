package listas;

public class Elemento {
    private String valor;
    private Elemento proximo;

    public Elemento(String valor) {
        this.valor = valor;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String getValor() {
        return valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

}
