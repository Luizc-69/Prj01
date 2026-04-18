import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("**** Bilheteria Automatizada ****");
        Scanner entrada = new Scanner(System.in);

        double ingresso = 40.00;
        double descontoCrianca = 0.25;
        double descontoIdoso = 0.5;
        int idade;

        System.out.print(" Informe sua idade: ");
        idade = entrada.nextInt();

        if( idade <12){
            System.out.printf(" o valor do seu ingresso é %.2f\n : ", ingresso - ingresso * descontoCrianca );
        }
        else if (idade > 60){
            System.out.printf(" O valor do seu ingresso é %.2f\n: ", ingresso -  ingresso *descontoIdoso);

        } else {
            System.out.printf(" O valor do seu ingresso é %.2f\n : ", ingresso);
        }
        entrada.close();
        System.out.println(" -----Fim do programa----");
        




    }
}
