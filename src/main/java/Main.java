import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        BuscaBinaria buscaBinaria = new BuscaBinaria(lista, 23);
        System.out.println(buscaBinaria.isEncontrou());


    }



}
