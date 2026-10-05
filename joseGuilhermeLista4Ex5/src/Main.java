import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] pesos = new double[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Digite o peso da caixa "
                    + (i + 1) + ": ");

            pesos[i] = scanner.nextDouble();
        }

        System.out.print("\nDigite o peso que deseja pesquisar: ");
        double pesoPesquisa = scanner.nextDouble();

        int quantidade = 0;

        for (int i = 0; i < 6; i++) {

            if (pesos[i] == pesoPesquisa) {
                quantidade++;
            }
        }

        if (quantidade > 0) {
            System.out.println("O peso foi encontrado "
                    + quantidade + " vez(es).");
        } else {
            System.out.println("Valor não localizado na amostragem");
        }

        scanner.close();
    }
}