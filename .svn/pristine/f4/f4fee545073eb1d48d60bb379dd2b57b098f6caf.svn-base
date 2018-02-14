package criador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* PADRÃO CRIADOR 
 * 
 * Quem cria instancia de x? ou, neste caso, quem cria instancia de itemVenda?
 * - atribuir a uma classe y a responsabilidade de criar uma instancia de x se uma das seguintes situaçãoes forem satisfatorias
 * 
 * - y contém ou agrega de forma composta
 * - y tem dados de iniciação de x
 * - y registra x
 * */
public class Venda {
	private List<ItemVenda>		itens; // A classe venda agrega objetos de itemVenda
	private Pagamento	pagamento;
	
	public Venda(){
		this.itens	= new ArrayList<>();
		this.pagamento = new Pagamento();
	}
	
	public void adicionaItem(Produto produto, int quantidade) throws Exception {
		if(produto != null){
			ItemVenda item = new ItemVenda(produto, quantidade);
			this.itens.add(item);
			System.out.println("produto adicionado com sucesso");
		}else{
			throw new Exception("Produto não pode ser nulo!");
		}
	}
	
	public void associarPagamento(Calendar dataVenc, Calendar dataPgto, double valor){
		this.pagamento.setDataVencimento(dataVenc);
		this.pagamento.setDataPagamento(dataPgto);
		this.pagamento.setValor(valor);
	}
	
	public void exibirDadosPagamento(){
		System.out.println("Data Vencimento: " + this.pagamento.getDataVencimento());
	}

	public List<ItemVenda> getItens() {
		return itens;
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}


























