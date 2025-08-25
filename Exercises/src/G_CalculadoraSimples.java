import java.util.Scanner;

public class G_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES (4 OPERAÇÕES BÁSICAS)");
        System.out.println("SEJA BEM-VINDO!");

        boolean fazerOperacaoNovamente = true;
        int opcao;

        while (fazerOperacaoNovamente) {
            System.out.println("1 - Somar");

            System.out.println("2 - Subtrair");

            System.out.println("3 - Multiplicar");

            System.out.println("4 - Dividir");

            System.out.print("O que você deseja fazer? (0 para sair): ");
            opcao = scanner.nextInt();

            processar(opcao);

            System.out.print("Deseja fazer uma nova operação? (sim/não); ");
            String resposta = scanner.next().toLowerCase();
            fazerOperacaoNovamente = resposta.equals("s") || resposta.equals("sim");
        }

        scanner.close();
    }

    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1: {
                System.out.println("Somando dois números!");

                System.out.print("Qual o primeiro número a ser somado?: ");
                int numA = scanner.nextInt();

                System.out.print("Qual o segundo número a ser somado?: ");
                int numB = scanner.nextInt();

                int soma = numA + numB;

                System.out.println("A soma dos dois números informados, deu o resultado: " + soma);

                break;
            }
            case 2: {
                System.out.println("Subtraindo dois números!");

                System.out.print("Qual o primeiro número da subtração?: ");
                int numA = scanner.nextInt();

                System.out.print("Qual o segundo número da subtração?: ");
                int numB = scanner.nextInt();

                int subtracao = numA - numB;

                System.out.println("A subtração dos dois números informados, deu o resultado: " + subtracao);

                break;
            }
            case 3: {
                System.out.println("Multiplicando dois números!");

                System.out.print("Qual o primeiro número da multiplicação?: ");
                int numA = scanner.nextInt();

                System.out.print("Qual o segundo número da multiplicação?: ");
                int numB = scanner.nextInt();

                int multiplicacao = numA * numB;

                System.out.println("A multiplicação dos dois números informados, deu o resultado: " + multiplicacao);

                break;
            }
            case 4: {
                System.out.println("Dividindo dois números!");

                System.out.print("Qual o primeiro número da divisão?: ");
                double numA = scanner.nextInt();

                System.out.print("Qual o segundo número da divisão?: ");
                double numB = scanner.nextInt();

                if (numA == 0 && numB == 0) {
                    System.out.println("Não é possível dividir o zero por ele mesmo!");
                } else if (numA == 0) {
                    System.out.println("Sempre que o número zero for dividido por outro número, o resultado é zero!");
                } else if (numB == 0) {
                    System.out.println("Não é possível dividir um número por zero!");
                } else {
                    double divisao = numA / numB;
                    System.out.println("A divisão dos dois números informados, deu o resultado: " + divisao);
                }

                break;
            }
            default: {

            }
            scanner.close();
        }
    }
}