import java.util.Scanner;

public class E_BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        double alturaReal = altura * altura;
        double imcReal = peso/alturaReal;

        System.out.printf("O seu IMC é de: %s",  imcReal);

        sc.close();
    }
}
