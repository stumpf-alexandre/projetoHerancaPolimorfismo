package projetoJava.interfaces;
/*essa interface sera o nosso contrato de autentica��o*/
public interface PermitirAcesso {
	public boolean autenticar();/*apenas declara��o do metodo*/
	
	public boolean autenticar(String login, String senha);
}