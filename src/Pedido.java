import java.util.List;

/**
 * Representa um pedido feito por um cliente.
 */
public class Pedido {
    private String cliente; // Nome do cliente
    private Hamburguer hamburguer; // Hambúrguer do pedido
    private Bebida bebida; // Bebida do pedido
    private List<String> observacoes; // Observações adicionais ao pedido
    private Pagamento pagamento; // Informações de pagamento do pedido

    /**
     * Construtor para a classe Pedido.
     * @param cliente Nome do cliente que fez o pedido.
     * @param hamburguer Hambúrguer do pedido.
     * @param bebida Bebida do pedido.
     * @param observacoes Observações adicionais ao pedido.
     * @param pagamento Informações de pagamento do pedido.
     */
    public Pedido(String cliente, Hamburguer hamburguer, Bebida bebida, List<String> observacoes, Pagamento pagamento) {
        this.cliente = cliente;
        this.hamburguer = hamburguer;
        this.bebida = bebida;
        this.observacoes = observacoes;
        this.pagamento = pagamento;
    }
    // Getter e Setter para hamburguer
    public Hamburguer getHamburguer() {
        return hamburguer;
    }
    
    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    // Getter e Setter para bebida
    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    // Getter e Setter para observacoes
    public List<String> getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(List<String> observacoes) {
        this.observacoes = observacoes;
    }

    // Getter e Setter para pagamento
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * Retorna uma representação em string do pedido, incluindo informações sobre o cliente, hambúrguer, bebida, observações e pagamento.
     * @return Uma representação em string do pedido.
     */
    @Override
    public String toString() {
        return "Cliente: " + cliente +
                "\nHambúrguer: " + hamburguer.getNome() +
                "\nBebida: " + (bebida != null ? bebida.getNome() : "Nenhuma") +
                "\nObservações: " + (observacoes.isEmpty() ? "Nenhuma" : String.join(", ", observacoes)) +
                "\n" + pagamento;
    }
}