public class Conta {
    public String nomeTitular;
    public int  numeroConta; 
    public int numeroAgencia; 
    public Double saldoConta;

    Conta(){
        nomeTitular = "";
        numeroConta = 0; 
        numeroAgencia = 0; 
        saldoConta = 0.0;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void deposito(Double deposito){
        saldoConta += deposito; 
    }

    public String retirar(Double retirar) {
        if(saldoConta < retirar){
            return "Essa conta não possui essa quantidade. Saldo = "+saldoConta;
        }
        saldoConta -= retirar;
        return "Dinheiro retirado";
    }

    @Override
    public String toString() {
    return "Conta: "+numeroConta+ " Agencia: "+ numeroAgencia+ " Titular"+ nomeTitular+" Saldo " +saldoConta;
    }

}
