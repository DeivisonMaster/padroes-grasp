package especialista;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* PADR�O ESPECIALISTA
 * 
 * - qual o principio b�sico para atribui��o de responsabilidades a objetos?
 * atribuia responsabilidades a quem tenha informa��es necess�rias para satisfaze-la
 * */
/* A classe Venda � especialista na informa��o ao total da venda pois conhece os itens que comp�em uma venda */
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
			throw new Exception("Item n�o pode ser nulo!");
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

















