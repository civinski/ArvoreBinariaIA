public class ArvoreBinaria{
    private Nodo raiz;

    public boolean insere(int value){
        if (raiz == null){
            System.out.println(value + " eh a raiz da arvore");
            //System.out.println("Raiz da Arvore:               "+value);
            raiz = new Nodo(value);
            return true;
        }
        else {
            return raiz.insere(value);
        }
    }

    public Nodo remove(int valor){
        return remover(this.raiz, valor);
    }

    private Nodo remover(Nodo Nodo, int valor){
        if(valor < Nodo.getValor()){
            Nodo.setEsquerda(remover(Nodo.getEsquerda(), valor));
        } else if(valor > Nodo.getValor()){
            Nodo.setDireita(remover(Nodo.getDireita(), valor));
        } else if (Nodo.getEsquerda() != null && Nodo.getDireita() != null) {
            System.out.println("Removido: " + Nodo.getValor());
            Nodo.setValor(encontraMinimo(Nodo.getDireita()).getValor());
            Nodo.setDireita(removeMinimo(Nodo.getDireita()));
        } else {
            System.out.println("Removido: " + Nodo.getValor());
            Nodo = (Nodo.getEsquerda() != null) ? Nodo.getEsquerda() : Nodo.getDireita();
        }
        return Nodo;
    }

    private Nodo removeMinimo(Nodo Nodo) {
        if (Nodo == null) {
            System.out.println("  ERRO ");
        } else if (Nodo.getEsquerda() != null) {
            Nodo.setEsquerda(removeMinimo(Nodo.getEsquerda()));
            return Nodo;
        } else {
            return Nodo.getDireita();
        }
        return null;
    }

    private Nodo encontraMinimo(Nodo Nodo) {
        if (Nodo != null) {
            while (Nodo.getEsquerda() != null) {
                Nodo = Nodo.getEsquerda();
            }
        }
        return Nodo;
    }

    public void percorre(IPercorre metodo){
        metodo.percorre(raiz);
    }
}