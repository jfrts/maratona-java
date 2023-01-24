package github.jfrts.M001_introducao;

public class A0005_Arrays {

    public static void main(String[] args) {
        // byte, short, int, long, float e double: inicialização padrão é 0
        // char: '\u0000' representa um espaço em branco
        // boolean: false
        // String null

        int[] idades = new int[3];
        idades[0] = 19;
        idades[1] = 17;
        idades[2] = 30;

        // Iterar sobre os Arrays
        String[] nomes = new String[3];
        nomes[0] = "Nome0";
        nomes[1] = "Nome1";
        nomes[2] = "Nome2";

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}