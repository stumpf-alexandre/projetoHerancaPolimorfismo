package projetoJava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento 
				+ ", rg=" + rg + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai 
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" 
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	@Override/*identifica metodo sobrescrito ou mudar a regra de negocio*/
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba, aluno é maior de idade" : "Ixi você é menor de idade";
	}

	@Override
	public double salario() {
		return 1500.90;
	}
}