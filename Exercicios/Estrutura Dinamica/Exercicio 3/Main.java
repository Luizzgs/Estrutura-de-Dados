public class Main {
    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();
        Pets pet1 = new Pets();
        pet1.nome = "Fred";
        pet1.animal = "Cachorro";
        Pets pet2 = new Pets();
        pet2.nome = "Timmy";
        pet2.animal = "Gato";
        Pets pet3 = new Pets();
        pet3.nome = "rato";
        pet3.animal = "Hamster";
        lista.insere(pet1);
        lista.insere(pet2);
        lista.insere(pet3);
        lista.imprime();
        lista.remove(pet1);
        System.out.println("\n");
        lista.imprime();

    }

}
