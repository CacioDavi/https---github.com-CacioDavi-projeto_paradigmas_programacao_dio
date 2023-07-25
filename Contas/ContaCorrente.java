package Contas;
// ContaCorrente.java

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    // Implementação específica de saque para Conta Corrente
    @Override
    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta corrente de " + titular);
        } else {
            System.out.println("Saldo insuficiente para o saque na conta corrente de " + titular);
        }
    }
}

