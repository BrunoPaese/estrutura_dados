import javax.swing.text.StyledEditorKit;
import java.util.List;

public class BuscaBinaria {

    private List<Integer> lista;
    private int numero;
    private boolean encontrou;

    public BuscaBinaria(List<Integer> lista, int numero) {
        this.lista = lista;
        this.numero = numero;
        encontrouNumero();
    }

    public void encontrouNumero() {
        encontrou = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == numero) {
                encontrou = true;
            }
        }
    }

    public boolean isEncontrou() {
        return encontrou;
    }
}
