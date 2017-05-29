package conta;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente, double saldoInicial){
		super(cliente,saldoInicial);
		validarAberturaConta();
	}
	
	private void validarAberturaConta(){
		if (getCliente().getIdade() < 18){
			//System.out.println("Não é possível realizar a abertura da conta, pois o cliente tem " + cliente.idade + " anos");
			throw new IllegalArgumentException("Não é possível realizar a abertura da conta, pois o cliente tem " + getCliente().getIdade() + " anos");
		}else{
			System.out.println("Abertura de conta realiza com sucesso.");
		}
	}
	
	@Override
	public void sacar(double valorSaque) {
		super.sacar(valorSaque+(valorSaque*0.05));
	}

}
