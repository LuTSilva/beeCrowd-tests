import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Configuração do Locale para US para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Leitura de dois valores de ponto flutuante
        Scanner sc = new Scanner(System.in);
        
        // Cálculo da média
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0) / 10;
        
        // Impressão da média calculada
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        
        sc.close();
    }
}