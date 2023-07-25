// Main.java

import Contas.ContaCorrente;
import Contas.ContaInvestimento;
import Contas.ContaPoupanca;
import Contas.ContaSalario;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("João", 1000.0);
        ContaSalario contaSalario = new ContaSalario("Maria", 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carlos", 2000.0);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Ana", 5000.0);

        contaCorrente.realizarSaque(200.0);
        contaSalario.realizarSaque(700.0);
        contaPoupanca.realizarSaque(3000.0);
        contaInvestimento.realizarSaque(7000.0);
    }
}
