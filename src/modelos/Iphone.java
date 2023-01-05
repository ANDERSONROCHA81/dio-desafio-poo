package modelos;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorDeInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {

    private String nomeUsuario;

    public Iphone(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void ligar() {
        System.out.printf("Ligando o Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void atender() {
        System.out.printf("Atendendo chamada no Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.printf("Iniciando correio de voz no Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void exibirPagina() {
        System.out.printf("Exibindo página da web no Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.printf("Adicionando nova aba no navegador web do Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void atualizarPagina() {
        System.out.printf("Atualizando página da web no Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void tocar() {
        System.out.printf("Tocando música no Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void pausar() {
        System.out.printf("Pausando música no Iphone de %s!%n", this.nomeUsuario);
    }

    @Override
    public void selecionarMusica() {
        System.out.printf("Selecionando música no Iphone de %s!%n", this.nomeUsuario);
    }
}
