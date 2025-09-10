package Exercicios;

public class CalculoPrincipal {

	public static void main(String[] args) {
	        Calculando c = new Calculando();

	        System.out.println("Soma: " + c.somar(10, 5));
	        System.out.println("Subtração: " + c.sub(10, 5));
	        System.out.println("Multiplicação: " + c.mult(10, 5));
	        System.out.println("Divisão: " + c.div(10, 5));
	        System.out.println("Exponenciação: " + c.exp(2, 4));
	}

}
