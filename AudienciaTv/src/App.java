import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);

        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalGeral = 0;
        int canal, pessoas;

        System.out.println("--- Pesquisa de Audiência TV ---");

        while (true) {
            System.out.print("Informe o número do canal (4, 5, 7, 12) ou 0 para encerrar: ");
            canal = leitor.nextInt();
           
            if (canal == 0) {
                break;
            }

            System.out.print("Informe o número de pessoas assistindo: ");
            pessoas = leitor.nextInt();
            
            switch (canal) {
                case 4:
                    canal4 += pessoas;
                    totalGeral += pessoas;
                    break;
                case 5:
                    canal5 += pessoas;
                    totalGeral += pessoas;
                    break;
                case 7:
                    canal7 += pessoas;
                    totalGeral += pessoas;
                    break;
                case 12:
                    canal12 += pessoas;
                    totalGeral += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido! Apenas 4, 5, 7 ou 12.");
            }
        }
        
        System.out.println("\n--- Resultado Final ---");
        if (totalGeral > 0) {
            System.out.printf("Canal 4:  %.2f%% de audiência.\n", (canal4 * 100.0) / totalGeral);
            System.out.printf("Canal 5:  %.2f%% de audiência.\n", (canal5 * 100.0) / totalGeral);
            System.out.printf("Canal 7:  %.2f%% de audiência.\n", (canal7 * 100.0) / totalGeral);
            System.out.printf("Canal 12: %.2f%% de audiência.\n", (canal12 * 100.0) / totalGeral);
        } else {
            System.out.println("Nenhum dado de audiência foi registrado.");
        }
        System.out.println("Total de pessoas entrevisadas foram de: " + totalGeral + " pessoas");

        leitor.close();

       
    }
}
