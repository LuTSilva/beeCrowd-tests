import java.util.Scanner;

// Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
// A seguir mostre a variável PROD com mensagem correspondente.

// O arquivo de entrada contém 2 valores inteiros.

// Imprima a mensagem "PROD" e a variável PROD, com um espaço em branco antes e depois da igualdade.

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int PROD  = A * B;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();

	}

}
