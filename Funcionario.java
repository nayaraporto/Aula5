package Exercicios;
	
	public abstract class Funcionario {
		private long id;
		private String nome;
		private String telefone;
		private int matricula;
		private String endereco;

		public Funcionario(Long id, String nome, String telefone, int matricula, String endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
		}
		public long getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public String getTelefone() {
	        return telefone;
	       
		}

		public int getMatricula() {
			return matricula;
		}

		public String getEndereco() {
			return endereco;
		}

		public abstract double calculaSalario();
		}
	
		
		


