package Celular;
import Telefone.AparelhoTelefonico;
import Reprodutor.ReprodutorMusical;
import Internet.NavegadorInternet;

public class Funcoes implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    boolean ligado;

    public Funcoes() {
        ligado = false;
    }

    @Override
    public void ligar(String numeroTelefone) {
        if (!ligado) {
            System.out.println("Aparelho desligado. Não é possível ligar.");
        } else {
            System.out.println("Ligando para " + numeroTelefone);
        }
    }

    @Override
    public void atender() {
        if (ligado) {
            System.out.println("Atender");
        } else {
            System.out.println("Aparelho desligado. Não é possível fazer uma chamada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Iniciando o correio de voz. Aguarde mensagens.");
        } else {
            System.out.println("Aparelho desligado. Não é possível iniciar o correio de voz.");
        }
    }

    @Override
    public void tocar() {
        System.out.println("Play");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Música selecionada: " + nomeMusica);
    }

    @Override
    public void adicionarPagina(String url, String novaPagina) {
        System.out.println("Adicionando nova Página: " + url);
        novaPagina = url;
    }

    @Override
    public void pagina(String url) {
        if (url != null) {
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("Nenhuma Página Encontrada.");
        }
    }

    @Override
    public void autalizarPagina(String url) {
        if (url != null) {
            System.out.println("Atualizando página: " + url);
        } else {
            System.out.println("Nenhuma página carregada para atualizar");
        }
    }
}

