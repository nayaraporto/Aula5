package Exercicios;

public class JornadaFuncionario extends Funcionario {

	private double salarioHora;
	private int horasTrabalhadas;

	public JornadaFuncionario(long id, String nome, String telefone, int matricula, String endereco, double salarioHora,
			int horasTrabalhadas) {
		super(id, nome, telefone, matricula, endereco);
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double calculaSalario() {
		return salarioHora * horasTrabalhadas;

	}
}