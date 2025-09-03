import java.util.Scanner;

public class G_AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da raio: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é:  %.2f", area);

        sc.close();
    }
}
