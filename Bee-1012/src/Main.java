
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Definindo Locale
        Locale.setDefault(Locale.US);

        // Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Calcular a área do triângulo retângulo que tem A por base e C por altura.
        double Triangulo = (A * C) / 2;

        // a área do círculo de raio C. (pi = 3.14159)
        final double pi = 3.14159;
        double Circulo = pi * Math.pow(C,2);

        // a área do trapézio que tem A e B por bases e C por altura.
        double Trapezio = ((A + B) * C) / 2;

        // a área do quadrado que tem lado B.
        double Quadrado = Math.pow(B,2);

        // a área do retângulo que tem lados A e B.
        double Retangulo = A * B;

        // Impressões
        System.out.printf("TRIANGULO: %.3f%n", Triangulo);
        System.out.printf("CIRCULO: %.3f%n", Circulo);
        System.out.printf("TRAPEZIO: %.3f%n", Trapezio);
        System.out.printf("QUADRADO: %.3f%n", Quadrado);
        System.out.printf("RETANGULO: %.3f%n", Retangulo);

        sc.close();
    }
}
