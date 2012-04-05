import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class Pessoa {
	
	private String login;
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	private ArrayList<Carona> caronas;
	private GerenciaDados gd;

	public Pessoa(String login, String nome, String email, String endereco, String telefone) throws Exception {
		gd = new GerenciaDados();
		gd.cadastraConta(this);
		
		setLogin(login);
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Carona> getCaronas() {
		return caronas;
	}
	
}
