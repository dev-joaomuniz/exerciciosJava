package br.com.sistemaNotificacoes.domain;

public class Notificacao {
    // Deve ter um objeto Mensagem e um TipoNotificacao
    // Bloco de inicialização imprime mensagem
    // Metodo para exibir titulo, corpo, descrição do tipo de envio e custo total
    private Mensagem mensagem;
    private TipoNotificacao tipoNotificacao;

    {
        System.out.println("\nGerando logs de envio");
    }

    public Notificacao(String titulo, String corpo, TipoNotificacao tipoNotificacao) {
        this.mensagem = new Mensagem(titulo, corpo);
        this.tipoNotificacao = tipoNotificacao;
    }

    public void exibir() {
        System.out.println("---" + mensagem.tituloMensagem() + "---\n");
        System.out.println(mensagem.corpoMensagem());
        System.out.println("\n" + tipoNotificacao.getDescricao());
        System.out.println("Custo da mensagem: R$ " + tipoNotificacao.getCUSTO());
    }

}
