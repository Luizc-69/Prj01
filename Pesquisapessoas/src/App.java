import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int pessoas = 10;
        int somaIdades = 0;
        int contPesoAltura = 0;      
        int contPessoasMais190 = 0;  
        int contJovensMais190 = 0;     
        
        for (int i = 1; i <= pessoas; i++) {
            System.out.println("Dados da " + i + "ª pessoa:");

            System.out.print("Idade: ");
            int idade = leitor.nextInt();

            System.out.print("Peso (kg): ");
            double peso = leitor.nextDouble();

            System.out.print("Altura (m): ");
            double altura = leitor.nextDouble();
            
            somaIdades += idade;
            
            
            if (peso > 90 && altura < 1.50) {
                contPesoAltura++;
            }
            
            if (altura > 1.90) {
                contPessoasMais190++;
                if (idade >= 10 && idade <= 30) {
                    contJovensMais190++;
                }
            }
            
            System.out.println("--------------------------");
        }
        
        double mediaIdades = somaIdades / pessoas;
        
        double porcentagem = 0;
        if (contPessoasMais190 > 0) {
            porcentagem = (contPessoasMais190 * 100) / pessoas ;
        }

        System.out.println(" A media de idades das pessoas é de: " + mediaIdades);
        System.out.println("O percentual de jovens com mais de 1,90 cm é de: " + porcentagem + "%");

        leitor.close(); 
    }
       
}
       
    

