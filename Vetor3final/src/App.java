public class App {
    public static void main(String[] args) throws Exception {
        int[] notas = {10, 2, 5, 0, 8};
        int[] notas2 = new int[notas.length];
        int j = 0;

        System.out.println("Tamanho do vetor " + notas.length);
        printArray(notas);
        System.out.println("Imprimindo em ordem inversa");
        for (int i = (notas.length - 1);
             i >= 0;
             i--) {
            System.out.println(notas[i]);
        }
        /*
        Início do processdo de transferência de dados
        do vertor notas para o vetor notras2
        em ordem reversa
         */
        for (int i = (notas.length - 1);
             i >= 0;
             i--) {
            notas2[j] = notas[i];
            j++;
        }
        printArray(notas2);

         /*
            Início do processdo de transferência de dados
            do vertor notas para o vetor notras2
            em ordem reversa
            Usando menos variáveis
         */
        notas2 = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            notas2[notas.length - (i + 1)] = notas[i];
        }
        printArray(notas2);
    }

    public static void printArray(int[] dados) {
        System.out.println("Iniciando impressão:");

        // for each or enhanced for.
        for (int elemento : dados) {
            System.out.println(elemento);
    }
}
}