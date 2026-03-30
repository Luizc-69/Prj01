import java.util.Scanner;
// Luiz Andre Campos 
// matricula 1261947583
public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        System.out.printf(" entre com o primeiro numero: ");
        double n1 = entrada.nextDouble();
        System.out.printf(" entre com o segundo numero ");
        double n2 = entrada.nextDouble();
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Código: ");
        int codigo = entrada.nextInt();
        switch(codigo){
            case 1: 
            System.out.println(" Adiçao " + (n1 + n2));
            break;
            case 2: 
            System.out.println( " Subtração" +(n1 - n2));
            break;
            case 3:
            System.out.println("Multiplicação" + (n1 * n2));
            break;
            case 4: 
            if( n2 != 0){
                System.out.println("Divisao " + (n1 / n2));
            }else {
                System.out.println(" Erro não e possivel duvidir por zero!!!"); 
            }
                break;
                default:
                System.out.println(" Operação invalida");

        }
            entrada.close();
        
    }
}
