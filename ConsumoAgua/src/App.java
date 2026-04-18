
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(" ******* Uso consciente da Agua********");
        Scanner entrada = new Scanner(System.in);

        double consumoideal = 110;

        System.out.printf("Informe o consumo total em (l): ");
        double consumoTotal = entrada.nextDouble();
        System.out.print("Informe a quantidade moradores: ");
        int qtdemoradores = entrada.nextInt();

        double media = consumoTotal / qtdemoradores;
        System.out.printf(" O Consumo é foi de: %.1f l\n " , media);

        if (media < consumoideal) {
            System.out.println(" Parabens !!! Consumo consciente.");
        } else {
            System.out.println("Consumo elevado, reduza o tempo no banho.");
        }
        entrada.close();
        System.out.println("---- Fim do programa-----");

    }
}
