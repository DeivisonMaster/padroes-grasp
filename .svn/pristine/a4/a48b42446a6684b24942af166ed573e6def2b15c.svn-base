package acoplamento.dados.globais;

/* ACOPLAMENTO DE DADOS GLOBAIS
 * 
 * dois ou mais objetos compartilham estruturas de dados globais 
 *  */
public class Produto {
	private String	nome;
	private int	estoque;
	private static int estoqueGeral;
	
	
	/* O dado global é alterado da mesma forma que um dado local */
	public void maisEstoque(int quantidade){
		if(quantidade > 0){
			this.estoque += quantidade;
			estoqueGeral += quantidade;
		}
	}
	public void menosEstoque(int quantidade){
		if(quantidade > 0){
			this.estoque -= quantidade;
			estoqueGeral -= quantidade;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	
	public static int getEstoqueGeral() {
		return estoqueGeral;
	}
	
}
