package coesao.coincidente;

/* COESÃO LÓGICA
 * 
 * - a classe possui um metodo que executa um conjunto de funcoes relacionadas
 * 
 * 
 * */
public class Calculadora {
	private int	n1;
	private int n2;
	private static final char OPSOMA = '+';
	private static final char OPSUBTRACAO = '-';
	private static final char OPMULTIPLICACAO = '*';
	private static final char OPDIVISAO = '/';
	
	// Uma função é escolhida atraves de um parametro
	public double calcula(char operador){
		double resultado = 0;
		
		switch (operador) {
		case OPSOMA:
			resultado = n1 + n2;
			break;
		case OPSUBTRACAO:
			resultado = n1 - n2;
			break;
		case OPMULTIPLICACAO:
			resultado = n1 * n2;
			break;
		case OPDIVISAO:
			resultado = n1 / n2;
			break;
		default:
			break;
		}
		return resultado;
	}
	
	
	/* SOLUÇÃO 
	 * 
	 * quebrar em metodos menores e coesos ou seja, que façam somente o que lhes cabem a ser feito*/
	public double soma(){
		return n1 + n2;
	}
	
	public double subtrai(){
		return n1 - n2;
	}
	
	public double multiplica(){
		return n1 * n2;
	}
	
	public double divide(){
		return n1 / n2;
	}
}
