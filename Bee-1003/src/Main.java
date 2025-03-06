import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Leitura de dois valores inteiros
		Scanner sc = new Scanner(System.in);
		
		// Cálculo da soma dos valores inteiros
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = A + B;
		
		// Impressão da soma calculada
		System.out.println("SOMA = " + SOMA);
		
		sc.close();
	}
}