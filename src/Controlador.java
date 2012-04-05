
public class Controlador {
	public void CriaConta(String login, String nome, String email, String endereco, String telefone){
		Pessoa pessoa = null;
		try {
			pessoa = new Pessoa(login, nome, email, endereco, telefone);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
	}
}
