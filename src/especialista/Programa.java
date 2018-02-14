package especialista;

public class Programa {
	public static void main(String[] args) {
		Produto produto = new Produto();
		Venda venda = new Venda();
		
		try {
			produto.setNome("bolacha");
			produto.setPreco(2.50);
			ItemVenda item = new ItemVenda(produto);
			item.setQuantidade(3);
			venda.adicionaItem(item);
			
			double totalVenda = venda.totalVenda();
			System.out.println("Total da venda: " + totalVenda);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
