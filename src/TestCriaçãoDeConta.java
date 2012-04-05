import junit.framework.Assert;

import org.junit.Test;


public class TestCriaçãoDeConta {

	@Test
	public void testaGetESet(){
		Pessoa p = null;	
		try {
				p = new Pessoa("guiga", "Guilherme", "guiga11@hotmail.com", "rio branco", "34313355");
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
