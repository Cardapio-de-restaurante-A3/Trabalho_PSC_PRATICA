import java.util.ArrayList;
import java.util.List;

public class GuardaPedidos {
    // Classe interna para representar um pedido
    private static class Pedido {
        String cliente; // Nome do cliente
        Hamburguer hamburguer; // Hambúrguer escolhido
        Bebida bebida; // Bebida escolhida (pode ser nula)
        List<String> observacoes;
        Pagamento pagamento;

        // Construtor da classe Pedido
        Pedido(String cliente, Hamburguer hamburguer, Bebida bebida, List<String> observacoes, Pagamento pagamento) {
            this.cliente = cliente;
            this.hamburguer = hamburguer;
            this.bebida = bebida;
            this.observacoes = observacoes;
            this.pagamento = pagamento;
        }

        @Override
        public String toString() {
            return "Cliente: " + cliente + "\nHambúrguer: " + hamburguer.getNome() + "\nBebida: " + (bebida != null ? bebida.getNome() : "Nenhuma") + "\nObservações: " + String.join(", ", observacoes) + "\n" + pagamento;
        }
    }

    // Lista para armazenar todos os pedidos
    private final List<Pedido> pedidos = new ArrayList<>();

    // Método para adicionar um pedido à lista
    public void adicionarPedido(String cliente, Hamburguer hamburguer, Bebida bebida, List<String> observacoes, Pagamento pagamento) {
        pedidos.add(new Pedido(cliente, hamburguer, bebida, observacoes, pagamento));
    }

    // Método para consultar todos os pedidos
    public void consultarTodosPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.println(pedidos.get(i));
            System.out.println();
        }
    }

    // Método para consultar um pedido específico pelo número
    public void consultarPedido(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            System.out.println("Pedido " + numero + ":");
            System.out.println(pedidos.get(numero - 1));
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }

    // Método para cancelar um pedido pelo número
    public void cancelarPedido(int numero) {
        if (numero > 0 && numero <= pedidos.size()) {
            pedidos.remove(numero - 1);
            System.out.println("Pedido cancelado com sucesso!");
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }
}