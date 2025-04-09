
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Definindo Locale
        Locale.setDefault(Locale.US);

        // Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double media = X / Y;

        System.out.printf("%.3f km/l\n", media);

        sc.close();
    }
}
