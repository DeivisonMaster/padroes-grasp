package acoplamento.controle;

/* ACOPLAMENTO DE CONTROLE 
 * 
 * ocorre quando flags são usados para que um objeto controle as etapas de processamento de outro objeto
 * */
public class Calculadora {
	private double n1;
	private double n2;
	public static final char OPSOMA = '+';
	public static final char OPSUBTRACAO = '-';
	public static final char OPMULTIPLICACAO = '*';
	public static final char OPDIVISAO = '/';

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	
	/* O parametro determina o funcionamento do método 
	 * - método tem muitas responsabilidades
	 * */
	public double calcula(char operador) {
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
		}
		return resultado;
	}
	
	
	
}
