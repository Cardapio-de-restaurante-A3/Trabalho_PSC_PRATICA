import java.util.List;

public class Pedido {
    private String cliente;
    private Hamburguer hamburguer;
    private Bebida bebida;
    private List<String> observacoes;
    private Pagamento pagamento;

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

    @Override
    public String toString() {
        return "Cliente: " + cliente +
                "\nHambúrguer: " + hamburguer.getNome() +
                "\nBebida: " + (bebida != null ? bebida.getNome() : "Nenhuma") +
                "\nObservações: " + (observacoes.isEmpty() ? "Nenhuma" : String.join(", ", observacoes)) +
                "\n" + pagamento;
    }
}