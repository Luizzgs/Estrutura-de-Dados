import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        ListaDinamica lista = new ListaDinamica();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("0 - Sair");
            option = sc.nextInt();
            
            switch (option) {
                case 1: {
                    System.out.println("Digite o peso do atleta: ");
                    Double peso = sc.nextDouble();
                    System.out.println("Digite a altura do atleta: ");
                    Double altura = sc.nextDouble();
                    System.out.println("Digite o nome do atleta: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o esporte do atleta: ");
                    String esporte = sc.nextLine();
                    System.out.println("Digite o patrocinador do atleta: ");
                    String patrocinador = sc.nextLine();
                    Atleta a = new Atleta(nome, altura, peso, esporte, patrocinador);
                    lista.insere(a);
                    break;
                }
                case 2:{
                    System.out.println("Digite o nome do atleta: ");
                    String nome = sc.nextLine();
                    break;
                }

        } 
    
    }   while (option != 0);
}
}
