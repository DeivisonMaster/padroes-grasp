package acoplamento.dados;

public class Aluno2 {
	private int matricula;
	private String nome;
	private Notas2 notas;

	
	public void setNotas2(Notas2 notas) {
		if(notas != null)
			this.notas = notas;
	}
	
	/* Agora a classe aluno s� precisa conhecer o valor retornado por Notas n�o seus atributos que podem mudar */
	public float getMedia() {
		if(notas != null)
			return notas.getMedia();
		else
			return 0;
	}
	
	public Notas2 getNotas2() {
		return notas;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
