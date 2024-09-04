public class App {
    public static void SequenciaFibonacci(int numInformado) {
        int seq = 0;
        int aux = 1;
        for (int i = 0; i > -1; i++) {
            if (seq == numInformado) {
                System.out.println("O número: " + numInformado + " pertence a sequência");
                System.exit(0);
            }
            if (seq > numInformado) {
                System.out.println("O número: " + numInformado + " não pertence a sequência");
                System.exit(0);
            }
            seq = aux + seq;
            aux = seq - aux;
        }
    }

    public static void main(String[] args) {
        System.out.println("Verificar Sequência Fibonacci");
        int numInformado = 50;
        SequenciaFibonacci(numInformado);
    }
}
