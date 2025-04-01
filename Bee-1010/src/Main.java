
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Definindo Locale
        Locale.setDefault(Locale.US);

        // Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int peca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valor = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);

        sc.close();

    }
}
