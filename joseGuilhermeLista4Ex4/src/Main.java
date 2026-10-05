import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] vendas = new double[5];

        double total = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o faturamento do dia "
                    + (i + 1) + ": R$ ");

            vendas[i] = scanner.nextDouble();

            total += vendas[i];
        }

        double media = total / 5;

        System.out.printf("%nFaturamento total: R$ %.2f%n", total);
        System.out.printf("Média diária: R$ %.2f%n", media);

        System.out.println("\nDias abaixo da média:");

        for (int i = 0; i < 5; i++) {

            if (vendas[i] < media) {
                System.out.printf("Dia %d ficou abaixo da média com R$ %.2f%n",
                        (i + 1), vendas[i]);
            }
        }

        scanner.close();
    }
}