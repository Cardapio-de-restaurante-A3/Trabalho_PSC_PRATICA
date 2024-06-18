import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * A classe principal que contém o método main para executar o programa de pedidos.
 */
public class Main {
/**
* O método principal que inicia a execução do programa.
* 
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuardaPedidos gp = new GuardaPedidos();
        int op, op2;
        String cliente;
        Hamburguer itemHamburguer = null;
        Bebida itemBebida = null;
/**
* Loop principal do menu do programa, que permite ao usuário fazer,
* cancelar e alterar pedidos, além de consultar hambúrgueres.
*/
        do {
            System.out.println("\n::::::::::::::Menu::::::::::::::\n");
            System.out.println("""
                    [1] Fazer Pedido
                    [2] Consultar Pedido
                    [3] Cancelar Pedido
                    [4] Consultar Hambúrgueres
                    [5] Alterar Pedido
                    [6] Sair
                    """);
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();
/**
 * O bloco de código principal do menu switch-case que lida com a opção de "Fazer Pedido".
 */
            switch (op) {
                /**
                * Solicita o nome do cliente e armazena a entrada.
                */
                case 1 -> {
                    System.out.println("Nome do cliente: ");
                    cliente = sc.nextLine();
                    /**
                    * Bloco de código para a escolha de um hambúrguer pelo cliente.
                    *
                    * Escolher um hambúrguer
                    */
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE HAMBÚRGUER::::::::::::::\n");
                        List<Hamburguer> hamburgueres = Hamburguer.getHamburgueres();
                        for (int i = 0; i < hamburgueres.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + hamburgueres.get(i).getNome() + " - R$" + hamburgueres.get(i).getPreco());
                        }
                         /**
                        * Solicita ao cliente que escolha uma opção de hambúrguer.
                        */
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
                                sc.nextLine();
                            /**
                            * Bloco de código para adicionar ou remover ingredientes do hambúrguer.
                            *
                            * Adicionar ou remover ingredientes
                            */
                                while (true) {
                                    System.out.println("\nIngredientes atuais: " + itemHamburguer.getDescricao());
                                    System.out.println("\nDeseja adicionar ou remover algum ingrediente?");
                                    System.out.println("[1] Adicionar  [2] Remover  [3] Finalizar");
                                    int alterarIngrediente = sc.nextInt();
                                    sc.nextLine();
                                    /**
                                    * Se o usuário escolhe adicionar um ingrediente.
                                    */
                                    if (alterarIngrediente == 1) {
                                        System.out.println("Ingredientes disponíveis para adicionar:");
                                        System.out.println("\nIngredientes atuais: " + itemHamburguer.getDescricao());
                                        System.out.println(itemHamburguer.listarIngredientesNumerados());
                                        System.out.println("Escolha um ingrediente para adicionar:");
                                        int ingredienteNum = sc.nextInt();
                                        sc.nextLine();
                                        /**
                                        * Verifica se o número do ingrediente é válido.
                                        */
                                        if (ingredienteNum > 0 && ingredienteNum <= hamburgueres.size()) {
                                            String ingrediente = "Novo ingrediente";
                                            itemHamburguer.adicionarIngrediente(ingrediente);
                                            System.out.println("Ingrediente " + ingrediente + " adicionado ao hambúrguer " + itemHamburguer.getNome() + " com sucesso!");
                                        } else {
                                            System.out.println("Opção inválida! Escolha um número válido.");
                                        }
                                        /**
                                        * Se o usuário escolhe remover um ingrediente.
                                        */
                                    } else if (alterarIngrediente == 2) {
                                        System.out.println("Ingredientes atuais:");
                                        System.out.println(itemHamburguer.listarIngredientesNumerados());
                                        System.out.println("Digite o número do ingrediente que deseja remover:");
                                        int numIngrediente = sc.nextInt();
                                        sc.nextLine();
                                        itemHamburguer.removerIngrediente(numIngrediente - 1);
                                        /**
                                        * Se o usuário escolhe finalizar a modificação dos ingredientes.
                                        */
                                    } else if (alterarIngrediente == 3) {
                                        break;
                                    } else {
                                        System.out.println("Opção inválida!");
                                    }
                                }

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
                    /**
                    * Lógica para escolher uma bebida.
                    */
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE BEBIDA::::::::::::::\n");
                        List<Bebida> bebidas = Bebida.getBebidas();
                        for (int i = 0; i < bebidas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + bebidas.get(i).getNome() + " - R$" + bebidas.get(i).getPreco() + " - " + bebidas.get(i).getUnidade() + " - " + bebidas.get(i).getFabricante());
                        }
                        System.out.println("[0] Sem bebida");
                        /**
                        * Solicita ao usuário que escolha uma bebida.
                        */
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

                    /**
                    * Bloco de código para adicionar observações ao pedido.
                    */
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
                    /**
                    * Calcula o total do pedido.
                    */
                    double total = itemHamburguer.getPreco();
                    if (itemBebida != null) {
                        total += itemBebida.getPreco();
                    }
                    System.out.println("Total do pedido: R$" + total);
                    /**
                    * Coleta o pagamento do usuário.
                    */
                    Pagamento pagamento = Pagamento.coletarPagamento(sc, total);
                    /**
                    * Cria um novo pedido e adiciona ao sistema de pedidos.
                    */
                    Pedido pedido = new Pedido(cliente, itemHamburguer, itemBebida, observacoes, pagamento);
                    gp.adicionarPedido(pedido);

                    System.out.println("Pedido realizado com sucesso!");
                    System.out.println(pedido);
                }
                    /**
                     * Caso para consultar pedidos.
                     */
                    case 2 -> {
                    /**
                    * Consulta todos os pedidos disponíveis.
                    */
                    gp.consultarTodosPedidos(); // Consulta todos os pedidos
                    System.out.println("Digite o número do pedido que deseja consultar, ou [0] para sair: ");
                    int numero = sc.nextInt(); // Lê o número do pedido a ser consultado
                    /**
                    * Sai do case se o número do pedido for 0.
                    */
                    if (numero==0){
                        break;
                    }
                    sc.nextLine(); // Consome o caractere de nova linha
                    gp.consultarPedidoUnico(numero); // Consulta o pedido específico
                }
                     /**
                     * Caso para cancelar um pedido.
                     */
                    case 3 -> {
                    /**
                    * Consulta todos os pedidos disponíveis.
                    */
                    gp.consultarTodosPedidos();
                    System.out.println("Digite o índice do pedido que deseja cancelar: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    /**
                    * Cancela o pedido no índice especificado.
                    */
                    Pedido pedido = gp.cancelarPedido(index -1);

                    if (pedido != null) {
                        System.out.println("Pedido cancelado com sucesso!");
                    } else {
                        System.out.println("Pedido não encontrado!");
                    }
                }
                /**
                * Caso para consultar hambúrgueres.
                */
                case 4 -> {
                    /**
                    * Loop para mostrar opções de hambúrgueres.
                    */
                    while (true) {
                        System.out.println("\n::::::::::::::OPÇÕES DE HAMBÚRGUER::::::::::::::\n");
                        List<Hamburguer> hamburgueres = Hamburguer.getHamburgueres();
                        for (int i = 0; i < hamburgueres.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + hamburgueres.get(i).getNome() + " - R$" + hamburgueres.get(i).getPreco());
                        }

                        System.out.println("Escolha uma opção de hambúrguer para ver a descrição (ou 0 para sair): ");
                        op2 = sc.nextInt();
                        sc.nextLine();

                        if (op2 == 0) {
                            break;
                        } else if (op2 > 0 && op2 <= hamburgueres.size()) {
                            System.out.println(hamburgueres.get(op2 - 1).getDescricao());
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }
                }
                /**
                * Caso para alterar um pedido.
                */
                case 5 -> {
                    /**
                    * Mostra todos os pedidos feitos.
                    */
                    List<Pedido> todosPedidos = gp.getPedidos();
                    if (todosPedidos.isEmpty()) {
                        System.out.println("Nenhum pedido foi feito ainda.");
                    } else {
                        System.out.println("Pedidos feitos:");
                        for (int i = 0; i < todosPedidos.size(); i++) {
                            System.out.println("[" + (i+1) + "] " + todosPedidos.get(i));
                        }
                
                        System.out.println("Digite o índice do pedido que deseja alterar: ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        Pedido pedido = gp.consultarPedido(index-1);
                
                        if (pedido != null) {
                            /**
                            * Exibe o pedido selecionado e permite alterações.
                            */
                            System.out.println("Detalhes do Pedido:");
                            System.out.println(pedido);
                
                            /**
                            * Loop para permitir adicionar, remover ou finalizar a alteração dos ingredientes do hambúrguer de um pedido.
                            */
                            Hamburguer hamburguer = pedido.getHamburguer();
                            while (true) {
                                System.out.println("\nIngredientes atuais: " + hamburguer.getDescricao());
                                System.out.println("Deseja adicionar ou remover algum ingrediente?");
                                System.out.println("[1] Adicionar  [2] Remover  [3] Finalizar");
                                int alterarIngrediente = sc.nextInt();
                                sc.nextLine();

                            if (alterarIngrediente == 1) {
                                /**
                                * Adiciona um novo ingrediente ao hambúrguer.
                                */
                                System.out.println("Ingredientes disponíveis para adicionar:");
                                System.out.println(itemHamburguer.listarIngredientesNumerados());
                                System.out.println("Escolha um ingrediente para adicionar:");
                                int ingredienteNum = sc.nextInt();
                                sc.nextLine();
                                if (ingredienteNum > 0 && ingredienteNum <= itemHamburguer.getIngredientes().size()) {
                                    String ingrediente = "Novo ingrediente"; // Aqui você pode ler o nome do ingrediente do usuário ou de algum lugar
                                    itemHamburguer.adicionarIngrediente(ingrediente);
                                    System.out.println("Ingrediente " + ingrediente + " adicionado ao hambúrguer " + itemHamburguer.getNome() + " com sucesso!");
                                } else {
                                    System.out.println("Opção inválida! Escolha um número válido.");
                                }
                            
                            } else if (alterarIngrediente == 2) {
                                /**
                                * Remove um ingrediente do hambúrguer.
                                */
                                System.out.println("Ingredientes atuais:");
                                System.out.println(hamburguer.listarIngredientesNumerados());
                                System.out.println("Digite o número do ingrediente que deseja remover:");
                                int numIngrediente = sc.nextInt();
                                sc.nextLine();
                                hamburguer.removerIngrediente(numIngrediente - 1);
                            } else if (alterarIngrediente == 3) {
                                /**
                                * Finaliza a alteração dos ingredientes do hambúrguer.
                                */
                                break;
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        }

                        // Alterar bebida
                        while (true) {
                            /**
                            * Loop para permitir escolher uma bebida para o pedido.
                            */
                            System.out.println("\n::::::::::::::OPÇÕES DE BEBIDA::::::::::::::\n");
                            List<Bebida> bebidas = Bebida.getBebidas();
                            for (int i = 0; i < bebidas.size(); i++) {
                                System.out.println("[" + (i + 1) + "] " + bebidas.get(i).getNome() + " - R$" + bebidas.get(i).getPreco() + " - " + bebidas.get(i).getUnidade() + " - " + bebidas.get(i).getFabricante());
                            }
                            System.out.println("[0] Sem bebida");

                            System.out.println("Escolha uma opção de bebida: ");
                            op2 = sc.nextInt();
                            sc.nextLine();

                            if (op2 == 0) {
                                pedido.setBebida(null);
                                break;
                            } else if (op2 > 0 && op2 <= bebidas.size()) {
                                pedido.setBebida(bebidas.get(op2 - 1));
                                break;
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        }

                        /**
                        * Loop para permitir adicionar observações ao pedido e finalizar a alteração.
                        */
                        List<String> observacoes = new ArrayList<>();
                        System.out.println("Deseja adicionar alguma observação? [S/N]");
                        String resposta = sc.nextLine();
                        while (resposta.equalsIgnoreCase("S")) {
                            /**
                            * Loop para adicionar observações ao pedido.
                            */
                            System.out.println("Digite a observação: ");
                            String observacao = sc.nextLine();
                            observacoes.add(observacao);
                            System.out.println("Deseja adicionar outra observação? [S/N]");
                            resposta = sc.nextLine();
                        }
                        pedido.setObservacoes(observacoes);

                        System.out.println("Pedido alterado com sucesso!");
                        System.out.println(pedido);
                    } else {
                        System.out.println("Pedido não encontrado!");
                    }
                }
                }
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 6);
    }
}