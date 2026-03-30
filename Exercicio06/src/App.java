import java.util.Scanner;
// Luiz Andre Campos 
// matricula 1261947583
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = entrada.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = n * multiplicador;

            System.out.println(n + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

        System.out.println("---------------------------");

        entrada.close();
    }
}
