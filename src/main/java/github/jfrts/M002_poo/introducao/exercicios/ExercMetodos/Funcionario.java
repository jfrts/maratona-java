package github.jfrts.M002_poo.introducao.exercicios.ExercMetodos;

import java.util.Arrays;

public class Funcionario {

    public String nome;
    public byte idade;
    public double[] salarios = new double[3];

    public double calculaMediaSalario() {
        double totalSalario = 0;
        for (double salario : salarios) {
            totalSalario += salario;
        }
        return totalSalario / salarios.length;
    }

    public void imprimeMediaSalario() {
        System.out.printf("A média salarial é de: %.2f\n\n", calculaMediaSalario());
    }

    public void imprimirClasse() {
        System.out.println("Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + Arrays.toString(salarios) + "]");
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Júlio";
        funcionario1.idade = 28;
        funcionario1.salarios[0] = 2000.0;
        funcionario1.salarios[1] = 5000.0;
        funcionario1.salarios[2] = 2000.0;
        funcionario1.imprimirClasse();
        funcionario1.imprimeMediaSalario();
    }

}
