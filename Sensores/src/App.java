import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int totalLeituras = 0;
        double maiorPressao = 0.0;
        double somaPressoes = 0.0;

        System.out.println("--- SISTEMA DE SENSORES ---");
        System.out.println("Digite os valores de pressão (ou 0 para encerrar):");

        while (true) {
            System.out.print("Leitura do sensor: ");
            double pressao = leitor.nextDouble();

            if (pressao == 0) {
                break;
            }

            totalLeituras++;
            somaPressoes += pressao;

            if (totalLeituras == 1 || pressao > maiorPressao) {
                maiorPressao = pressao;
            }
        }

        if (totalLeituras > 0) {
            double mediaPressao = somaPressoes / totalLeituras;

            System.out.println("\n--- RELATÓRIO DE AUDITORIA FINAL ---");
            System.out.println("Total de leituras realizadas: " + totalLeituras);
            System.out.printf("Maior valor de pressão registrado: %.2f\n", maiorPressao);
            System.out.printf("Média das pressões lidas: %.2f\n", mediaPressao);
        } else {
            System.out.println("\nNenhum dado de pressão foi registrado.");
        }

        leitor.close();
    }
}
