public class ArvoreBinaria{
    private Nodo raiz;
    //private IPercorre metodo; - Professor apagou


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

    public void remove(int value){

    }

    public void percorre(IPercorre metodo){
        metodo.percorre(raiz);
    }
}