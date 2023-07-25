package Contas;
// ContaSalario.java

public class ContaSalario extends ContaBancaria {
    public ContaSalario(String titular, double saldo) {
        super(titular, saldo);
    }

    // Implementação específica de saque para Conta Salário
    @Override
    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta salário de " + titular);
        } else {
            System.out.println("Saldo insuficiente para o saque na conta salário de " + titular);
        }
    }
}