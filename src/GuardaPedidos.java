import java.util.ArrayList;
import java.util.List;

/**
 * A classe GuardaPedidos representa uma coleção de pedidos.
 */
public class GuardaPedidos {
    private final List<Pedido> pedidos = new ArrayList<>();

    /**
     * Adiciona um pedido à lista de pedidos.
     *
     * @param pedido O pedido a ser adicionado.
     */
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Consulta um pedido pelo índice na lista de pedidos.
     *
     * @param index O índice do pedido na lista.
     * @return O pedido correspondente ao índice, ou null se não encontrado.
     */
    public Pedido consultarPedido(int index) {
        if (index >= 0 && index < pedidos.size()) {
            return pedidos.get(index);
        }
        return null;
    }

    /**
     * Consulta todos os pedidos na lista.
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
     * Consulta um pedido específico pelo número.
     *
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
     * Cancela um pedido pelo índice na lista de pedidos.
     *
     * @param index O índice do pedido na lista.
     * @return O pedido cancelado, ou null se não encontrado.
     */
    public Pedido cancelarPedido(int index) {
        if (index >= 0 && index < pedidos.size()) {
            return pedidos.remove(index);
        }
        return null;
    }

    /**
     * Obtém a lista de pedidos.
     *
     * @return A lista de pedidos.
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}