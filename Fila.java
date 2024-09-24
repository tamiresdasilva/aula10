public class Fila {
    private String [] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public  boolean estaCheia(){
        return this.tamanho == this.elementos.length;
    }


    //igual ao empilhar da pilha
    public boolean enfileirar(String e){
        if(!estaCheia()){
            this.elementos[tamanho] = e;
            tamanho++;
            return true;
        }
        return false;
    }

    //diferente do desimpilhar
    public String desenfileirar(){
        if(!estaVazia()){
            String elementoRemovido = this.elementos[0];
            for (int i = 1; i < tamanho; i++){
                this.elementos[i - 1] = this.elementos[i];
            }
            tamanho--;
            return elementoRemovido;
        }
        return null;
    }

    public String espiar(){
        if(!estaVazia()){
            return this.elementos[0]; //sempre tira da posição 0
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}


