package Reprodutor;

public class AtributosMusica implements ReprodutorMusical {

	@Override
	public void pausar() {
		System.out.println("pausar");
		
	}

	public void selecionarMusica(String nomeMusica) {
		System.out.println("Música selecionada: "+ nomeMusica);
		
	}

	@Override
	public void tocar() {
		System.out.println("play");
	}

	

}
