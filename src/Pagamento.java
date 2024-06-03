import java.util.Scanner;

public class Pagamento {
    private String tipo;
    private double valor;

    // Construtor da classe Pagamento
    public Pagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // Métodos getters para acessar as propriedades privadas
    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Tipo de Pagamento: " + tipo + ", Valor: R$" + valor;
    }

    // Método estático para coletar informações de pagamento do usuário
    public static Pagamento coletarPagamento(Scanner sc, double total) {
        System.out.println("Selecione o tipo de pagamento:");
        System.out.println("[1] Dinheiro");
        System.out.println("[2] Cartão de Crédito");
        System.out.println("[3] Cartão de Débito");
        System.out.println("[4] PIX");

        int opcao = sc.nextInt();
        sc.nextLine(); // Consome o caractere de nova linha

        String tipoPagamento = "";
        switch (opcao) {
            case 1 -> tipoPagamento = "Dinheiro";
            case 2 -> tipoPagamento = "Cartão de Crédito";
            case 3 -> tipoPagamento = "Cartão de Débito";
            case 4 -> tipoPagamento = "PIX";
            default -> {
                System.out.println("Opção inválida!");
                return coletarPagamento(sc, total); // Tentar novamente em caso de opção inválida
            }
        }

        return new Pagamento(tipoPagamento, total);
    }
}