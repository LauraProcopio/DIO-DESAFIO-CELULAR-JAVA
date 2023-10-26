package Telefone;

public class AtributosTelefone implements AparelhoTelefonico {

    boolean ligado;

    public AtributosTelefone() {
        ligado = false; 
    }

    public void ligar(String numeroTelefone) {
        if (!ligado) {
            System.out.println("Aparelho desligado. Não é possível ligar.");
        } else {
            System.out.println("Ligando para " + numeroTelefone);
        }
    }

    public void atender() {
        if (ligado) {
            System.out.println("Atender");
        } else {
            System.out.println("Aparelho desligado. Não é possível fazer uma chamada.");
        }
    }

    public void iniciarCorreioVoz() {
    	if (ligado) {
            System.out.println("Iniciando o correio de voz. Aguarde mensagens.");
        } else {
            System.out.println("Aparelho desligado. Não é possível iniciar o correio de voz.");
        }

    }
}
