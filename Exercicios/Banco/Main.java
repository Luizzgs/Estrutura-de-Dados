public class Main {
    public static void main(String args[]) {
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
       
        conta1.setNomeTitular("Luiz");
        conta1.setNumeroAgencia(003);
        conta1.setNumeroConta(89900);
        conta1.setSaldoConta(15_000.00);

        conta2.setNomeTitular("José");
        conta2.setNumeroAgencia(004);
        conta2.setNumeroConta(8552);
        conta2.setSaldoConta(5_000.00);

        Lista l = new Lista();
        l.inserir(conta1);
        l.inserir(conta2);
    
        System.out.println("\n--Mostrando Contas\n");
        l.mostrar();
        System.out.println("\n--Depois de remover e fazer operações--\n");
        l.remove("José");
        conta1.deposito(10_000.00);
        
        l.mostrar();
}
}