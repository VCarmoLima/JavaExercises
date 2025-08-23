import java.util.Scanner;

public class D_GeoMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o primeiro número?: ");
        double numeroUm = scan.nextDouble();

        System.out.print("Qual é o segundo número?: ");
        double numeroDois = scan.nextDouble();

        System.out.print("Qual é o terceiro número?: ");
        double numeroTres = scan.nextDouble();

        double multiplicacao = numeroUm * numeroDois * numeroTres;
        double mediaGeo = Math.pow(multiplicacao, 1.0/3.0);

        System.out.printf("A média geométrica é de %s", mediaGeo);

        scan.close();
    }
}
