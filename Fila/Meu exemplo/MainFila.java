public class MainFila {
        public static void main(String args[]) {
            
            Contato c1 = new Contato("Abel","555");
            Contato c2 = new Contato("Joao", "765");
            Contato c3 = new Contato("Maria", "565");
    
            Fila f = new Fila();
            f.adicionar(c1);
            f.adicionar(c2);
            f.adicionar(c3);
           
            f.mostrar();
            System.out.println("\n" + f.inicio);
            f.remover();
            f.adicionar(c1);
            f.mostrar();
    }
}

