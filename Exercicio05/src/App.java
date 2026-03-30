import java.util.Scanner;
// Luiz Andre Campos 
// matricula 1261947583
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero = 1;

        while (numero != 0) {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            soma += numero;
        }
        System.out.println("A soma total é: " + soma);
        System.out.println("Programa encerrado.");

        entrada.close();
    }
}
