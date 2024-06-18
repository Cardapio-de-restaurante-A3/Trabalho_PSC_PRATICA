import java.util.ArrayList;
import java.util.List;

/**
 * Responsável por gerenciar os pedidos registrados.
 */
public class GuardaPedidos {
    private final List<Pedido> pedidos = new ArrayList<>(); // Lista de pedidos registrados

    /**
     * Adiciona um novo pedido à lista de pedidos.
     * @param pedido O pedido a ser adicionado.
     */
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Consulta um pedido na lista de pedidos pelo índice.
     * @param índice O índice do pedido a ser consultado.
     * @return O pedido encontrado ou null se não encontrado.
     */
    public Pedido consultarPedido(int índice) {
        if (índice >= 0 && índice < pedidos.size()) {
            return pedidos.get(índice);
        }
        return null;
    }

    /**
     * Consulta todos os pedidos registrados e exibe na tela.
     */
    public void consultarTodosPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos registrados.");
        } else {
            System.out.println("Lista de Pedidos:");
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println("Pedido " + (i + 1) + ":");
                System.out.println(pedidos.get(i));
            }
        }
    }

    /**
     * Consulta um pedido específico pelo número na lista de pedidos.
     * @param numero O número do pedido a ser consultado.
     */
    public void consultarPedidoUnico(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            System.out.println("Pedido " + numero + ":");
            System.out.println(pedidos.get(numero - 1));
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }

    /**
     * Cancela um pedido na lista de pedidos pelo índice.
     * @param índice O índice do pedido a ser cancelado.
     * @return O pedido cancelado ou null se não encontrado.
     */
    public Pedido cancelarPedido(int índice) {
        if (índice >= 0 && índice < pedidos.size()) {
            return pedidos.remove(índice);
        }
        return null;
    }

    /**
     * Retorna a lista de todos os pedidos registrados.
     * @return A lista de pedidos registrados.
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
