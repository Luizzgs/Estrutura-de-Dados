public class ListaDupla{
    private No inicio;
    private No fim;

    
    public void insere(Aluno a){
        No novo = new No(a);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }else{
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
        }
    }

    public void remove(Aluno a){
        No aux = inicio;
        No ant = null;
        while(aux != null){
            if(aux.aluno == a){
                if(aux == inicio){
                    inicio = inicio.prox;
                    inicio.ant = null;
                }else if(aux == fim){
                    ant.prox = null;
                    fim = ant;
                }else{
                    ant.prox = aux.prox;
                    aux.prox.ant = ant;
                }
            }
            ant = aux;
            aux = aux.prox;
        }
    }

    public void imprime(){
        No aux = inicio;
        while (aux != null){
            System.out.println(aux.aluno);
            aux = aux.prox;
        }
    }

}