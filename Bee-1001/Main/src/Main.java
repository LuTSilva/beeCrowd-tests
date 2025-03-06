import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        // Leitura dos valores inteiros
        Scanner sc = new Scanner(System.in);

        // Cálculo da soma dos valores
        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA = A + B;

        // Impressão da soma calculada
        System.out.println("X = " + SOMA);

        sc.close();
    }
}
