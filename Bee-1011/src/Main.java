
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Definindo Locale
        Locale.setDefault(Locale.US);

        // Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;
        double volume = (4/3.0)*pi*(R*R*R);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
