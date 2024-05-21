import java.util.ArrayList;

public class GuardaPedidos {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private int nextNumero = 1;

    public void adicionarPedido(String cliente, String item) {
        Pedido pedido = new Pedido(nextNumero++, cliente, item);
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: " + pedido);
    }

    public void consultarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }

    public void cancelarPedido(int numero) {
        Pedido pedidoParaRemover = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getNumero() == numero) {
                pedidoParaRemover = pedido;
                break;
            }
        }

        if (pedidoParaRemover != null) {
            pedidos.remove(pedidoParaRemover);
            System.out.println("Pedido cancelado: " + pedidoParaRemover);
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
}