import java.util.Scanner;
// Luiz Andre Campos 
// matricula 1261947583
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o numero: ");
        int n = entrada.nextInt();
        if (n <= 0) {
            System.out.println("Valor inválido. numero deve ser maior que zero.");
        } else {
            int contador = 1;

            while (contador <= n) {
                System.out.println(contador);
                contador++; 
            }

            System.out.println("Contagem concluída.");
        }

        entrada.close();
    }

}
