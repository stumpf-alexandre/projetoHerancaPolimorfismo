package projetoJava.interfaces;
/*essa interface sera o nosso contrato de autenticação*/
public interface PermitirAcesso {
	public boolean autenticar();/*apenas declaração do metodo*/
	
	public boolean autenticar(String login, String senha);
}