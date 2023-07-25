package Contas;
// ContaPoupanca.java

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    // Implementação específica de saque para Conta Poupança
    @Override
    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta poupança de " + titular);
        } else {
            System.out.println("Saldo insuficiente para o saque na conta poupança de " + titular);
        }
    }
}