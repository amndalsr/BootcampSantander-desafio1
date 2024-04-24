import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        int numConta = scanner.nextInt();

        System.out.print("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
