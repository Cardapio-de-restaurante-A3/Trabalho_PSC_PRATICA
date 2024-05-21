import java.util.ArrayList;

public class GuardaPedidos {
    // Lista que armazena todos os pedidos
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    // Variável que mantém o número do próximo pedido a ser adicionado
    private int nextNumero = 1;

    // Método para adicionar um novo pedido à lista
    public void adicionarPedido(String cliente, String item) {
        // Cria um novo pedido com o próximo número, cliente e item fornecidos
        Pedido pedido = new Pedido(nextNumero++, cliente, item);
        // Adiciona o pedido à lista de pedidos
        pedidos.add(pedido);
        // Imprime uma mensagem de confirmação
        System.out.println("Pedido adicionado: " + pedido);
    }

    // Método para consultar e listar todos os pedidos
    public void consultarPedidos() {
        // Verifica se a lista de pedidos está vazia
        if (pedidos.isEmpty()) {
            // Imprime uma mensagem indicando que não há pedidos
            System.out.println("Nenhum pedido encontrado.");
        } else {
            // Itera sobre todos os pedidos na lista
            for (Pedido pedido : pedidos) {
                // Imprime cada pedido
                System.out.println(pedido);
            }
        }
    }

    // Método para cancelar (remover) um pedido da lista
    public void cancelarPedido(int numero) {
        // Variável para armazenar o pedido que deve ser removido
        Pedido pedidoParaRemover = null;
        // Itera sobre todos os pedidos na lista
        for (Pedido pedido : pedidos) {
            // Verifica se o número do pedido atual é igual ao número fornecido
            if (pedido.getNumero() == numero) {
                // Se encontrar o pedido, armazena-o na variável e sai do loop
                pedidoParaRemover = pedido;
                break;
            }
        }
        // Verifica se um pedido para remover foi encontrado
        if (pedidoParaRemover != null) {
            // Remove o pedido encontrado da lista
            pedidos.remove(pedidoParaRemover);
            // Imprime uma mensagem de confirmação
            System.out.println("Pedido cancelado: " + pedidoParaRemover);
        } else {
            // Se nenhum pedido com o número fornecido foi encontrado, imprime uma mensagem de erro
            System.out.println("Pedido não encontrado.");
        }
    }
}
