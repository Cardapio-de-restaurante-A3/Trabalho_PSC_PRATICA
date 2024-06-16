import java.util.Scanner;
import java.util.UUID;

public class Pagamento {
    private double valorPago;
    private String metodoPagamento;

    public Pagamento(double valorPago, String metodoPagamento) {
        this.valorPago = valorPago;
        this.metodoPagamento = metodoPagamento;
    }

    public static Pagamento coletarPagamento(Scanner sc, double total) {
        System.out.println("Escolha o método de pagamento:");
        System.out.println("[1] Dinheiro [2] Cartão [3] Pix");
        int opcaoPagamento = sc.nextInt();
        sc.nextLine(); // Consome o caractere de nova linha

        if (opcaoPagamento == 1) {
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
            System.out.println("Pagamento com cartão realizado com sucesso.");
            return new Pagamento(total, "Cartão");
        } else if(opcaoPagamento == 3){
            System.out.println("Essa é a nossa chave pix");
             UUID uuid = UUID.randomUUID();
            // Converter o UUID para string e remover os traços
            String pixKey = uuid.toString().replace("-", "");
            // Exibir a chave PIX gerada
            System.out.println("Chave PIX gerada: " + pixKey);
            return new Pagamento(total, "Pix");
        }else {
            System.out.println("Opção inválida. Tente novamente.");
            return coletarPagamento(sc, total); // Recursão para tentar novamente
        }
    }

    @Override
    public String toString() {
        return "Método de Pagamento: " + metodoPagamento +
                "\nValor Pago: R$" + valorPago;
    }
}