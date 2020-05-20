package application.test;

import org.junit.Assert;
import org.junit.Test;

import application.core.baseTest;
import application.page.menuPage;
import application.page.splashPage;

public class splashTest extends baseTest {

	private menuPage menu = new menuPage();
	private splashPage page = new splashPage();
	
	@Test
	public void testSplash() {
		//Acessar Menu Splash
		menu.acessarMenuSplash();
		
		//Verificar exibição do splash
		page.textoSplashVisivel();
		
		//Aguardar saída do splash
		page.textoSplashInvisivel();
		
		//Verificar o fomulário
		Assert.assertTrue(page.checkElementoTexto("Splash!"));
	}
	
}