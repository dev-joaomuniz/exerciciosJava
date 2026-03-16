package br.com.sistemaPagamento.domain;

public class PagamentoBoleto extends Pagamento {
    // estende Pagamento e implementa metodo abstrato
    // PagamentoBoleto deve ter desconto de 10%

    @Override
    public final double calcularValor(double valorBase) {
        System.out.println("Calculando valor total no Boleto...");
        return valorBase - (valorBase * 0.1);
    }

}
