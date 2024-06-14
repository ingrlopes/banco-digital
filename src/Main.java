public class Main {

    public static void main(String[] args) {
        Conta contaC = new ContaCorrente();
        Conta contaP = new ContaPoupanca();

        contaC.depositar(100);
        contaC.transferir(50, contaP);

        ((ContaCorrente) contaC).extrato();
        System.out.println(" ");
        ((ContaPoupanca) contaP).extrato();
    }
}