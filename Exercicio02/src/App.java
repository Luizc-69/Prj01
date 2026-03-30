import java.util.Scanner;
// Luiz Andre Campos 
// matricula 1261947583
public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf(" Informe a medida do lado A: ");
        double ladoA = entrada.nextDouble();
        System.out.printf(" Informe a medida do lado B: ");
        double ladoB = entrada.nextDouble();
         System.out.printf(" Informe a medida do lado C: ");
        double ladoC = entrada.nextDouble();
        if(ladoA != ladoB && ladoB != ladoC)  {
            System.out.println(" Triangulo Escaleno");
        }   else if(ladoA == ladoB && ladoB == ladoC) {
            System.out.println( " Triangulo equilatero");
        } else {
            System.out.println(" Triangulo Isosceles");
        }
        entrada.close();
        
        
    }
}
