import java.util.ArrayList;
import java.util.List;

public class GuardaPedidos {
    private static class Pedido {
        String cliente;
        Hamburguer hamburguer;
        Bebida bebida;

        Pedido(String cliente, Hamburguer hamburguer, Bebida bebida) {
            this.cliente = cliente;
            this.hamburguer = hamburguer;
            this.bebida = bebida;
        }

        @Override
        public String toString() {
            return "Cliente: " + cliente + "\nHambúrguer: " + hamburguer.getNome() + "\nBebida: " + (bebida != null ? bebida.getNome() : "Nenhuma");
        }
    }

    private final List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(String cliente, Hamburguer hamburguer, Bebida bebida) {
        pedidos.add(new Pedido(cliente, hamburguer, bebida));
    }

    public void consultarTodosPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.println(pedidos.get(i));
            System.out.println();
        }
    }

    public void consultarPedido(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            System.out.println("Pedido " + numero + ":");
            System.out.println(pedidos.get(numero - 1));
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }

    public void cancelarPedido(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            pedidos.remove(numero - 1);
            System.out.println("Pedido cancelado com sucesso!");
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }
}