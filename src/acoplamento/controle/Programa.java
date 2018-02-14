package acoplamento.controle;

import java.util.Scanner;

public class Programa {
	private static Calculadora calc;
	
	public static void main(String[] args) {
		calc = new Calculadora();
		
		lerDados();
		mostraResultado();
	}

	private static void lerDados() {
		Scanner entrada = new Scanner(System.in);
		boolean	erro;
		
		do {
			try {
				System.out.println("Informe dados para N1: ");
				calc.setN1(Double.parseDouble(entrada.nextLine()));
				
				System.out.println("Informe dados para N2: ");
				calc.setN2(Double.parseDouble(entrada.nextLine()));
				
				entrada.close();
				erro = false;
			} catch (Exception e) {
				e.printStackTrace();
				erro = true;
			}
		} while (erro);
	}
	
	/* Neste caso, o cliente da classe Calculadora deve conhecer as variações de funcionamento do método */
	private static void mostraResultado() {
		System.out.println("Soma " + calc.calcula(Calculadora.OPSOMA));
		System.out.println("Subtracao " + calc.calcula(Calculadora.OPSUBTRACAO));
		System.out.println("Multiplicao " + calc.calcula(Calculadora.OPMULTIPLICACAO));
		System.out.println("Divisao " + calc.calcula(Calculadora.OPDIVISAO));
	}
	
}





















