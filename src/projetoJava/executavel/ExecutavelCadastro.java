package projetoJava.executavel;

import javax.swing.JOptionPane;

import projetoJava.classes.Aluno;
import projetoJava.classes.Diretor;
import projetoJava.classes.Pessoa;
import projetoJava.classes.Secretario;
import projetoJava.classesAuxiliares.FuncaoAutenticacao;
import projetoJava.interfaces.PermitirAcesso;

public class ExecutavelCadastro {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alexandre");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Egidio");
		diretor.setRg("3333333333333");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setCpf("99999999999");
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		secretario.setNome("João");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno : " + aluno.salario());
		System.out.println("Salario do diretor : " + diretor.salario());
		System.out.println("Salario do secretario : " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		String login = JOptionPane.showInputDialog("Informe o login ?");
		String senha = JOptionPane.showInputDialog("Informe e senha ?");
		
		/*trabalha diretamente com o objeto*/
		/*secretario.setLogin(login);
		secretario.setSenha(senha);*/
		
		/*PermitirAcesso secretariet = new Secretario();
		
		if(secretariet.autenticar(login, senha)) {
			JOptionPane.showMessageDialog(null, "Acesso permitido");
		}*/
		
		/*FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();*/
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		PermitirAcesso permitirAcess = new Diretor(login, senha);
		
		/*if(permitirAcesso.autenticar()) {
			JOptionPane.showMessageDialog(null, "Acesso permitido");
		}*/
		
		/*if(autenticacao.autenticacaoJava(permitirAcesso)) {
			JOptionPane.showMessageDialog(null, "Acesso permitido");
		}*/
		
		/*fazer de forma mais amarrada*/
		if(new FuncaoAutenticacao(permitirAcesso).autenticar()) {
			JOptionPane.showMessageDialog(null, "Acesso permitido");
		}
		else if (new FuncaoAutenticacao(permitirAcess).autenticar()) {
			JOptionPane.showMessageDialog(null, "Acesso permitido, bem vindo Diretor");
		}
		else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	}
	
	/*exemplo de utilização do polimorfismo com um metodo genérico*/
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salario é de = " + pessoa.salario());
	}
}
