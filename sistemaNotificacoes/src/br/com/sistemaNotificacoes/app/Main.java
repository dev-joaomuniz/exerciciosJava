package br.com.sistemaNotificacoes.app;

import br.com.sistemaNotificacoes.domain.Notificacao;
import br.com.sistemaNotificacoes.domain.TipoNotificacao;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacao1 = new Notificacao("Notificação 1", "Olá, mundo 1!", TipoNotificacao.SMS);
        notificacao1.exibir();

        Notificacao notificacao2 = new Notificacao("Notificação 2", "Olá, mundo 2!" , TipoNotificacao.EMAIL);
        notificacao2.exibir();

        Notificacao notificacao3 = new Notificacao("Notificação 3", "Olá, mundo 3!" , TipoNotificacao.PUSH);
        notificacao3.exibir();

    }
}
