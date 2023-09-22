import java.util.Scanner;

public class ContaTerminal {
    Scanner scanner = new Scanner(System.in);
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    public void definirTodos(){
        this.definirAgencia();
        this.definirNumero();
        this.definirCliente();
        this.definirSaldo();
    }

    private void definirAgencia(){
        System.out.println("Por favor, digite o número da Agência!");
        this.agencia = scanner.nextLine();
    }

    private void definirNumero(){
        System.out.println("Por favor, digite o número da Conta!");
        this.numero = scanner.nextInt();
        scanner.nextLine();  // limpar o buffer do scanner
    }

    private void definirSaldo(){
        System.out.println("Por favor, digite o saldo inicial!");
        this.saldo = scanner.nextFloat();
        scanner.nextLine();  // limpar o buffer do scanner
    }

    private void definirCliente(){
        System.out.println("Por favor, digite o nome do Cliente!");
        this.nomeCliente = scanner.nextLine();
    }

    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();

        conta.definirTodos();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.",
                conta.nomeCliente, conta.agencia, conta.numero, conta.saldo);
    }
}
