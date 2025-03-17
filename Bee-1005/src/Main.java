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
        double MEDIA = (A * 3.5 + B * 7.5) / 11;
        
        // Impressão da média calculada
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        
        sc.close();
    }
}