import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua agência: ");
        String Agencia = sc.nextLine();
        System.out.println();

        System.out.println("Digite o número da sua conta: ");
        String numeroContaStr = sc.nextLine();
        int Numero = Integer.parseInt(numeroContaStr);
        System.out.println();

        System.out.println("Digite seu nome completo: ");
        String NomeCliente = sc.nextLine();
        System.out.println();

        System.out.println("Digite o valor do depósito inicial: ");
        String SaldoStr = sc.nextLine();
        double Saldo = Double.parseDouble(SaldoStr);

        sc.close();

        DadosCliente cliente = new DadosCliente(Numero, Agencia, NomeCliente, Saldo);

        System.out.println(cliente.toString());
    }
}