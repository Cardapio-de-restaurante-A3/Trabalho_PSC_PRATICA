import java.util.List;

/**
 * Representa um pedido feito por um cliente, contendo informações sobre o cliente, os itens do pedido,
 * as observações e o método de pagamento utilizado.
 */
public class Pedido {
    private String cliente;
    private Hamburguer hamburguer;
    private Bebida bebida;
    private List<String> observacoes;
    private Pagamento pagamento;

    /**
     * Construtor da classe Pedido.
     * @param cliente O nome do cliente que fez o pedido.
     * @param hamburguer O hambúrguer do pedido.
     * @param bebida A bebida do pedido.
     * @param observacoes As observações adicionais do pedido.
     * @param pagamento O método de pagamento utilizado no pedido.
     */
    public Pedido(String cliente, Hamburguer hamburguer, Bebida bebida, List<String> observacoes, Pagamento pagamento) {
        this.cliente = cliente;
        this.hamburguer = hamburguer;
        this.bebida = bebida;
        this.observacoes = observacoes;
        this.pagamento = pagamento;
    }

    /**
     * Obtém o hambúrguer do pedido.
     * @return O objeto Hamburguer representando o hambúrguer do pedido.
     */
    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    /**
     * Define o hambúrguer do pedido.
     * @param hamburguer O objeto Hamburguer representando o novo hambúrguer do pedido.
     */
    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    /**
     * Obtém a bebida do pedido.
     * @return O objeto Bebida representando a bebida do pedido.
     */
    public Bebida getBebida() {
        return bebida;
    }

    /**
     * Define a bebida do pedido.
     * @param bebida O objeto Bebida representando a nova bebida do pedido.
     */
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Obtém as observações adicionais do pedido.
     * @return Uma lista de strings contendo as observações do pedido.
     */
    public List<String> getObservacoes() {
        return observacoes;
    }

    /**
     * Define as observações adicionais do pedido.
     * @param observacoes Uma lista de strings contendo as novas observações do pedido.
     */
    public void setObservacoes(List<String> observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * Obtém o método de pagamento utilizado no pedido.
     * @return O objeto Pagamento representando o método de pagamento do pedido.
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * Define o método de pagamento do pedido.
     * @param pagamento O objeto Pagamento representando o novo método de pagamento do pedido.
     */
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * Retorna uma representação em string do pedido.
     * @return Uma string contendo as informações do pedido formatadas.
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