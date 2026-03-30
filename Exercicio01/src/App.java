import java.util.Scanner;
// Luiz Andre Campos 
// matricula 1261947583
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf(" Entre com o numero: ");
        double numA = entrada.nextDouble();
        if( numA %2==0){
            System.out.printf(" Este numero é par");
        } else
        System.out.printf(" Este numero é impar");
        entrada.close();
    }
}
