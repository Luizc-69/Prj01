public class App {
    public static void main(String[] args)  {
       int[] notas = {10,2,5,0,8};
       System.out.println(" Tamanho do Vetor " + notas.length);
       for( int i= 0; i < notas.length; i++){
        System.out.println(notas[i]);
       }
       System.out.println(" Tamanho do Vetor " + notas.length);
       for( int i= 4; i >= 0; i--){
        System.out.println(notas[i]);
       }
    }
}
