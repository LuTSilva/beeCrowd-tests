import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int MaiorAB = (A + B + Math.abs(A - B)) / 2;
        MaiorAB = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

        System.out.println(MaiorAB + " eh o maior");

        sc.close();
    }
}
