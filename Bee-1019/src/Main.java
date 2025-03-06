import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Leitura do tempo, em segundos
        int N = sc.nextInt();
		
        // Cálculo do tempo em horas, minutos e segundos
		int horas = N / 3600;
		int minutos = (N % 3600) / 60;
        int segundos = N % 60;
		
        // Impressão do tempo em horas, minutos e segundos
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}