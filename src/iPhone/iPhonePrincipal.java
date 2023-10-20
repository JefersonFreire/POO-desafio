package iPhone;

public class  iPhonePrincipal {
    public static void main(String[] args){
        iPhone iphone = new iPhone();
        iphone.atender();
        iphone.ligar("169999999");
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica("musica");
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina("https://");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
