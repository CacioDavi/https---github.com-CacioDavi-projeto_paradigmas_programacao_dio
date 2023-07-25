// SaqueAspect.aj
public aspect SaqueAspect {
    pointcut realizarSaquePointcut(ContaBancaria conta, double valor) :
        execution(* ContaBancaria.realizarSaque(double)) && target(conta) && args(valor);

    before(ContaBancaria conta, double valor) : realizarSaquePointcut(conta, valor) {
        if (valor > conta.getSaldo()) {
            System.out.println("Saldo insuficiente para o saque na conta de " + conta.getTitular());
        }
    }
}
