import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuardaPedidos gp = new GuardaPedidos();
        int op, op2;
        String cliente;
        Hamburguer item = null;

        do {
            System.out.println("\n::::::::::::::Menu::::::::::::::\n");
            System.out.println("""
                    [1] Fazer Pedido
                    [2] Consultar Pedido
                    [3] Cancelar
                    [4] Sair
                    """);
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("Nome do cliente: ");
                    cliente = sc.nextLine();
                    System.out.println("\n::::::::::::::OPÇÕES::::::::::::::\n");
                    List<Hamburguer> hamburgueres = Hamburguer.getHamburgueres();
                    for (int i = 0; i < hamburgueres.size(); i++) {
                        System.out.println("[" + (i + 1) + "] " + hamburgueres.get(i).getNome());
                    }
                    System.out.println("Escolha uma opção: ");
                    op2 = sc.nextInt();
                    sc.nextLine();
                    if (op2 > 0 && op2 <= hamburgueres.size()) {
                        item = hamburgueres.get(op2 - 1);
                        System.out.println(item.getDescricao());
                        System.out.println("Deseja confirmar este pedido?");
                        System.out.println("[1] Sim  [2]Não");
                        int confirma = sc.nextInt();
                        if(confirma != 1 && confirma !=2){
                            System.out.println("opção invalida");
                        }
                        else if(confirma ==1){
                            gp.adicionarPedido(cliente, item);
                        }
                        else if (confirma == 2){
                            break;
                        }

                    } else {
                        System.out.println("Opção Inválida!");
                    }
                        
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
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção Inválida!");
            }
        } while (op != 4);
    }
}