import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[5];

        double soma = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();

            soma += temperaturas[i];
        }

        double media = soma / 5;

        System.out.printf("%nTemperatura média: %.2f°C%n", media);

        System.out.println("Dias acima da média:");

        for (int i = 0; i < 5; i++) {

            if (temperaturas[i] > media) {
                System.out.println("Dia " + (i + 1) + ": "
                        + temperaturas[i] + "°C");
            }
        }

        scanner.close();
    }
}