import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        GuardaPedidos gp = new GuardaPedidos(); // Instância da classe GuardaPedidos para gerenciar os pedidos
        int op, op2; // Variáveis para opções do menu
        String cliente, item = ""; // Variáveis para o nome do cliente e item do pedido

        // Loop do menu interativo
        do {
            System.out.println("\n::::::::::::::Menu::::::::::::::\n");
            System.out.println("""
                    [1] Fazer Pedido
                    [2] Consultar
                    [3] Cancelar
                    [4] Sair
                    """);
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt(); // Lê a opção escolhida pelo usuário
            sc.nextLine();  // Limpa o buffer do Scanner

            switch (op) {
                case 1 -> {
                    // Fazer um pedido
                    System.out.println("Nome do cliente: ");
                    cliente = sc.nextLine(); // Lê o nome do cliente
                    System.out.println("\n::::::::::::::OPÇÕES::::::::::::::\n");
                    System.out.println("""
                            [1] Bacon ++
                            [2] Cheese#
                            [3] PHP Burger
                            [4] SQL Delight
                            [5] UML Stack
                            [6] Comic Sans(duíche)
                            [7] CheemsBurguer   
                            [8] Mortadela do Chaves
                            [9] BBB (Big Bold Burger)
                            """);
                    System.out.println("Escolha uma opção: ");
                    op2 = sc.nextInt(); // Lê a opção do item escolhido
                    sc.nextLine();  // Limpa o buffer do Scanner
                    switch (op2) {
                        case 1 -> {
                            System.out.println("""
                                                    Bacon ++
                                                    Hambúrguer de carne bovina suculenta
                                                    Dupla camada de bacon crocante
                                                    Queijo cheddar derretido
                                                    Alface, tomate e cebola roxa
                                                    Molho especial da casa
                                                    Pão de brioche tostado  
                            
                                                """);
                        
                        }
                        case 2 -> {
                            System.out.println("""
                                                    Cheese#
                                                    Hambúrguer de carne bovina
                                                    Camada generosa de queijo cheddar e queijo suíço
                                                    Picles e cebola caramelizada
                                                    Molho de queijo cremoso
                                                    Pão de gergelim
                                                """);

                        }
                        case 3 -> {
                            System.out.println("""
                                                    PHP Burger
                                                    Hambúrguer de carne bovina com temperos especiais
                                                    Queijo provolone derretido
                                                    Bacon em tiras
                                                    Alface americana e tomate fresco
                                                    Molho barbecue
                                                    Pão artesanal
                                                """);

                        }
                        case 4 -> {
                            System.out.println("""
                                                    SQL Delight
                                                    Hambúrguer de frango grelhado
                                                    Queijo muçarela
                                                    Abacate fatiado
                                                    Alface, tomate e cebola roxa
                                                    Molho de maionese com ervas
                                                    Pão integral
                                                """);

                        }
                        case 5 -> {
                            System.out.println("""
                                                    UML Stack
                                                    Hambúrguer vegetariano de grão-de-bico
                                                    Queijo cheddar derretido
                                                    Alface, tomate, pepino e cebola roxa
                                                    Molho de iogurte com hortelã
                                                    Pão integral
                                                """);

                        }
                        case 6 -> {
                            System.out.println("""
                                                    Comic Sans(duíche)
                                                    Hambúrguer de carne bovina
                                                    Queijo prato derretido
                                                    Bacon e ovo frito
                                                    Alface e tomate
                                                    Maionese de alho
                                                    Pão de hambúrguer clássico
                                                """);

                        }
                        case 7 -> {
                            System.out.println("""
                                                    CheemsBurguer
                                                    Hambúrguer de carne suína
                                                    Queijo cheddar e queijo suíço
                                                    Bacon crocante
                                                    Alface, tomate e cebola roxa
                                                    Molho especial de mostarda e mel
                                                    Pão australiano
                                                """);

                        }
                        case 8 -> {
                            System.out.println("""
                                                    Mortadela do Chaves
                                                    Hambúrguer de carne bovina
                                                    Fatias de mortadela grelhada
                                                    Queijo provolone
                                                    Alface e tomate
                                                    Maionese temperada
                                                    Pão francês
                                                """);

                        }
                        case 9 -> {
                            System.out.println("""
                                                    BBB (Big Bold Burger)
                                                    Hambúrguer de carne bovina extra grande
                                                    Queijo cheddar duplo
                                                    Bacon crocante
                                                    Alface, tomate e cebola roxa
                                                    Molho especial BBQ
                                                    Pão de hambúrguer grande
                                                """);

                        }
                        
                        default ->
                            System.out.println("Opção Inválida!");
                            

                    }
                    gp.adicionarPedido(cliente, item); // Adiciona o pedido à lista
                }
                case 2 -> gp.consultarPedidos(); // Consulta todos os pedidos
                case 3 -> {
                    // Cancelar um pedido
                    System.out.println("Número do pedido a cancelar: ");
                    int numero = sc.nextInt(); // Lê o número do pedido a ser cancelado
                    sc.nextLine();  // Limpa o buffer do Scanner
                    gp.cancelarPedido(numero); // Cancela o pedido
                }
                case 4 -> System.out.println("Saindo..."); // Sai do programa
                default -> System.out.println("Opção Inválida!"); // Caso a opção seja inválida
            }
        } while (op != 4); // Continua o loop até o usuário escolher sair
    }
}