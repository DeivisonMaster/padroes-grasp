package especialista;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* PADRÃO ESPECIALISTA
 * 
 * - qual o principio básico para atribuição de responsabilidades a objetos?
 * atribuia responsabilidades a quem tenha informações necessárias para satisfaze-la
 * */
/* A classe Venda é especialista na informação ao total da venda pois conhece os itens que compõem uma venda */
public class Venda {
	private List<ItemVenda> itens;

	public Venda() {
		this.itens = new ArrayList<>();
	}

	public void adicionaItem(ItemVenda item) throws Exception {
		if (item != null) {
			this.itens.add(item);
			System.out.println("Item adicionado com sucesso");
		} else {
			throw new Exception("Item não pode ser nulo!");
		}
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	/* Calculo do total da venda
	 * 
	 * totalVenda = Soma de todos os subtotais de cada item da venda
	 */
	public double totalVenda() {
		double total = 0;
		for (ItemVenda item : itens) {
			total += item.obterSubTotal();
		}
		
		return total;
	}

}

















