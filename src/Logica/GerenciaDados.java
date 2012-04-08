package Logica;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class GerenciaDados {
	
	public void cadastraConta(criarUsuario pessoa){
		// Gravando no arquivo  
        File arquivo;  
 
        arquivo = new File("contas.txt");  
        FileOutputStream fos;
		String texto;
		try {
			fos = new FileOutputStream(arquivo, true);
			texto = pessoa.getLogin() + ";" + pessoa.getNome() + ";" + pessoa.getEmail() + ";" + pessoa.getEndereco() + ";" + pessoa.getTelefone();  
			fos.write(texto.getBytes());  
			fos.write(texto.getBytes());  
			fos.close();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

	public void cadastraCarona(criarUsuario pessoa) {
		//SE PESSOA JA TIVER CARONA CADASTRADA
		
		
		//SE PESSOA NAO TIVER CARONA CADASTRADA
		
		
	}
	
	
	
	
}
