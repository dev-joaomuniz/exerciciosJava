package domain;

public class Pedido {
    // Cada pedido deve ter id, lista de itens e taxa de entrega
    // Construtor recebe id e taxa de entrega
    // Metodo adicionar itens usando varArgs
    // Metodo calcular total do pedido
    // Metodo exibir resumo (Mostra id, lista de pratos e valor final)

    private int id;
    private Prato[] itens;
    private double taxaEntrega = 0;

    public Pedido(int id, String nomeBairro) {
        this.id = id;
        this.taxaEntrega = CalculadoraFrete.frete(nomeBairro);
    }

    public void adicionarItens(Prato... pratos) {
        itens = new Prato[pratos.length];
        int i = 0;
        for (Prato prato : pratos) {
            itens[i] = prato;
            i ++;
        }
    }

    public double calcularTotalPedido() {
        double totalPedido = 0;
        for (Prato prato : itens) {
            totalPedido += prato.getPreco();
        }
        totalPedido += taxaEntrega;
        return totalPedido;
    }

    public void exibirResumo() {
        System.out.println("\n------------------------------");
        System.out.println("Id do produto: " + id);
        System.out.println("Lista de Pratos: ");
        for (Prato prato : itens) {
            System.out.println("|" + prato.getNome() + " - R$ " + prato.getPreco() + "|");
        }
        System.out.println("\nValor do pedido: R$ " + calcularTotalPedido());
        System.out.println("------------------------------");
    }

}
