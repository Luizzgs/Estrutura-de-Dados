public class Pilha {
    public Contato pilha[];
    public int posicao;

    public Pilha(){
        this.posicao = -1;
        this.pilha = new Contato[15];
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicao == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicao + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicao];
    }

    public void desempilhar(){
        pilha[posicao--] = null;

    }

    public void mostrarPilha() {
            for (int i = 0; i <= posicao; i++) {
                System.out.println(i+ ": "+pilha[i].toString());
            }
        }
    

    public void empilhar(Contato x) {
        // push
        if (this.posicao < this.pilha.length - 1) {
            this.pilha[++posicao] = x;
        }
    }

}
