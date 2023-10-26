package Celular;

public class Iphone {

    public static void main(String[] args) {
     
        Funcoes iphone = new Funcoes();

       
        iphone.ligado = true;

      
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música 1");
        iphone.adicionarPagina("https://www.example.com", "Minha Página");
        iphone.pagina("https://www.example.com");
        iphone.autalizarPagina("https://www.example.com");
    }
}