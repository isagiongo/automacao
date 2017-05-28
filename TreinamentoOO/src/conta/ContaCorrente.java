package conta;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente, double saldoInicial){
		super(cliente,saldoInicial);
		validarAberturaConta();
	}
	
	private void validarAberturaConta(){
		if (getCliente().getIdade() < 18){
			//System.out.println("N�o � poss�vel realizar a abertura da conta, pois o cliente tem " + cliente.idade + " anos");
			throw new IllegalArgumentException("N�o � poss�vel realizar a abertura da conta, pois o cliente tem " + getCliente().getIdade() + " anos");
		}else{
			System.out.println("Abertura de conta realiza com sucesso.");
		}
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor+(valor*0.05));
	}

}
