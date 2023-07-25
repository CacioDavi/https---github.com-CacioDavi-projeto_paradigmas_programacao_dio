package Contas;
// ContaInvestimento.java

public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String titular, double saldo) {
        super(titular, saldo);
    }

    // Implementação específica de saque para Conta de Investimento
    @Override
    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta de investimento de " + titular);
        } else {
            System.out.println("Saldo insuficiente para o saque na conta de investimento de " + titular);
        }
    }
}