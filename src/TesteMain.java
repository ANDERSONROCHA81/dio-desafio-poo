import interfaces.AparelhoTelefonico;
import interfaces.NavegadorDeInternet;
import interfaces.ReprodutorMusical;
import modelos.Iphone;
import modelos.Ipod;
import modelos.Safari;
import modelos.SamsungGalaxy;

public class TesteMain {

    public static final String ANDERSON = "Anderson";

    public static void main(String[] args) {
        ReprodutorMusical ipod = new Ipod();
        AparelhoTelefonico samsungGalaxy = new SamsungGalaxy();
        NavegadorDeInternet safari = new Safari();
        ReprodutorMusical iphone1 = new Iphone(ANDERSON);
        AparelhoTelefonico iphone2 = new Iphone(ANDERSON);
        NavegadorDeInternet iphone3 = new Iphone(ANDERSON);

        ipod.pausar();
        ipod.selecionarMusica();
        ipod.tocar();

        iphone1.pausar();
        iphone1.selecionarMusica();
        iphone1.tocar();

        samsungGalaxy.atender();
        samsungGalaxy.ligar();
        samsungGalaxy.iniciarCorreioVoz();

        iphone2.atender();
        iphone2.ligar();
        iphone2.iniciarCorreioVoz();

        safari.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina();

        iphone3.adicionarNovaAba();
        iphone3.atualizarPagina();
        iphone3.exibirPagina();

    }
}
