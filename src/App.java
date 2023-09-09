import celulares.*;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone1 = new Iphone();
        
        iphone1.tocarMusica();
        iphone1.pausarMusica();
        iphone1.selecionarMusica("Been You");
        iphone1.fazerLigacao("(81)98888-8888");
        iphone1.atenderChamada();
        iphone1.iniciarCorreioVoz();
        iphone1.exibirPaginaWeb("www.exemplo.com");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
    }
}
