public class Fila {
    int ponteiro_inicio = -1;
    int ponteiro_final = -1;

    Contato fila[];

    public Fila(int tamanho){
        fila = new Contato[tamanho];
    }

    //insere no final
    public void insere(Contato ci){
        if (ponteiro_final<(fila.length-1)){
            if (ponteiro_inicio==-1)
                ponteiro_inicio = 0;
            ponteiro_final++;
            fila[ponteiro_final]=ci;
            System.out.println("Inserido com sucesso! -> " + ci.toString());
        }
        else{
            System.out.println(" Lista cheia, nao foi possivel inserir !!!");
        }
    }
    //remove do inicio
    public Contato remove(){
        if (ponteiro_final!=-1){
            //tem elemento para remover
            Contato rem = fila[ponteiro_inicio];
            for (int i = ponteiro_inicio; i < ponteiro_final; i++) {
                //deslocar elementos para 1 posicao anterior
                fila[i] = fila[i+1];
            }
            ponteiro_final--;
            return rem;
        }
        else{
            System.out.println(" === Fila vazia ===");
            return null;
        }

    }

    public void imprimeFila(){
        System.out.println(" === FILA ===");
        for (int i = 0; i <= ponteiro_final; i++) {
            System.out.println(fila[i].toString());
        }
        System.out.println(" final da fila... ");
    }
}
