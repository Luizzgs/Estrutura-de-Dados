public class PilhaDinamica {
    //pilha dinamica
    private No topo;
    private No fim;

    public void insere(Pets a){
        No novo = new No(a);
        if(topo == null){
            topo = novo;
            fim = novo;
        }else{
            novo.prox = topo;
            topo = novo;
        }
    }

    public void remove(){
        if(topo != null){
            topo = topo.prox;
        }
    }

    public void imprime(){
        No aux = topo;
        while (aux != null){
            System.out.println(aux.Animal);
            aux = aux.prox;
        }
    }

    

}
