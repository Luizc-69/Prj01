import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("**** Quality Control*****");
        Scanner entrada = new Scanner(System.in);

        int totalPecas = 15;
        int pecasDef = 0;
        int pecasAprov = 0;
        
        for(int i  = 1; i <= totalPecas; i++){
            System.out.printf(" Informe a nota da "+ i + "ª peça( 0 a 100): ");
            double nota = entrada.nextDouble();

            if( nota <70){
            pecasDef++;
            } else{
             pecasAprov ++;   
            }
        }
        double porcentagemAprovacao = ((double) pecasAprov / totalPecas) * 100;
        System.out.println(" Total de peças aprovadas: "+ pecasAprov);
        System.out.println(" Total de peças defeituosas: "+ pecasDef);

        System.out.printf(" A porcetagem de peças aprovadas é de: %.2f%%\n", porcentagemAprovacao);

        entrada.close();
        System.out.println("********* FIM DO PROGRAMA*******");
    }
}
