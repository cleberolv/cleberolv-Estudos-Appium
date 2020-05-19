package application.page;

import org.openqa.selenium.By;

import application.core.basePage;

public class abasPage extends basePage {
	
	public String verificarAba1() {
		return obterTexto(By.xpath("//*[contains(@text, 'Aba 1')]"));
	}
	
	public String verificarAba2() {
		return obterTexto(By.xpath("//*[contains(@text, 'Aba 2')]"));
	}
	
	public void mudarAba() {
		clicarPorTexto("ABA 2");
	}
	
}
