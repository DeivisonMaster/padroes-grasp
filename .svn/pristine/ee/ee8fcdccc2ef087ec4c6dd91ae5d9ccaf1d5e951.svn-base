package acoplamento.controle;

import java.util.Scanner;

public class NovoPrograma {
	private static NovaCalculadora calc2;
	
	public static void main(String[] args) {
		calc2 = new NovaCalculadora();
		
		lerDados();
		mostraResultado();
	}
	
	private static void lerDados() {
		Scanner entrada = new Scanner(System.in);
		boolean	erro;
		
		do {
			try {
				System.out.println("Informe dados para N1: ");
				calc2.setN1(Double.parseDouble(entrada.nextLine()));
				
				System.out.println("Informe dados para N2: ");
				calc2.setN2(Double.parseDouble(entrada.nextLine()));
				
				entrada.close();
				erro = false;
			} catch (Exception e) {
				e.printStackTrace();
				erro = true;
			}
		} while (erro);
	}
	
	/* A classe cliente precisa apenas conhecer o método adequado a ser invocado */
	private static void mostraResultado() {
		System.out.println("Soma " + calc2.soma());
		System.out.println("Subtracao " + calc2.subtracao());
		System.out.println("Multiplicao " + calc2.multiplicacao());
		System.out.println("Divisao " + calc2.divisao());
	}
}
