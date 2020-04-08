package projetoJava.classesAuxiliares;

import projetoJava.interfaces.PermitirAcesso;

/*possui a função de receber quem possuir o contrato da interface PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
	/*public boolean autenticacaoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}*/
	
	/*fazer de forma mais amarrada*/
	private PermitirAcesso permitirAcesso;
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
}
