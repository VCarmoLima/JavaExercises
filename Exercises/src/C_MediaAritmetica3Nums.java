import java.util.Scanner;

public class C_MediaAritmetica3Nums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o primeiro número?: ");
        double numeroUm = scan.nextDouble();
        System.out.print("Qual o segunda número?: ");
        double numeroDois = scan.nextDouble();
        System.out.print("Qual o terceiro número?: ");
        double numeroTres = scan.nextDouble();

        double soma = numeroUm + numeroDois + numeroTres;
        double media = soma / 3;

        System.out.printf("A média aritmética desses três números é de %s", media);

        scan.close();
    }
}
