import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       int numero;
        String continuar;
        Scanner teclado = new Scanner(System.in);
        System.out.println(".:: Tabuada .::");
        System.out.println("Digite o numero: ");
        numero = teclado.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(+numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("Deseja continuar? (S/N)");
        continuar = teclado.next();
        if (continuar.equalsIgnoreCase("S")) {
            main(args);
        }
        teclado.close();
        System.out.println("Fim do programa!");
        System.out.println("---------------------");
    }
    }
    
