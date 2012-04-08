package Logica;
import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class criarUsuario {
	
	private String login;
	private String senha;
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	private ArrayList<Carona> caronas;
	private GerenciaDados gd;

	public criarUsuario(String login, String senha, String nome, String email, String endereco, String telefone) throws Exception {
		gd = new GerenciaDados();
		gd.cadastraConta(this);
		
		setLogin(login);
		setSenha(senha);
		setNome(nome);
		setEmail(email);
		setEndereco(endereco);
		setTelefone(telefone);
		this.caronas = new ArrayList<Carona>();
	}

	public void cadastraCarona(String localOrigem, String localDestino, Date data, String horaDaSaida, int vagasDisponiveis){
		Carona carona = new Carona(localOrigem, localDestino, data, horaDaSaida, vagasDisponiveis);
		caronas.add(carona);
		gd.cadastraCarona(this);
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) throws Exception {
		if (login == null || login.equals("")){
			throw new Exception("usuario invalido!");
		}
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) throws Exception {
		if (senha == null || senha.equals("")){
			throw new Exception("senha invalido!");
		}
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (nome == null || nome.equals("")){
			throw new Exception("Nome invalido!");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		if (email == null || email.equals("")){
			throw new Exception("Email invalido!");
		}
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) throws Exception {
		if (endereco == null || endereco.equals("")){
			throw new Exception("Endereço invalido!");
		}
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws Exception {
		if (telefone == null || telefone.equals("")){
			throw new Exception("Telefone invalido!");
		}
		this.telefone = telefone;
	}

	public ArrayList<Carona> getCaronas() {
		return caronas;
	}


	
}
