package iPhone;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo chamada!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo á chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }
}
