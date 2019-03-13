
import java.util.ArrayList;
import java.util.List;

public class Remover{

    static List<String> lista = new ArrayList();

    public static void varrer(Nodo nodo, List<String> lista){
            lista.add(Integer.toString(nodo.getValor()));
            if (nodo.getEsquerda() != null) {
                varrer(nodo.getEsquerda(), lista);
            }
            if (nodo.getDireita() != null) {
                varrer(nodo.getDireita(), lista);
            }
    }

    public static void remover(Nodo nodo, int num){
        if (nodo.getValor() == num){
            varrer(nodo, lista);
            System.out.println(nodo.getValor());
            System.out.println(lista);
        }
        if (nodo.getEsquerda() != null){
            remover(nodo.getEsquerda(), num);
        }
        if (nodo.getDireita() != null){
            remover(nodo.getDireita(), num);
        }
    }
}