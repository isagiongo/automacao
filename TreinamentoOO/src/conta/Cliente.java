package conta;

public class Cliente {
	
	private String nome;
	
	private String cpf;
	
	private int idade;
	
	public Cliente (String nome,String cpf, int idade){  //Construtor
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public int getIdade(){
		return idade;
	}
}
