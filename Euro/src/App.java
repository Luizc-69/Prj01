import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double COTACA0 = 5.50;
        System.out.printf("Informe a quantidade de Euro: (E$) ");
        double valorEuro = leitor.nextDouble();
        double valorReal = valorEuro * COTACA0;
        System.out.printf(" O valor em reais é de: R$ %.2f%n" , valorReal);
        leitor.close();

    }
}
    