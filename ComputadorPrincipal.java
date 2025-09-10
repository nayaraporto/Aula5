package Exercicios;

public class ComputadorPrincipal {
	
public static void main(String[] args) {
		
		Computador game1 = new Computadores();
		Computador home2 = new Computadores();
		

		game1.ligar();
		game1.reiniciar();
		game1.desligar();
		game1.carregandoSistema();
		
		System.out.println("");
		
		home2.ligar();
		home2.reiniciar();
		home2.desligar();
		home2.carregandoSistema();
		
		System.out.println("");
		

		

}}
