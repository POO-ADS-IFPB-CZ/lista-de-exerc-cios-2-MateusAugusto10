import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Informe o nome do titular: ");
        String titular = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para saque: ");
                    float saque = sc.nextFloat();
                    conta.sacar(saque);
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    float deposito = sc.nextFloat();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}