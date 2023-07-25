package Contas;

// ContaBancaria.java
public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Método abstrato para realizar o saque, que será implementado nas subclasses
    public abstract void realizarSaque(double valor);
}
