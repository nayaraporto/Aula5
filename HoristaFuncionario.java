package Exercicios;

public class HoristaFuncionario extends Funcionario{
	
	private double valorHora;
	private int quantidadeHoras;

	public HoristaFuncionario(long id, String nome, String telefone, int matricula, String endereco, double valorHora,
			int quantidadeHoras) {
    super(id, nome, telefone, matricula, endereco);
	this.valorHora = valorHora;
	this.quantidadeHoras = quantidadeHoras;
	}

	public double calculaSalario() {
	return valorHora * quantidadeHoras;

}
}