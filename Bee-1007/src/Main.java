
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Leitura dos valores inteiros
        Scanner sc = new Scanner(System.in);

        // Calculo da diferença dos valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int DIFERENCA = (A * B - C * D);

        // Impressão do cálculo realizado
        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}
