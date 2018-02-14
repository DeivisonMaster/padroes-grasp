package criador;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		Venda venda = new Venda();
		Produto produto = null;

		try {
			produto = new Produto();
			produto.setNome("bolacha");
			produto.setPreco(2.50);
			venda.adicionaItem(produto, 2);

			produto = new Produto();
			produto.setNome("coca cola");
			produto.setPreco(1.50);
			venda.adicionaItem(produto, 2);
			
			List<ItemVenda> itens = venda.getItens();
			for (ItemVenda item : itens) {
				System.out.println(" ************ itens do carrinho ***********\n" 
						+ "Nome: " + item.getProduto().getNome() + "\n" 
						+ "Preço " + item.getProduto().getPreco() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
