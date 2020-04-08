package projetoJava.classes;

public abstract class Pessoa {
	//os atributos não podem ser privados, por isso devem ser protected
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String rg;
	protected String cpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*Metodo abstrato obriga que as classes filhas que implementem as regras de negocio, diferente dos metodos comuns*/
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	/*reescrita de metodos*/
	/*manda um true caso a pessoa seja maior de 18 anos ou se for menor um false*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
}