public class FilaDinamica {
    private No inicio;
    private No fim;

    public void insere(Pets a){
        No novo = new No(a);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }else{
            fim.prox = novo;
            fim = novo;
        }
    }

    public void remove(){
        if(inicio != null){
            inicio = inicio.prox;
        }
    }

    public void imprime(){
        No aux = inicio;
        while (aux != null){
            System.out.println(aux.Animal);
            aux = aux.prox;
        }
    }



}
