import java.util.Scanner;

public class F_PerimetroCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double perimetro = (2 * Math.PI) * raio;

        System.out.printf("O perímetro do círculo é de: %.2f%n", perimetro);

        sc.close();
    }
}