public class ListaContato {

    int ponteiro_final = -1;
    int inicio = 0;
    Contato listaC[] = new Contato[15];

    public void insere_lista(Contato ci){
        if (ponteiro_final<(listaC.length-1)){
            ponteiro_final++;
            listaC[ponteiro_final]=ci;
            System.out.println("Inserido com sucesso! -> " + ci.toString());
        }
        else{
            System.out.println(" Lista cheia, nao foi possivel inserir !!!");
        }

    }

    public void insere_inicio(Contato ci){
        if (ponteiro_final==-1)
            insere_lista(ci);
        else if (ponteiro_final<(listaC.length-1)){
            //deslocamento dos elementos
            for (int i = ponteiro_final; i >=0 ; i--) {
                listaC[i+1] = listaC[i];
            }
            ponteiro_final++;
            listaC[inicio] = ci;
            System.out.println("Inserido no inicio da lista."+ " -> "+ci.toString());
        }
        else{
            System.out.println(" Lista está cheia! Nao foi possivel inserir");
        }
    }

    public void insere_ordenado(Contato ci){
        if (ponteiro_final == -1)
            insere_lista(ci);
        else if (ponteiro_final<(listaC.length-1)) {
            //1 localizar posicao de insercao >>
            //percorre a lista a procura de um elemento maior que
            //o elemento a ser inserido
            int posInsercao = ponteiro_final+1;
            for (int i = 0; i <= ponteiro_final; i++) {
                if (ci.nome.compareTo(listaC[i].nome) < 0) {
                    posInsercao = i;
                    break;
                }
            }
            //2 passo deslocar os elementos e realizar a insercao
            for (int i = ponteiro_final; i >= posInsercao; i--) {
                listaC[i + 1] = listaC[i];
            }
            //insere na posicao de insercao localizada
            listaC[posInsercao] = ci;
            //atualiza o ponteiro final
            ponteiro_final++;
            System.out.println(" Item inserido na posicao: "+posInsercao+ " -> "+ci.toString());
        }
        else{
            System.out.println(" Lista cheia!! ");
        }

    }

    public int busca(String nomeB){
        //percorrer a lista e verificar se o elemento esta nela
        for (int i = 0; i <= ponteiro_final ; i++) {
            if (listaC[i].nome.contains(nomeB))
                return i;
        }
        return -1;
    }

    public Contato retornaContato(int posicao){
        if (posicao>=0 && posicao<=ponteiro_final)
            return listaC[posicao];
        else
            return null;
    }

    public void remove(String nomeR){
        int posR = busca(nomeR);
        if (posR!=-1){
            for (int i = posR; i < ponteiro_final; i++) {
                listaC[i] = listaC[i+1];
            }
            ponteiro_final--;
            System.out.println(" Item removido com sucesso! " + nomeR);
        }
        else{
            System.out.println(" Elemento nao localizado! ");

        }
    }

    public void imprimeLista(){
        for (int i = 0; i <= ponteiro_final; i++) {
            System.out.println(i+ ": "+listaC[i].toString());
        }
    }


}
