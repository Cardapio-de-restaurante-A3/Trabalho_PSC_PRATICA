import java.util.Scanner;
import java.util.UUID;

/**
 * Representa um pagamento realizado em uma transação.
 */
public class Pagamento {
    private double valorPago; // Valor pago na transação
    private String metodoPagamento; // Método de pagamento utilizado

    /**
     * Construtor para a classe Pagamento.
     * @param valorPago O valor pago na transação.
     * @param metodoPagamento O método de pagamento utilizado.
     */
    public Pagamento(double valorPago, String metodoPagamento) {
        this.valorPago = valorPago;
        this.metodoPagamento = metodoPagamento;
    }

    /**
     * Método estático para coletar informações de pagamento do usuário.
     * @param sc Scanner para coletar entrada do usuário.
     * @param total O valor total a ser pago.
     * @return Um objeto Pagamento representando a transação.
     */
    public static Pagamento coletarPagamento(Scanner sc, double total) {
        System.out.println("Escolha o método de pagamento:");
        System.out.println("[1] Dinheiro [2] Cartão [3] Pix");
        int opcaoPagamento = sc.nextInt();
        sc.nextLine(); // Consome o caractere de nova linha

        if (opcaoPagamento == 1) {
            /**
             * Opção de pagamento em dinheiro.
             */
            System.out.println("Digite o valor pago em dinheiro: ");
            double valorPago = sc.nextDouble();
            sc.nextLine(); // Consome o caractere de nova linha

            if (valorPago < total) {
                System.out.println("Valor insuficiente. Tente novamente.");
                return coletarPagamento(sc, total); // Recursão para tentar novamente
            }
            double troco = valorPago - total;
            System.out.println("Troco: R$" + troco);
            return new Pagamento(valorPago, "Dinheiro");

        } else if (opcaoPagamento == 2) {
            /**
             * Opção de pagamento com cartão.
             */
            System.out.println("Pagamento com cartão realizado com sucesso.");
            return new Pagamento(total, "Cartão");
        } else if(opcaoPagamento == 3){
            /**
             * Opção de pagamento com Pix.
             */
            System.out.println("Essa é a nossa chave pix");
            UUID uuid = UUID.randomUUID();
            // Converter o UUID para string e remover os traços
            String pixKey = uuid.toString().replace("-", "");
            // Exibir a chave PIX gerada
            System.out.println("Chave PIX gerada: " + pixKey);
            return new Pagamento(total, "Pix");
        }else {
            /**
             * Opção inválida de pagamento.
             */
            System.out.println("Opção inválida. Tente novamente.");
            return coletarPagamento(sc, total); // Recursão para tentar novamente
        }
    }

    /**
     * Retorna uma representação em string do pagamento, incluindo informações sobre o método de pagamento e o valor pago.
     * @return Uma representação em string do pagamento.
     */
    @Override
    public String toString() {
        return "Método de Pagamento: " + metodoPagamento +
                "\nValor Pago: R$" + valorPago;
    }
}
