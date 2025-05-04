public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if (valor > 10000) {
            System.out.println("Limite de saque excedido (R$ 10000).");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
        } else if (valor > 10000) {
            System.out.println("Limite de depósito excedido (R$ 10000).");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}