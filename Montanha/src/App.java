import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Calculo de IMC");
        double peso;
        double altura;
        double imc;
        String resultadoCalculo;
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Digite Peso (kg");
        peso = entrada.nextDouble();
        System.out.println(" Digite Altura (kg");
        altura = entrada.nextDouble();
        entrada.close();
        imc = peso / (altura * altura);
        if(imc < 18.5){
            resultadoCalculo = "Abaixo do peso";  
        } else if (imc >= && imc < 25){
            resultadoCalculo = " Peso norma";
        }    
            else if(imc >=25 && imc <30){
            resultadoCalculo = "Sopreso";
            }else {
           resultadoCalculo = "Obesidade";
            }


        

    }
}
