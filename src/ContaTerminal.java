import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public String agencia;
    public String nomeCliente;
    public int numero;
    public double saldo;

    public static void main(String[] args) {
        // Criando scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // importando o objeto
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Seja bem-vindo(a) a nossa à Agência!");
        System.out.println("Insira seu dados!!");

        System.out.println("Por favor, digite o seu Nome Completo!: ");
        contaTerminal.nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!: ");
        contaTerminal.agencia = sc.next();

        System.out.println("Por favor, digite o número da sua Conta!: ");
        contaTerminal.numero = sc.nextInt();

        System.out.println("Por favor, digite o seu Saldo!: ");
        contaTerminal.saldo = sc.nextDouble();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma " +
                "conta em nosso banco, sua agência é " + contaTerminal.agencia +
                ", conta " + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo +
                " já disponível para saque");
    }
}
