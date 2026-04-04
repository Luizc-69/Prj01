import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite um número para ver a tabuada: ");
            int num = teclado.nextInt();

            System.out.println("\nTabuada de " + num + ":");
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.print("\nDeseja continuar? (s/n): ");
            continuar = teclado.next();

            System.out.println("------------------------------");

        } while (continuar.equalsIgnoreCase("s")); 
        
        System.out.println("\\n\\n.:| Fim do programa |:.");
        teclado.close();
    }
    }
    
