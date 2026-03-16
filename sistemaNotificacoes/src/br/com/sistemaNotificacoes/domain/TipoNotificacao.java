package br.com.sistemaNotificacoes.domain;

public enum TipoNotificacao {
    // Constantes: SMS, EMAIL, PUSH.
    // Cada uma deve ter custo de envio e uma descrição
    SMS(0.15, "Envio por SMS"),
    EMAIL(0.10, "Envio por Email"),
    PUSH(0, "Envio por Push");

    private final double CUSTO;
    private final String descricao;

    TipoNotificacao(double CUSTO, String descricao) {
        this.CUSTO = CUSTO;
        this.descricao = descricao;
    }

    public double getCUSTO() {
        return CUSTO;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
