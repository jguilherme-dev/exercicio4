import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        int filhos;
        int quantidadePessoas = 0;

        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        int pessoasAteUmSalarioMinimo = 0;

        double salarioMinimo = 1518.00;

        int continuar = 1;

        while (continuar == 1) {

            System.out.print("Digite o salário: ");
            salario = entrada.nextDouble();

            System.out.print("Digite o número de filhos: ");
            filhos = entrada.nextInt();

            quantidadePessoas++;

            somaSalarios = somaSalarios + salario;

            somaFilhos = somaFilhos + filhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= salarioMinimo) {
                pessoasAteUmSalarioMinimo++;
            }

            System.out.print("Digite 1 para continuar ou 2 para sair: ");
            continuar = entrada.nextInt();
        }

        double mediaSalario = somaSalarios / quantidadePessoas;
        double mediaFilhos = (double) somaFilhos / quantidadePessoas;

        double percentual = ((double) pessoasAteUmSalarioMinimo
                / quantidadePessoas) * 100;

        System.out.println("\n--- RESULTADO DA PESQUISA ---");

        System.out.println("Média do salário: R$ " + mediaSalario);
        System.out.println("Média de filhos: " + mediaFilhos);
        System.out.println("Maior salário: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salário de até "
                + "1 salário mínimo: " + percentual + "%");

        entrada.close();
    }
}