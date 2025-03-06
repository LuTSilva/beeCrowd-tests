import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
		
        // Leitura dos valores inteiros
        Scanner sc = new Scanner(System.in);
		
        // Cálculo da multiplicação dos valores inteiros
		int A = sc.nextInt();
		int B = sc.nextInt();
        int PROD = A * B;
		
        // Impressão do cálculo realizado
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}
}
