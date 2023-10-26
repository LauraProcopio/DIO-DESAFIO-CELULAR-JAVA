package Internet;

public class AtributosNavegador implements NavegadorInternet {

 
    public void adicionarPagina(String url, String novaPagina) {
        System.out.println("Adicionando nova Página: " + url);
        novaPagina = url; 
    }


	public void pagina(String url) {
		if(url != null) {
			System.out.println("Exibindo página: "+ url);
		}else {
			System.out.println("Nenhuma Pagina Encontrada.");
		}
		
	}

	
	public void autalizarPagina(String url) {
		 if (url != null) {
	            System.out.println("Atualizando página: " + url);
	        } else {
	            System.out.println("Nenhuma página carregada para atualizar"); 
	        }
		
	}
}