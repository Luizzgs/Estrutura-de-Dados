public class Pilha {

    int topo = -1;
    Contato pilha[];

    public Pilha(int tamPilha){
        pilha = new Contato[tamPilha];
    }

    //insere na pilha
    public void empilha (Contato ci){
        if (topo<(pilha.length-1)){
            topo++;
            pilha[topo]=ci;
            System.out.println("Inserido com sucesso! -> " + ci.toString());
        }
        else{
            System.out.println(" Lista cheia, nao foi possivel inserir !!!");
        }
    }
    //remove do topo
    public Contato desempilha(){
        if (topo!=-1){
            Contato rem = pilha[topo];
            //limpar ultima posicao
            pilha[topo] = null;
            topo--;
            return rem;
        }
        else{
            System.out.println(" Pilha esta vazia! ");
            return null;
        }
    }

    public void imprime(){
        System.out.println(" ==== IMPRIMINDO PILHA ====");
        for (int i = topo; i >=0 ; i--) {
            System.out.println(pilha[i].toString());
        }
        System.out.println("---------------------------");
    }

}
