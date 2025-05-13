import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double gasto = 12;
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double resultado = (tempo * velocidade) / gasto;


        System.out.printf("%.3f\n", resultado );
        sc.close();
    }
}
