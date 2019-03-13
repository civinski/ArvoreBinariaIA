import java.util.*;

public class Largura implements IPercorre{
    public void percorre(Nodo nodo){
        Deque<Nodo> lista = new ArrayDeque<>();

        //Adiciona a raiz da arvore na lista
        lista.add(nodo);

        while (!lista.isEmpty()){
            //remove o primeiro item e adiciona na variavel de controle
            Nodo controleNivel = lista.removeFirst();
            System.out.println(controleNivel.getValor());

            //verifica se o nodo na variavel de controle possui esquerda ou direita
            if (controleNivel.getEsquerda() != null) {
                lista.add(controleNivel.getEsquerda());
                //adiciona o nodo na lista
            }
            if (controleNivel.getDireita() != null) {
                lista.add(controleNivel.getDireita());
            }
        }
    }
}

//5, 3, 7, 4, 6, 17, 12