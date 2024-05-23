import java.util.ArrayList;

public class GuardaPedidos {
    ArrayList<String> pedidos;

    public GuardaPedidos() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String cliente, Hamburguer item) {
        pedidos.add("Cliente: " + cliente + "\nPedido: " + item);
    }

    public void consultarTodosPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println("Pedido #" + (i + 1) + " - " + pedidos.get(i).split("\n")[0]); // Mostra apenas o nome do cliente para seleção
            }
        }
    }

    public void consultarPedido(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            System.out.println("Pedido #" + numero + "\n" + pedidos.get(numero - 1));
        } else {
            System.out.println("Número do pedido inválido.");
        }
    }

    public void cancelarPedido(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            pedidos.remove(numero - 1);
            System.out.println("Pedido #" + numero + " cancelado.");
        } else {
            System.out.println("Número do pedido inválido.");
        }
    }
}