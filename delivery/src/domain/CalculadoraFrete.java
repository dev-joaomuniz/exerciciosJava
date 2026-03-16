package domain;

public class CalculadoraFrete {
    // Metodo estático que obtém valor por cada bairro
    // Umarizal e Nazaré retorna 5
    // CN retorna 15
    // Outros retorna 10

    public static int frete(String bairro) {
        if (bairro.equals("Umarizal") || bairro.equals("Nazaré")) {
            return 5;
        }
        if (bairro.equals("Cidade Nova")) {
            return 15;
        }
        return 10;
    }

}
