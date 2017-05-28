package conta;

public class TesteConta {
	
	public static void main (String[] args){
		
		Cliente joao = new Cliente ("João","01234567890",19);
		System.out.println("O nome do cliente é " + joao.getNome());
		System.out.println("A idade é " + joao.getIdade());
		
		ContaCorrente contaJoao = new ContaCorrente(joao,1000);
				
		contaJoao.sacar(940);
		contaJoao.mostrarSaldo();

		//contaJoao.mostrarSaldo();
		
		//Cliente maria = new Cliente ();
		//maria.nome = "Maria de Souza";
		//maria.cpf = "99999999999";
		//maria.idade = 21;
		
		//ContaCorrente contaMaria = new ContaCorrente();
		//contaMaria.cliente = maria;
		//contaMaria.validaraAberturaConta();
		//contaMaria.mostrarSaldo();
	}


}
