import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        int x = 60;
        int y = 90;
        int distancia = sc.nextInt();
        
        System.out.println(distancia * 2 + " minutos");

        sc.close();
    }
}
