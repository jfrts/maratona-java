package github.jfrts.introducao;

public class A0002_TiposPrimitivos {

    public static void main(String[] args) {
        // Tipos primitivos vão guardar em memória um valor simples.
        // int, double, float, char, byte, short, long, boolean

        byte idade = 10;
        System.out.println("A idade é: " + idade);

        long numeroGrande = 1000000L;
        int numeroGrandeCasting = (int) 10000000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';

        // String é um reference type, então não é um tipo primitivo.
        // String é uma CLASSE.
        String nome = "Júlio Freitas";
        System.out.println(nome);
    }

}
