public class Principal {

    public static void main(String[] args) {
        ListaContato lc = new ListaContato();

        Contato c1 = new Contato("Abel","555");
        Contato c2 = new Contato("Joao", "765");
        Contato c3 = new Contato("Maria", "565");
        Contato c4 = new Contato("Abilio", "566");
        Contato c5 = new Contato("Manuela", "5765");
        Contato c6 = new Contato("Beatriz", "4765");

        lc.insere_lista(c1);
        lc.insere_lista(c2);
        lc.insere_inicio(c3);

        lc.imprimeLista();

        lc.insere_lista(c4);
        lc.insere_inicio(c5);
        lc.insere_lista(c6);
        lc.imprimeLista();

        Contato c7 = new Contato("Juliana", "777");
        Contato c8 = new Contato("Clara", "789");
        Contato c9 = new Contato("Roberto", "655");
        Contato c10 = new Contato("Lucas", "755");
        Contato c11 = new Contato("Aline", "855");

        lc.insere_lista(c7);
        lc.insere_lista(c8);
        lc.insere_lista(c9);
        lc.insere_lista(c10);
        lc.insere_lista(c11);

        lc.imprimeLista();


        int pos = lc.busca("Maria");
        System.out.println("Elemento encontrado na posicao: "+pos);
        System.out.println(lc.retornaContato(pos).toString());


        lc.remove("Abel");
        lc.imprimeLista();

        lc.remove("Beatriz");
        lc.imprimeLista();

        System.out.println("< LISTA ORDENADA > ");
        ListaContato lc2 = new ListaContato();
        lc2.insere_ordenado(c7);
        lc2.insere_ordenado(c8);
        lc2.insere_ordenado(c9);
        lc2.insere_ordenado(c10);
        lc2.insere_ordenado(c11);

        lc2.imprimeLista();


        Pilha p1 = new Pilha(5);
        p1.empilha(c1);
        p1.empilha(c2);
        p1.empilha(c3);
        p1.empilha(c4);
        p1.imprime();
        p1.desempilha();
        p1.desempilha();
        p1.empilha(c5);
        p1.imprime();


        Fila f1 = new Fila(5);
        f1.insere(c6);
        f1.insere(c9);
        f1.insere(c7);
        f1.insere(c8);
        f1.imprimeFila();
        f1.remove();
        f1.insere(c10);
        f1.remove();
        f1.imprimeFila();

    }
}
