public class Nodo{
    private int valor;
    public Nodo esquerda, direita;

    public void setEsquerda(Nodo esquerda){
        this.esquerda = esquerda;
    }

    public void setDireita(Nodo direita){
        this.direita = direita;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public Nodo getEsquerda(){
        return esquerda;
    }

    public Nodo getDireita(){
        return direita;
    }

    //Construtor da Classe

    public Nodo(int value){
        this.valor = value;
    }

    //Metodo Recursivo de Insercao

    public boolean insere(int value){
        if(value == this.valor){
            System.out.println("Valor Ja Existente na Arvore");
            return false;
        }

        else if (value < this.valor){
            if(esquerda == null){
                esquerda = new Nodo(value);
                System.out.println("Inserindo "+ value + " a esquerda de " + this.valor);
                //System.out.println("Inserindo Esquerda          "+ value);
                return true;
            }
            else {
                return esquerda.insere(value);
            }
        }
        else if (value > this.valor){
            if(direita == null){
                direita =  new Nodo(value);
                System.out.println("Inserindo "+ value + " a direita de " + this.valor);
                //System.out.println("Inserindo Direita                    "+ value);
                return true;
            }
            else {
                return direita.insere(value);
            }
        }
        return false;
    }
}