import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        double[] sensores = new double[5];
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        System.out.println("--- Registro de Temperaturas do Laboratório ---");

        
        for (int i = 0; i < sensores.length; i++) {
            System.out.print("Digite a temperatura do sensor " + (i + 1) + ": ");
            sensores[i] = entrada.nextDouble();
        }

        
        System.out.println("\n--- Temperaturas Registradas ---");
        for (int i = 0; i < sensores.length; i++) {
            System.out.println("Sensor " + (i + 1) + ": " + sensores[i] + "°C");
            soma += sensores[i];
        }

        double media = soma / sensores.length;

        System.out.println("--------------------------------");
        System.out.printf("Média Aritmética: %.2f°C\n", media);
        System.out.println("--------------------------------");

        entrada.close(); 

        
    }
}
