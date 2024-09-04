public class App {
    public static void VerificarLetraA(String letra) {
        int aMin = 0;
        int aMai = 0;
        int a = 0;
        for (char i : letra.toCharArray()) {
            if (i == 'a') {
                aMin++;
                a++;
            }
            if (i == 'A') {
                aMai++;
                a++;
            }
        }
        System.out.println("Há " + a + " a(s) na frase. " + aMai + " maiúscula e " + aMin + " minúscula.");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Verificar letra a na String");
        String letra = "Teclado Amavel Legal";
        VerificarLetraA(letra);
    }
}
