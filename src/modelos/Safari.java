package modelos;

import interfaces.NavegadorDeInternet;

public class Safari implements NavegadorDeInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web no Safari!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web no Safari!");
    }
}
