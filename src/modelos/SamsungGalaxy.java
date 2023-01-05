package modelos;

import interfaces.AparelhoTelefonico;

public class SamsungGalaxy implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando Samsung Galaxy!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no Samsung Galaxy!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Samsung Galaxy!");
    }
}
