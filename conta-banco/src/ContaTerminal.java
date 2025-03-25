import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = sc.nextInt();

        System.out.println("Digite o número da Conta: ");
         int conta = sc.nextInt();

         System.out.print("Informe o seu nome : ");
         String nome = sc.next();
         sc.nextLine();

         System.out.print("Informe o seu sobrenome : ");
         String sobrenome = sc.next();
              
         System.out.println("Informe o seu saldo inicial: ");
         Double saldo = sc.nextDouble();
         
         System.out.println();
         System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua Agência é %d, Conta número %d e seu saldo de %.2f já está disponível para saque!", nome, sobrenome, agencia, conta, saldo);

        sc.close();

    }
}