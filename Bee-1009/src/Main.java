import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Configuração do Locale para US para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Inicialização do Scanner
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados
        String vendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double salarioFinal = salarioFixo + (totalVendas * 0.15);

        // Impressão do salário final
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        sc.close();
    }
}
