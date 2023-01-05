package modelos;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música no Ipod!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no Ipod!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Ipod!");
    }
}
