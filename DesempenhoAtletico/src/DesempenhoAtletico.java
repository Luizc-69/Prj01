import java.util.Scanner;

public class DesempenhoAtletico {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        double[] voltas = new double[8];
        double soma = 0;
    
        System.out.println("=== Sistema de Desempenho Atletico ===");
        for (int i = 0; i < voltas.length; i++) {
            System.out.print("Digite o tempo da volta " + (i + 1) + " (em segundos): ");
            voltas[i] = leitor.nextDouble();
            soma += voltas[i];
        }
    
        double media = soma / voltas.length;
        double melhorTempo = voltas[0]; 
        double piorTempo = voltas[0];  
        int voltasAbaixoDaMedia = 0;
        
        for (double tempo : voltas) {
            if (tempo < melhorTempo) {
                melhorTempo = tempo;
            }
            if (tempo > piorTempo) {
                piorTempo = tempo;
            }
            if (tempo < media) {
                voltasAbaixoDaMedia++;
            }
        }
      
        System.out.println("\n--- Relatório Final ---");
        System.out.printf("Melhor tempo: %.2fs\n", melhorTempo);
        System.out.printf("Pior tempo: %.2fs\n", piorTempo);
        System.out.println("Voltas abaixo da média (" + String.format("%.2f", media) + "s): " + voltasAbaixoDaMedia);
        
        System.out.println("\n--- Alertas de Bônus ---");
        boolean teveBonus = false;
        for (int i = 0; i < voltas.length; i++) {
            if (voltas[i] < 60) {
                System.out.println("Bônus de Performance Alcançado na volta " + (i + 1));
                teveBonus = true;
            }
        }

        if (!teveBonus) {
            System.out.println("Nenhum bônus alcançado nesta sessão.");
        }

        leitor.close();
    }
}
