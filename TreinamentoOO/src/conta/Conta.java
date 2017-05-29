package conta;

public abstract class Conta {

	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente, double saldoInicial) { // Construtor, tem o nome da classe
		this.cliente = cliente;
		this.saldo = saldoInicial;
	}

	public void depositar(double valor) { // M�todo
		saldo = saldo + valor;
	}

	public void sacar(double valorSaque) {
		if (valorSaque > 1000.0) {
			throw new IllegalArgumentException("Limite para saque excedido");
		} else {
			if (saldo >= valorSaque) {
				saldo = saldo - valorSaque;
			} else {
				throw new IllegalArgumentException("Saldo insuficiente para saque. O saldo � " + saldo);
			}
		}
	}

	public void mostrarSaldo() {
		System.out.println("O saldo da conta � " + saldo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}
}
