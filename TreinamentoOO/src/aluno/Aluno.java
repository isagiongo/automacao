package aluno;

public class Aluno {

	public String nome;
	
	public Notas notas;
	
	public void imprimirSituacao(){
		double media = notas.obtemMedia();
		
		if(media>=7){
			System.out.println("Aluno "+ nome + " Aprovado com média " + media);
		} else {
			System.out.println("Aluno " + nome + " Reprovado com média " + media);
		}
	}

	}

