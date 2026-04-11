import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int numero;
        int quantidadeP = 0;
        int somaPares = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite um numero ou (0) para terminar");

        while (true) {
            numero = entrada.nextInt();
            if (numero == 0)
                break;
        }
        if (numero % 2 == 0) {
            somaPares += numero;
            quantidadeP++;
        }
        if (quantidadeP > 0) {
            double media = somaPares / quantidadeP;
            System.out.println("Media da soma do pares é :" + media);

        } else {
            System.out.println(" Nenhum numero par foi inserido");
        }
        entrada.close();
        System.out.println("Fim de Programa");
    }
}
