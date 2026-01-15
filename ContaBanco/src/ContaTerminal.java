import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o código da agência:");
        String codigoAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta (número natural, use somente dígitos):");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo (número racional, separe as casas decimais por '.' ao invés de ','):");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! O código de sua agência é " +
            codigoAgencia + ", o número de sua conta é " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque!");
    }
}
