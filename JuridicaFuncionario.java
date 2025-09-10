package Exercicios;

public class JuridicaFuncionario extends Funcionario{
	
	private double valorBruto;
	private double imposto;

	public JuridicaFuncionario(long id, String nome, String telefone, int matricula, String endereco,
	double valorBruto, double imposto) {
	super(id, nome, telefone, matricula, endereco);
	this.valorBruto = valorBruto;
	this.imposto = imposto;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImposto() {
		return imposto;
	}
	public double calculaSalario() {
	return valorBruto - imposto;

}}
