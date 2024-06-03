import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        GuardaPedidos gp = new GuardaPedidos(); // Cria um objeto para gerenciar os pedidos
        int op, op2; // Variáveis para as opções do menu
        String cliente; // Variável para armazenar o nome do cliente
        Hamburguer itemHamburguer = null; // Variável para o hambúrguer selecionado
        Bebida itemBebida = null; // Variável para a bebida selecionada

        do {
            // Exibe o menu principal
            System.out.println("\n::::::::::::::Menu::::::::::::::\n");
            System.out.println("""
                    [1] Fazer Pedido
                    [2] Consultar Pedido
                    [3] Cancelar Pedido
                    [4] Sair
                    """);
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt(); // Lê a escolha do usuário
            sc.nextLine(); // Consome o caractere de nova linha

            switch (op) {
                case 1 -> {
                    // Processo para fazer um pedido
                    System.out.println("Nome do cliente: ");
                    cliente = sc.nextLine(); // Lê o nome do cliente

                    // Escolher um hambúrguer
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE HAMBÚRGUER::::::::::::::\n");
                        List<Hamburguer> hamburgueres = Hamburguer.getHamburgueres(); // Obtém a lista de hambúrgueres
                        for (int i = 0; i < hamburgueres.size(); i++) {
                            // Exibe os hambúrgueres disponíveis
                            System.out.println("[" + (i + 1) + "] " + hamburgueres.get(i).getNome() + " - R$" + hamburgueres.get(i).getPreco());
                        }

                        System.out.println("Escolha uma opção de hambúrguer: ");
                        op2 = sc.nextInt(); // Lê a escolha do usuário para o hambúrguer
                        sc.nextLine(); // Consome o caractere de nova linha

                        if (op2 > 0 && op2 <= hamburgueres.size()) {
                            itemHamburguer = hamburgueres.get(op2 - 1); // Seleciona o hambúrguer com base na escolha do usuário
                            System.out.println(itemHamburguer.getDescricao()); // Exibe a descrição do hambúrguer selecionado
                            System.out.println("Deseja confirmar este hambúrguer?");
                            System.out.println("[1] Sim  [2] Não");
                            int confirma = sc.nextInt(); // Confirma a seleção

                            if (confirma == 1) {
                                break; // Sai do loop se a seleção for confirmada
                            } else if (confirma == 2) {
                                System.out.println("Escolha um hambúrguer novamente.");
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }

                    // Escolher uma bebida
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE BEBIDA::::::::::::::\n");
                        List<Bebida> bebidas = Bebida.getBebidas(); // Obtém a lista de bebidas
                        for (int i = 0; i < bebidas.size(); i++) {
                            // Exibe as bebidas disponíveis
                            System.out.println("[" + (i + 1) + "] " + bebidas.get(i).getNome() + " - R$" + bebidas.get(i).getPreco());
                        }
                        System.out.println("[0] Sem bebida");

                        System.out.println("Escolha uma opção de bebida: ");
                        op2 = sc.nextInt(); // Lê a escolha do usuário para a bebida
                        sc.nextLine(); // Consome o caractere de nova linha

                        if (op2 == 0) {
                            itemBebida = null; // Define bebida como nula se o usuário não quiser bebida
                            break; // Sai do loop
                        } else if (op2 > 0 && op2 <= bebidas.size()) {
                            itemBebida = bebidas.get(op2 - 1); // Seleciona a bebida com base na escolha do usuário
                            break; // Sai do loop
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }
                    // Adicionar observações
                    List<String> observacoes = new ArrayList<>();
                    System.out.println("Deseja adicionar alguma observação? [S/N]");
                    String resposta = sc.nextLine();
                    while (resposta.equalsIgnoreCase("S")) {
                        System.out.println("Digite a observação: ");
                        String observacao = sc.nextLine();
                        observacoes.add(observacao);
                        System.out.println("Deseja adicionar outra observação? [S/N]");
                        resposta = sc.nextLine();
                    }

                    // Calcular o total do pedido
                    double total = itemHamburguer.getPreco() + (itemBebida != null ? itemBebida.getPreco() : 0);

                    // Coletar informações de pagamento
                    Pagamento pagamento = Pagamento.coletarPagamento(sc, total);

                    gp.adicionarPedido(cliente, itemHamburguer, itemBebida, observacoes, pagamento);
                    System.out.println("Pedido realizado com sucesso!");
                }
                case 2 -> {
                    // Processo para consultar pedidos
                    gp.consultarTodosPedidos(); // Consulta todos os pedidos
                    System.out.println("Digite o número do pedido que deseja consultar, ou [0] para sair: ");
                    int numero = sc.nextInt(); // Lê o número do pedido a ser consultado
                    if (numero==0){
                        break;
                    }
                    sc.nextLine(); // Consome o caractere de nova linha
                    gp.consultarPedido(numero); // Consulta o pedido específico
                  
                }
                case 3 -> {
                    // Processo para cancelar pedido
                    System.out.println("Número do pedido a cancelar: ");
                    int numero = sc.nextInt(); // Lê o número do pedido a ser cancelado
                    sc.nextLine(); // Consome o caractere de nova linha
                    gp.cancelarPedido(numero); // Cancela o pedido específico
                }
                case 4 -> System.out.println("Saindo do programa!"); // Sai do programa
                default -> System.out.println("Opção inválida!"); // Mensagem para opção inválida
            }
        } while (op != 4); // Continua o loop até que a opção seja 4

        sc.close(); // Fecha o scanner
    }
}