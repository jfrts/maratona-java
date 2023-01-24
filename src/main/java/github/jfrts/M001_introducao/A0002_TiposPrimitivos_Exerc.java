package github.jfrts.M001_introducao;

/**
 * Prática:
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
 */

public class A0002_TiposPrimitivos_Exerc {
    public static void main(String[] args) {
        String nome = "Júlio";
        String endereco = "Rua ..., 0, Centro";
        double salario = 3500;
        String data = "16/01/2023";

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salário de R$ %.2f, na data %s.",
                nome, endereco, salario, data);
    }

}
