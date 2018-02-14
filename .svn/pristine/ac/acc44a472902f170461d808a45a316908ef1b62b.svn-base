package acoplamento.dados;

/* Conceito aluno que agrega um objeto Notas 
 * 
 * ACOPLAMENTOS IDENTIFICADOS
 * 
 * método setNotas() que recebe um objeto por parametro
 * método getMedia() que faz uso de variaveis de outra classe para calcular a media
 * 
 * */
public class Aluno {
	private int matricula;
	private String nome;
	private Notas notas;

	
	public void setNotas(Notas notas) {
		if(notas != null)
			this.notas = notas;
	}
	
	public Notas getNotas() {
		return notas;
	}
	
	public float getMedia(){
		if(notas != null){
			return (notas.getN1() + notas.getN2() + notas.getN3() + notas.getN4()) / 4;
		}else{
			return 0;
		}
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
