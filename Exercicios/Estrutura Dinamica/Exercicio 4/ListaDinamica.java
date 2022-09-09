public class ListaDinamica{
    private No inicio;
    private No fim;


    //insere
    public void insere(Atleta a){
        No novo = new No(a);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }else{
            fim.prox = novo;
            fim = novo;
        }
    }

    //remove
    public void remove(Atleta a){
        No aux = inicio;
        No ant = null;
        while(aux != null){
            if(aux.atleta == a){
                if(aux == inicio){
                    inicio = inicio.prox;
                }else if(aux == fim){
                    ant.prox = null;
                    fim = ant;
                }else{
                    ant.prox = aux.prox;
                }
            }
            ant = aux;
            aux = aux.prox;
        }
    }
    
    public void imprime(){
        No aux = inicio;
        while (aux != null){
            System.out.println(aux.atleta);
            aux = aux.prox;
        }
    }
}