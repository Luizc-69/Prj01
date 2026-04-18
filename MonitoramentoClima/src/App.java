import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(" -----Monitoramento do clima-----");
        
        Scanner entrada = new Scanner(System.in);
        double menortemperatura = 0;
        double somaTemperatura = 0;
        int contadorTemperatura = 0;
        int ordem = 1;

        System.out.print("Digite a " + ordem + "ª temperatura ou 999 para sair : ");
        double temperatura = entrada.nextDouble();
        if (temperatura != 999) {
            menortemperatura = temperatura;
            while (temperatura != 999) {
                somaTemperatura += temperatura;
                contadorTemperatura++;
                if (menortemperatura > temperatura) {
                    menortemperatura = temperatura;
                }

                ordem++;
                System.out.print("Digite a " + ordem + "ª temperatura (999 para sair): ");
                temperatura = entrada.nextDouble();
            }
            double media = somaTemperatura / contadorTemperatura;

            System.out.println("Total de temperaturas coletadas: " + contadorTemperatura);
            System.out.println(" Menor temperatura : " + menortemperatura + " º C");
            System.out.printf("A média de temperatura foi de: %.2f ºC\n", media);
        } else {
            System.out.println(" Nenhum dado foi inserido");
        }
        entrada.close();
    }
}
