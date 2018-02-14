package acoplamento.dados.internos;

/* ACOPLAMENTO DE DADOS INTERNOS
 * 
 * ocorre quando um objeto/classe consegue alterar valores de atributos de outro objeto/classe
 * a lógica implementada nos metodos de um objeto não garante o estado do objeto, outro objeto pode interferir
 * */
public class Produto {
	/* Dados public torna a classe vulnerável */
	public String	nome;
	public float	preco;
	public int estoque;
	
	
	public void maisEstoque(int quantidade){
		if(quantidade > 0){
			estoque = estoque + quantidade;
		}
	}
	
	public void menosEstoque(int quantidade){
		if(quantidade > 0){
			estoque = estoque - quantidade;
		}
	}
	
	
}
