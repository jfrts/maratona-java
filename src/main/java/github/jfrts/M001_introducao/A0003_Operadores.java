package github.jfrts.introducao;

public class A0003_Operadores {

    public static void main(String[] args) {
        int primeiroNumero = 10;
        int segundoNumero = 20;

        System.out.println(primeiroNumero + segundoNumero); // 10
        System.out.println("Valor: " + primeiroNumero + segundoNumero); // Valor: 1020
        System.out.println(primeiroNumero + segundoNumero + "Valor: "); // 1020Valor:

        // Operadores normais: / * % + -
        int resto = 21 % 7;
        System.out.println(resto);

        // Operadores Lógicos: > < >= <= != == && || (retorno sempre booleano)
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);

        // Operadores de atribuição: = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        // Operadores de incremento e decremento: ++ --
        double idade = 20;
        idade++;
        System.out.println(idade); // 21
        idade--;
        System.out.println(idade); // 20
        ++idade;
        System.out.println(idade); // 21
        --idade;
        System.out.println(idade); // 20
    }

}
