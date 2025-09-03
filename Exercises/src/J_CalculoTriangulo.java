import java.util.Scanner;

public class J_CalculoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A do triângulo: ");
        double a = sc.nextDouble();
        System.out.print("Digite o lado B do triângulo: ");
        double b = sc.nextDouble();
        System.out.print("Digite o lado C do triângulo: ");
        double c = sc.nextDouble();
        System.out.print("Digite a altura H relativa ao lado B do triângulo: ");
        double h = sc.nextDouble();

        double perimetro = (a + b + c);
        double area = (b * h) / 2;

        System.out.printf("O perímetro do triângulo é: %s%n", perimetro);
        System.out.printf("A área do triângulo é: %s%n", area);


        sc.close();
    }
}
