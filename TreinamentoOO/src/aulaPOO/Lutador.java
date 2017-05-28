package aulaPOO;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador (String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.setPeso(peso);
		this.altura = altura;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
	}
	
	public void apresentar(){
		System.out.println("Apresentamos o lutador "+ this.getNome());
		System.out.println("Diretamente da "+ this.getNacionalidade());
		System.out.println("com "+ this.getIdade()+ " anos");
		System.out.println("altura "+ this.getAltura()+" metros");
		System.out.println("e pesando "+ this.getPeso()+" quilos");
		System.out.println("com " + this.getVitorias() + " vitórias");
		System.out.println("e " + this.getDerrotas() + " derrotas");
		System.out.println("e " + this.getEmpates()+ " empates");
	}
	
	public void status(){
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias() + " / " + "Derrotas: " + this.getDerrotas() + " / " + "Empates: " + this.getEmpates());
	}
	
	public void ganharLuta(){
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void empatarLuta(){
		this.setEmpates(this.getEmpates()+1);
	}
	
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas()+1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.peso < 52.2){
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3){
			this.categoria = "Leve";			
		} else if (this.peso <= 83.9){
			this.categoria = "Médio";
		} else if (this.peso <= 120.2){
			this.categoria = "Pesado";
		}else{
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
	
	