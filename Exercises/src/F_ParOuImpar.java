import java.util.Scanner;

public class F_ParOuImpar {
    private Scanner sc;

    public F_ParOuImpar() {
        sc = new Scanner(System.in);
    }

    public String verificar(int num) {
        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public void saudacao(){
        System.out.println("Bem-vindo ao teste de paridade!");
    }

    public void despedida(){
        System.out.println("Obrigado por utilizar o teste de paridade!");
    }

    public void fecharSc(){
        sc.close();
    }

    public static void main(String[] args) {
        F_ParOuImpar parOuImpar = new F_ParOuImpar();

        parOuImpar.saudacao();
            do {
                System.out.print("Digite um número inteiro: ");
                int num = parOuImpar.sc.nextInt();

                String paridade = parOuImpar.verificar(num);

                System.out.println("O número " + num + " é " + paridade);

                System.out.print("Deseja fazer um novo teste de paridade? (Sim ou Não): ");
            } while (parOuImpar.sc.next().equalsIgnoreCase("Sim"));

            parOuImpar.despedida();
            parOuImpar.fecharSc();
    }
}