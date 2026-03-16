package app;

import domain.Prato;
import domain.Pedido;

public class Main {
    public static void main(String[] args) {
        // Pratos típicos brasileiros
        Prato feijoada = new Prato("Feijoada", 35.0);
        Prato acaraje = new Prato("Acarajé", 20.0);
        Prato moqueca = new Prato("Moqueca", 40.0);
        Prato paoDeQueijo = new Prato("Pão de Queijo", 8.5);
        Prato brigadeiro = new Prato("Brigadeiro", 3.0);

        // Pedido 1 - Umarizal (frete 5)
        Pedido pedido1 = new Pedido(1, "Umarizal");
        pedido1.adicionarItens(feijoada, paoDeQueijo);

        // Pedido 2 - Cidade Nova (frete 15)
        Pedido pedido2 = new Pedido(2, "Cidade Nova");
        pedido2.adicionarItens(acaraje);

        // Pedido 3 - Outros (frete 10)
        Pedido pedido3 = new Pedido(3, "Belém");
        pedido3.adicionarItens(moqueca, brigadeiro);

        // Exibir resumos
        System.out.println("--- Resumos de Pedidos ---");
        pedido1.exibirResumo();
        pedido2.exibirResumo();
        pedido3.exibirResumo();
    }
}
