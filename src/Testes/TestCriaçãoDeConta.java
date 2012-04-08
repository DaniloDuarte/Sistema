package Testes;
import junit.framework.Assert;

import org.junit.Test;

import Logica.criarUsuario;


public class TestCriaçãoDeConta {

	@Test
	public void testaGetESet(){
		criarUsuario p = null;	
		try {
				p = new criarUsuario("guiga", "guigoso", "Guilherme", "guiga11@hotmail.com", "rio branco", "34313355");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				p.setLogin(null);
				Assert.fail("Nao deveria puder");
			} catch (Exception e) {
				Assert.assertEquals("usuario invalido!", e.getMessage());
			}
	}
}
