package acoplamento.dados.globais;

public class NovoPrograma {
	public static void main(String[] args) {
		NovoProduto	p1, p2, p3;
		EstoqueGeral estoqueGeral = new EstoqueGeral();
		
		
		p1 = new NovoProduto(estoqueGeral);
		p1.maisEstoque(10);
		
		p2 = new NovoProduto(estoqueGeral);
		p2.maisEstoque(20);
		
		p3 = new NovoProduto(estoqueGeral);
		//p3.maisEstoque(30);
		
		/* o valor do estoque geral agora é obtido a partir do objeto geral e não mais da classe produto como era feito anteriomente */
		System.out.println("Produto 1: " + p1.getEstoque());
		System.out.println("Produto 2: " + p2.getEstoque());
		System.out.println("Produto 3: " + p3.getEstoque());
		System.out.println("Estoque Geral: " + estoqueGeral.getEstoqueGeral());
		System.out.println("Instancias criadas de Produto: " + NovoProduto.total);
		
		p2.menosEstoque(15);
		System.out.println("Produto 2: " + p2.getEstoque());
		System.out.println("Produto Geral: " + estoqueGeral.getEstoqueGeral());
	}
}








































