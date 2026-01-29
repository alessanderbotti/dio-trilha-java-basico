package DesafioPOO;

public class Usuario {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar("555-5555");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://pt.wikipedia.org/wiki/Veganismo");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
