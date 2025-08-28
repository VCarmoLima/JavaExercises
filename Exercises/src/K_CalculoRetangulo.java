import java.util.Scanner;

public class K_CalculoRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = sc.nextDouble();

        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.printf("O perímetro do retângulo é de: %.2f%n",  perimetro);
        System.out.printf("A área do retângulo é de: %.2f", area);

        sc.close();
    }
}
