package Model;

import fuction.InternetBrowser;
import fuction.Music;
import fuction.TelephoneDevice;

public class Iphone implements Music, TelephoneDevice, InternetBrowser {

	public static void main(String[] args) {
		
		
		var iphone= new Iphone();
	    Music player= new Iphone();
	    TelephoneDevice phone = new Iphone();

		
	    player.selecionarMusica("Justin Bieber-Ghost");
		player.pausar();
		
		phone.ligar("223248-2142");
		phone.inciarCorreioVoz();
		phone.atender();
		
	    player.tocar();
		iphone.exiberPagina("Youtube.com");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();


	

	}

	
	
	
	
	
	@Override
	public void exiberPagina(String url) {
		System.out.println(""+url);
	}

	@Override
	public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
		
	}

	@Override
	public void atualizarPagina() {
        System.out.println("Página atualizada");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando "+numero);
		
	}

	@Override
	public void atender() {
        System.out.println("Atendendo ligação");
		
	}

	@Override
	public void inciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void tocar() {
        System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
        System.out.println("Pausando música");
		
	}

	@Override
	public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
		
	}

}
