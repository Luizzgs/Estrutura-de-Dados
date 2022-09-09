public class Pets {
    String nome;
    String animal;
    int chave;


    public Pets(int chave, String nome, String animal) {
        this.chave = chave;
        this.nome = nome;
        this.animal = animal;
    }

    public String toString() {
        return "" + chave +"-" + nome + "-" + animal;
    }
}
