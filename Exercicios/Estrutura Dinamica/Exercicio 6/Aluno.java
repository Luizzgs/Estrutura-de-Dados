public class Aluno{
    String nome;
    int matricula;
    Double nota;
    String curso;

    public Aluno(String nome, int matricula, Double nota, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", matricula=" + matricula + ", nota=" + nota + ", curso=" + curso ;
    }

}