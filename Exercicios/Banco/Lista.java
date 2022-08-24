public class Lista{
    int inicio = 0;
    int fim = -1;
    int tamanho = 5;
    Conta lista[] = new Conta[5];
    

    public void inserir(Conta c){
        if (fim<(lista.length-1)){
            fim++;
            lista[fim]=c;
            System.out.println("Conta Inserida: " + c.toString());
        }
        else{
            System.out.println("Lista cheia");
        }

    }
    
    public int busca(String nomeR){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].nomeTitular.contains(nomeR))
                return i;
        }
        return -1;
    }

    public void remove(String nomeR){
        int pos = busca(nomeR);
        if (pos!=-1){
            for (int i = pos; i < fim; i++) {
                lista[i] = lista[i+1];
            }
            fim--;
            System.out.println(" Conta Removida: " + nomeR);
        }
        else{
            System.out.println(" Conta não encontrada");

        }
    }

    public void mostrar(){
        for (int i = 0; i <=fim; i++) {
                System.out.println(lista[i].toString());
        
        }
    }






}