import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- SIMULADOR DE METAS FINANCEIRAS ---");

        System.out.print("Digite o valor que já possui guardado (R$): ");
        double saldoAtual = leitor.nextDouble();

        System.out.print("Digite o valor do depósito mensal (R$): ");
        double depositoMensal = leitor.nextDouble();

        System.out.print("Digite o valor da sua meta final (R$): ");
        double metaFinal = leitor.nextDouble();

        int meses = 0;

        while (saldoAtual < metaFinal) {
            saldoAtual += depositoMensal;
            meses++;
        }

        System.out.println("\n--- RESULTADO DA SIMULAÇÃO ---");
        System.out.println("Meta atingida em: " + meses + " meses.");
        System.out.printf("Saldo final acumulado: R$ %.2f\n", saldoAtual);

        leitor.close();
    }
}
