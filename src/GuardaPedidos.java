import java.util.ArrayList;
import java.util.List;

public class GuardaPedidos {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Pedido consultarPedido(int index) {
        if (index >= 0 && index < pedidos.size()) {
            return pedidos.get(index);
        }
        return null;
    }
     // Método para consultar todos os pedidos
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
     // Método para consultar um pedido específico pelo número
     public void consultarPedidoUnico(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            System.out.println("Pedido " + numero + ":");
            System.out.println(pedidos.get(numero - 1));
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }
    public Pedido cancelarPedido(int index) {
        if (index >= 0 && index < pedidos.size()) {
            return pedidos.remove(index);
        }
        return null;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
   
    
}