package conta;

public class AutoAtendimento implements Atendimento {
	
	private Conta conta;
	
	public AutoAtendimento (Conta conta){
		this.conta = conta;
	}

	@Override
	public void sacar(double valorSaque) {
		conta.sacar(valorSaque);
	}

	@Override
	public void depositar(double valor) {
		conta.depositar(valor);
		System.out.println("Opera��o efetuada com sucesso!");
		System.out.println("Valor entrar� na conta em 24h.");
	}

	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo � " + conta.getSaldo());
		System.out.println("Comprovante impresso.");
	}

}
