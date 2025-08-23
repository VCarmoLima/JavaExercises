import java.util.Scanner;

public class B_ArithMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Qual é o segundo número? ");
        double numeroDois = scanner.nextDouble();

        double soma = numeroUm + numeroDois;
        double media = soma / 2;

        System.out.printf("A média aritmética desses dois números é de %s%n", media);

        scanner.close();
    }
}