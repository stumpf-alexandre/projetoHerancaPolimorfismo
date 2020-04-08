package projetoJava.classes;

import projetoJava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	/*implementando a interface no objeto diretor*/
	private String login;
	private String senha;
	
	public Diretor() {
	}
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento 
				+ ", rg=" + rg + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai 
				+ "registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao 
				+ ", titulacao=" + titulacao + "]";
	}

	@Override
	public double salario() {
		return 3900.78;
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("diretor") && senha.equals("diretor");
	}
}