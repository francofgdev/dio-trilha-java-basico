import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();

		System.out.println("Por favor digite o número da Conta: ");
		int conta = sc.nextInt();

		System.out.println("Por favor digite o número da Agência: ");
		int agencia = sc.nextInt();

		System.out.println("Informe o seu nome: ");
		String nome = sc.next();
		sc.nextLine();

		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = sc.next();
		sc.nextLine();

		System.out.println("Informe o saldo inicial: ");
		double saldo = sc.nextDouble();

		sc.close();

		//imprimindo os dados obtidos pelo usuário

		System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco," + " sua agência é " + agencia + ", conta número " + conta + " e seu saldo de " + saldo + " já está disponível para saque!"  );

	}
}