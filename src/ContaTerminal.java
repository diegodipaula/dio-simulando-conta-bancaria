import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static double balance = 0.0;
    private static String firstName;
    private static String lastName;
    private static String agencyNumber;
    private static int accountNumber;

    public static void main(String[] args) {
        createAccount();
        printAccountInfo();
    }

    public static void createAccount() {
        // Solicitando e armazenando os dados do usuário
        System.out.println("Por favor, digite o seu primeiro nome: ");
        firstName = scanner.next();

        System.out.println("Agora, digite o seu sobrenome: ");
        lastName = scanner.next();

        System.out.println("Agora digite o número de sua agencia (Exemplo: 000-0): ");
        agencyNumber = scanner.next();

        System.out.println("Ótimo, agora digite o número da conta: ");
        accountNumber = scanner.nextInt();

        System.out.println("Estamos finalizando, agora digite o valor do seu primeiro depósito: ");
        double cashDeposit = scanner.nextDouble();

        // Iniciaalizando o saldo da conta
        balance = cashDeposit;
    }

    //Implementando método para impressão das informações
    public static void printAccountInfo() {
        System.out.println("Olá " + firstName + " " + lastName + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencyNumber + ", o número da sua conta bancária é " + accountNumber + " e o seu saldo inicial de R$ " + balance + " já está disponível para saque.");
    }
}