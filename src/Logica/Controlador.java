package Logica;

public class Controlador {
	
	
	public void CriaConta(String login, String senha, String nome, String email, String endereco, String telefone){
		criarUsuario pessoa = null;
		try {
			pessoa = new criarUsuario(login, senha, nome, email, endereco, telefone);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
	}
}
