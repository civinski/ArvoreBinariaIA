import java.util.ArrayList;

public class Remover implements IPercorre{
    public void percorre(Nodo nodo){

        ArrayList<Nodo> lista = new ArrayList();

        if(nodo != null){
           // int valor = nodo.getValor();
         //  lista.add(valor);
            percorre(nodo.getEsquerda());
            percorre(nodo.getDireita());
        }
    }
}