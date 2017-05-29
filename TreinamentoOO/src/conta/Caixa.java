package conta;

public class Caixa implements Atendimento {
	
	private Conta conta;
	
	public Caixa (Conta conta){
		this.conta = conta;
	}

	@Override
	public void sacar(double valorSaque) {
		conta.sacar(valorSaque);		
	}

	@Override
	public void depositar(double valor) {
		conta.depositar(valor);
		System.out.println("Operação efetuada com sucesso!");		
	}

	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo é " + conta.getSaldo());		
	}
	
}
