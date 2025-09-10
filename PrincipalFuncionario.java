package Exercicios;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		JornadaFuncionario funcionario1 = new JornadaFuncionario((Long) 1, "Jere", "98845-1567", 178, "Rua A", 20.0, 160);
		HoristaFuncionario funcionario2 = new HoristaFuncionario(2, "Coni", "99835-2678", 890, "Rua B", 25.0, 100);
		JuridicaFuncionario funcionario3 = new JuridicaFuncionario(3, "Belly", "98879-1536", 345, "Rua C", 10000.0, 2500.0);

		System.out.println("Salário Jornada: R$" + funcionario1.calculaSalario());
		System.out.println("Salário Horista: R$" + funcionario2.calculaSalario());
		System.out.println("Salário Pessoa Jurídica: R$" + funcionario3.calculaSalario());

	}

}

