package br.com.contratosEnergia.domain;

@FunctionalInterface
public interface ValidarContrato {
    // Deve ter metodo boolean para validar recebendo um double
    // Deve ser uma interface funcional

    boolean validar(double valor);

}
