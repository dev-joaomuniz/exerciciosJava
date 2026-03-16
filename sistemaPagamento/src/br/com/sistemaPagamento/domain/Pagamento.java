package br.com.sistemaPagamento.domain;

public abstract class Pagamento {
    // Ter um metodo abstrato calcularValor, que seja implementado por diferentes classes
    // e cada uma tenha um comportamento diferente

    public abstract double calcularValor(double valorBase);

}
