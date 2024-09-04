public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Valor da variável SOMA!");
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
            System.out.println(SOMA);
        }
        System.out.println("Soma = " + SOMA);
    }
}
