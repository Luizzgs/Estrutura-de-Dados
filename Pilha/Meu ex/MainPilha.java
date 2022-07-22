public class MainPilha {
    public static void main(String args[]) {
        
        Contato c1 = new Contato("Abel","555");
        Contato c2 = new Contato("Joao", "765");
        Contato c3 = new Contato("Maria", "565");

        Pilha p = new Pilha();
        p.empilhar(c1);
        p.empilhar(c2);
        p.empilhar(c3);
        
       
        p.mostrarPilha();
    

        p.desempilhar();    
        
        p.mostrarPilha();
        
        
}
}