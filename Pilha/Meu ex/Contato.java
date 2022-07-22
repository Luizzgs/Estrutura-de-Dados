public class Contato {

    String nome;
    String telefone;

    //construtor
    public Contato(String n, String t){
        nome = n;
        telefone = t;
    }

    public String toString(){
        return "Nome: "+nome+" Telefone: "+telefone;
    }
}
