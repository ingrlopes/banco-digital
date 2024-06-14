public class ContaCorrente extends Conta {

    public void extrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.print(String.format("| Agência %d", this.agencia));
        System.out.print(String.format(" | Conta %d", this.numero));
        System.out.print(String.format(" | Saldo %.2f", this.saldo + " |"));
    }
}