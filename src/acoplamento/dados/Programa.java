package acoplamento.dados;

public class Programa {
	public static void main(String[] args) {
		/* ALTO ACOPLAMENTO - a aplicação deve conhecer o acoplamento para utilizar as classes aluno e notas */
		Notas notas = new Notas();
		Aluno aluno = new Aluno();
		
		notas.setN1(6);
		notas.setN2(7);
		notas.setN3(8);
		notas.setN4(9);
		
		aluno.setMatricula(123);
		aluno.setNome("fulano");
		aluno.setNotas(notas);
		
		// Saida
		String	saida	= "Matricula: " + aluno.getMatricula() + "\n" +
						  "Nome: " + aluno.getNome() + "\n" +
						  "Media: " + aluno.getMedia();
		
		System.out.println(saida);
		
		System.out.println("*************************************************************************************");
		
		/* BAIXO ACOPLAMENTO - a classe aluno apenas conhece um unico método: getMedia() */
		
		Notas2 notas2 = new Notas2();
		Aluno2 aluno2 = new Aluno2();
		
		notas2.setN1(3);
		notas2.setN2(4);
		notas2.setN3(8);
		notas2.setN4(9);
		
		aluno2.setMatricula(321);
		aluno2.setNome("fulano");
		aluno2.setNotas2(notas2);
		
		// Saida
		String	saida2	= "Matricula: " + aluno2.getMatricula() + "\n" +
						  "Nome: " + aluno2.getNome() + "\n" +
						  "Media: " + aluno2.getMedia();
		
		System.out.println(saida2);
	}
}


































