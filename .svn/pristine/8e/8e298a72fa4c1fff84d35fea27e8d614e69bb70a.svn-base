package acoplamento.dados.globais;

public class NovoProduto {
	public static int total = 0;
	private String	nome;
	private int	estoque;
	private EstoqueGeral estoqueGeral;
	
	
	public NovoProduto(EstoqueGeral geral){
		this.estoqueGeral = geral;
		total++;
	}
	
	/* O dado global é alterado da mesma forma que um dado local */
	public void maisEstoque(int quantidade){
		if(quantidade > 0){
			this.estoque += quantidade;
			estoqueGeral.maisEstoque(quantidade);
		}
	}
	public void menosEstoque(int quantidade){
		if(quantidade > 0){
			this.estoque -= quantidade;
			estoqueGeral.menosEstoque(quantidade);
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
	
	public EstoqueGeral getEstoqueGeral() {
		return estoqueGeral;
	}
}	
