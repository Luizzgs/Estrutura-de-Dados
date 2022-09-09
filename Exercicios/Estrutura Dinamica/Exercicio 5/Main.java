public class Main {
    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();
        Pets pet1 = new Pets();
        pet1.nome = "Fred";
        pet1.animal = "Cachorro";
        Pets pet2 = new Pets();
        pet2.nome = "Timmy";
        pet2.animal = "Gato";
        Pets pet3 = new Pets();
        pet3.nome = "rato";
        pet3.animal = "Hamster";
        fila.insere(pet1);
        fila.insere(pet2);
        fila.insere(pet3);
        fila.imprime();
        fila.remove();
        System.out.println("\n");
        fila.imprime();
        fila.insere(pet1);
        System.out.println("\n");
        fila.imprime();

        System.out.println("------------PILHA------------");
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.insere(pet1);
        pilha.insere(pet2);
        pilha.insere(pet3);
        pilha.imprime();
        pilha.remove();
        System.out.println("\n");
        pilha.imprime();
        pilha.insere(pet3);
        System.out.println("\n");
        pilha.imprime();

    }

}
