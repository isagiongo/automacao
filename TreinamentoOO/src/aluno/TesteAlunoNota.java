package aluno;

public class TesteAlunoNota {
	
	public static void main (String[] args){
		
		Aluno ivan = new Aluno();
		ivan.nome = "Ivan";
		Notas notasDoIvan = new Notas(); //instancia o objeto, aloca espaço na memória
		notasDoIvan.nota1 = 10; //recebe os valores
		notasDoIvan.nota2 = 9;
		notasDoIvan.nota3 = 8;
		ivan.notas = notasDoIvan;
		
		Aluno daniel = new Aluno();
		daniel.nome = "Daniel";
		Notas notasDoDaniel = new Notas();
		notasDoDaniel.nota1 = 8;
		notasDoDaniel.nota2 = 7;
		notasDoDaniel.nota3 = 6;
		daniel.notas = notasDoDaniel;
		
		System.out.println("Nome do aluno 1: " + ivan.nome );
		System.out.println("Nota 1: " + ivan.notas.nota1);
		System.out.println("Nota 2: " + ivan.notas.nota2);
		System.out.println("Nota 3: " + ivan.notas.nota2);
		ivan.imprimirSituacao();
		System.out.println("----------------------------");
		
		System.out.println("Nome do aluno 2: " + daniel.nome );
		System.out.println("Nota 1: " + daniel.notas.nota1);
		System.out.println("Nota 2: " + daniel.notas.nota2);
		System.out.println("Nota 3: " + daniel.notas.nota2);
		daniel.imprimirSituacao();
		System.out.println("----------------------------");
		
	}

}
