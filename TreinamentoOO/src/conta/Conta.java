package conta;

public abstract class Conta {

	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente, double saldoInicial) { // Construtor, tem o nome da classe
		this.cliente = cliente;
		this.saldo = saldoInicial;
	}

	public void depositar(double valor) { // Método
		saldo = saldo + valor;
	}

	public void sacar(double valor) {
		if (valor > 1000.0) {
			throw new IllegalArgumentException("Limite para saque excedido");
		} else {
			if (saldo >= valor) {
				saldo = saldo - valor;
			} else {
				throw new IllegalArgumentException("Saldo insuficiente para saque. O saldo é " + saldo);
			}
		}
	}

	public void mostrarSaldo() {
		System.out.println("O saldo da conta é " + saldo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}
}
