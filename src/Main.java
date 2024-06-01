import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuardaPedidos gp = new GuardaPedidos();
        int op, op2;
        String cliente;
        Hamburguer itemHamburguer = null;
        Bebida itemBebida = null;

        do {
            System.out.println("\n::::::::::::::Menu::::::::::::::\n");
            System.out.println("""
                    [1] Fazer Pedido
                    [2] Consultar Pedido
                    [3] Cancelar Pedido
                    [4] Sair
                    """);
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("Nome do cliente: ");
                    cliente = sc.nextLine();

                    // Escolher hambúrguer
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE HAMBÚRGUER::::::::::::::\n");
                        List<Hamburguer> hamburgueres = Hamburguer.getHamburgueres();
                        for (int i = 0; i < hamburgueres.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + hamburgueres.get(i).getNome() + " - R$" + hamburgueres.get(i).getPreco());
                        }

                        System.out.println("Escolha uma opção de hambúrguer: ");
                        op2 = sc.nextInt();
                        sc.nextLine();

                        if (op2 > 0 && op2 <= hamburgueres.size()) {
                            itemHamburguer = hamburgueres.get(op2 - 1);
                            System.out.println(itemHamburguer.getDescricao());
                            System.out.println("Deseja confirmar este hambúrguer?");
                            System.out.println("[1] Sim  [2] Não");
                            int confirma = sc.nextInt();

                            if (confirma == 1) {
                                break;
                            } else if (confirma == 2) {
                                System.out.println("Escolha um hambúrguer novamente.");
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }

                    // Escolher bebida
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE BEBIDA::::::::::::::\n");
                        List<Bebida> bebidas = Bebida.getBebidas();
                        for (int i = 0; i < bebidas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + bebidas.get(i).getNome() + " - R$" + bebidas.get(i).getPreco());
                        }
                        System.out.println("[0] Sem bebida");

                        System.out.println("Escolha uma opção de bebida: ");
                        op2 = sc.nextInt();
                        sc.nextLine();

                        if (op2 == 0) {
                            itemBebida = null;
                            break;
                        } else if (op2 > 0 && op2 <= bebidas.size()) {
                            itemBebida = bebidas.get(op2 - 1);
                            break;
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }

                    gp.adicionarPedido(cliente, itemHamburguer, itemBebida);
                    System.out.println("Pedido realizado com sucesso!");
                }
                case 2 -> {
                    gp.consultarTodosPedidos();
                    System.out.println("Digite o número do pedido que deseja consultar: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    gp.consultarPedido(numero);
                }
                case 3 -> {
                    System.out.println("Número do pedido a cancelar: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    gp.cancelarPedido(numero);
                }
                case 4 -> System.out.println("Saindo do programa!");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 4);

        sc.close();
    }
}