package github.jfrts.poo.introducao.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char genero;

    @Override
    public String toString() {
        return "Estudante [nome=" + nome + ", idade=" + idade + ", genero=" + genero + "]";
    }

}
