import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu primeiro nome: ");
        String firstName = scanner.next();

        System.out.println("Agora, digite o seu sobrenome: ");
        String lastName = scanner.next();

        System.out.println("Agora digite o número de sua agencia (Exemplo: 000-0): ");
        String agencyNumber = scanner.next();

        System.out.println("Ótimo, agora digite o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Estamos finalizando, agora digite o valor do seu primeiro depósito: ");
        double cashDeposit = scanner.nextDouble();


        //Imprimindo o resultado com os dados fornecidos pelo cliente
        System.out.print("Olá " + firstName + " " + lastName + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencyNumber + ", o número da sua conta bancária é " + accountNumber + " e o seu saldo inicial de R$ " + cashDeposit + " já está disponível para saque.");



    }
}