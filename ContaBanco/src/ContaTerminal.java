import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite o número de sua Agência: ");
        String agencia = scanner.next();

        System.out.printf("Digite o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.printf("Digite o seu nome completo: ");
        String nome = scanner.next();

        System.out.printf("Digite o valor do seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia
                + ", o número de sua agencia é: " + numero + " e seu saldo atual disponível para saque é R$" + saldo);

    }
}
