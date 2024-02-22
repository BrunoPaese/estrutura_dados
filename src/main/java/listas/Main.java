package listas;

public class Main {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.adicionar("Bruno");
        listaLigada.adicionar("João");
        listaLigada.adicionar("Margarete");
        listaLigada.adicionar("Naubert");
        listaLigada.adicionar("Bernardete");

        System.out.println(listaLigada.get(2).getValor());
    }
}
