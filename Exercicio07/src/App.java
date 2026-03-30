import java.util.Scanner;
// Luiz Andre Campos
// Matricula 1261947583
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite a nota do aluno (0 a 100): ");
            nota = entrada.nextDouble();

            if (nota < 0 || nota > 100) {
                System.out.println("Nota invalida. Tente novamente.");
            }
        } while (nota < 0 || nota > 100);

        System.out.print("Conceito: ");
        
        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 75) {
            System.out.println("B");
        } else if (nota >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D (Reprovado)");
        }

        entrada.close();
    }
}
