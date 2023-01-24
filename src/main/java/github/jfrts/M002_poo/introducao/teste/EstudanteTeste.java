package github.jfrts.poo.introducao.teste;

import github.jfrts.poo.introducao.dominio.Estudante;

public class EstudanteTeste {
    
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Júlio";
        estudante.idade = 28;
        estudante.genero = 'M';

        System.out.println(estudante);
    }

}
