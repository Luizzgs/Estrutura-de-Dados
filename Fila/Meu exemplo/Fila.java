public class Fila{
    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    Contato fila[];

    public Fila(){
        inicio = fim = -1;
        tamanho = 100;
        fila = new Contato[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adicionar(Contato e){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            fila[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover(){
        if (! estaVazia() ){
            qtdeElementos--;
            fim--;
            for (int i = inicio; i < qtdeElementos; i++) {
                fila[i] = fila[i+1];
            }
        }
    }

    public void mostrar() {
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i+ ": "+fila[i].toString());
        }
    }
        
    }
