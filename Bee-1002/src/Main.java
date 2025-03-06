import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Configuração do Locale para US para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Leitura do raio do círculo
        Scanner sc = new Scanner(System.in);

        // Cálculo da área
        Double p = 3.14159;
        Double raio = sc.nextDouble();
        Double area = p * (raio * raio);

        // Impressão do cálculo da área
        System.out.printf("A=%.4f\n", area);

        sc.close();
    }
}
