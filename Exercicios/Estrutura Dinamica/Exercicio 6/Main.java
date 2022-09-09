public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        Aluno a1 = new Aluno("Joao", 1, 7.0, "Direito");
        Aluno a2 = new Aluno("Maria", 2, 8.0, "Enfermagem");
        Aluno a3 = new Aluno("Jose", 3, 9.0, "Produção de Cachaça");
        Aluno a4 = new Aluno("Pedro", 4, 10.0, "Fisica");
        Aluno a5 = new Aluno("Ana", 5, 10.0, "Engenharia de Pesca");
        
        lista.insere(a1);
        lista.insere(a2);
        lista.insere(a3);
        lista.insere(a4);
        lista.insere(a5);
        lista.imprime();
    

    }
}
