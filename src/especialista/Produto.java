package especialista;

public class Produto {
	private String	nome;
	private double	preco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome != null && nome.length() > 0){
			this.nome = nome;
		}else{
			throw new Exception("Nome n�o pode ser nulo ou vazio");
		}
	}
	
	/* Classe de modelo que fornece alguns atributos
	 * 
	 * pre�o = � de acesso restrito e somente a classe Produto pode informar */
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) throws Exception {
		if(preco > 0){
			this.preco = preco;
		}else{
			throw new Exception("O pre�o deve ser maior que 0");
		}
	}
	
}














