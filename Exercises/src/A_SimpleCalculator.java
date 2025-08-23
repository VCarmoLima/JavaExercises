import java.util.Scanner;

public class A_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        double soma = numeroUm + numeroDois;
        double subtracao = numeroUm - numeroDois;
        double divisao = numeroUm / numeroDois;
        double multiplicacao = numeroUm * numeroDois;

        System.out.printf("A soma da %s%n", soma);
        System.out.printf("A subtração da %s%n", subtracao);
        System.out.printf("A divisão da %s%n", divisao);
        System.out.printf("A multiplicação da %s%n", multiplicacao);

        scanner.close();
    }
}