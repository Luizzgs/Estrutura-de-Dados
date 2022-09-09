public class Atleta {
    String Nome;
    Double Altura;
    Double Peso;
    String Esporte;
    String Patrocinador;

    public Atleta(String Nome, Double Altura, Double Peso, String Esporte, String Patrocinador) {
        this.Nome = Nome;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Esporte = Esporte;
        this.Patrocinador = Patrocinador;
    }

    public String toString() {
        return "" + Nome + "-" + Altura + "-" + Peso + "-" + Esporte + "-" + Patrocinador;
    }
}
