public class Pedido {
    // Atributos privados da classe Pedido
    private int numero;  // Número do pedido
    private String cliente;  // Nome do cliente
    private String item;  // Item do pedido

    // Construtor da classe Pedido
    public Pedido(int numero, String cliente, String item) {
        this.numero = numero;  // Inicializa o número do pedido
        this.cliente = cliente;  // Inicializa o nome do cliente
        this.item = item;  // Inicializa o item do pedido
    }

    // Método getter para o número do pedido
    public int getNumero() {
        return numero;
    }

    // Método getter para o nome do cliente
    public String getCliente() {
        return cliente;
    }

    // Método getter para o item do pedido
    public String getItem() {
        return item;
    }

    // Método toString para retornar uma representação em string do objeto Pedido
    public String toString() {
        // Retorna uma string no formato: Pedido{numero=NUM, cliente='NOME', item='ITEM'}
        return "Pedido{" + "numero=" + numero + ", cliente='" + cliente + '\'' + ", item='" + item + '\'' + '}';
    }
}
