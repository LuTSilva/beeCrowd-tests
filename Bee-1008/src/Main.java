import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        // Configuração do Locale para US para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Leitura do número do funcionário, horas trabalhadas e valor por hora
        Scanner sc = new Scanner(System.in);

        // Número do funcionário
        int numero = sc.nextInt();

        // Cálculo do salário
        int horas = sc.nextInt();
        double valor = sc.nextDouble();
        double salario = horas * valor;

        // Impressão do número do funcionário e do salário
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}
