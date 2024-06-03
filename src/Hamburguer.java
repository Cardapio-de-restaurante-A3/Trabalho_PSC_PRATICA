import java.util.ArrayList;
import java.util.List;

public class Hamburguer {
    private String nome; // Nome do hambúrguer
    private String descricao; // Descrição do hambúrguer
    private double preco; // Preço do hambúrguer

    // Construtor da classe Hamburguer
    public Hamburguer(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos getters para acessar as propriedades privadas
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        // Retorna uma representação do hambúrguer como string
        return nome + "\n" + descricao + "\nPreço: R$" + preco;
    }

    // Lista estática para armazenar todos os hambúrgueres
    private static final List<Hamburguer> hamburgueres = new ArrayList<>();

    // Bloco estático para inicializar a lista de hambúrgueres com itens pré-definidos
    static {
        hamburgueres.add(new Hamburguer("Bacon ++", """ 
                Hambúrguer de carne bovina suculenta
                Dupla camada de bacon crocante
                Queijo cheddar derretido
                Alface, tomate e cebola roxa
                Molho especial da casa
                Pão de brioche tostado  
                """, 25.00)); // adicionar casa decimal
        hamburgueres.add(new Hamburguer("Cheese#", """
                Hambúrguer de carne bovina
                Camada generosa de queijo cheddar e queijo suíço
                Picles e cebola caramelizada
                Molho de queijo cremoso
                Pão de gergelim
                """, 23.00));
        hamburgueres.add(new Hamburguer("PHP Burger", """
                Hambúrguer de carne bovina com temperos especiais
                Queijo provolone derretido
                Bacon em tiras
                Alface americana e tomate fresco
                Molho barbecue
                Pão artesanal
                """, 26.50));
        hamburgueres.add(new Hamburguer("SQL Delight", """
                Hambúrguer de frango grelhado
                Queijo muçarela
                Abacate fatiado
                Alface, tomate e cebola roxa
                Molho de maionese com ervas
                Pão integral
                """, 24.00));
        hamburgueres.add(new Hamburguer("UML Stack", """
                Hambúrguer vegetariano de grão-de-bico
                Queijo cheddar derretido
                Alface, tomate, pepino e cebola roxa
                Molho de iogurte com hortelã
                Pão integral
                """, 22.00));
        hamburgueres.add(new Hamburguer("Comic Sans(duíche)", """
                Hambúrguer de carne bovina
                Queijo prato derretido
                Bacon e ovo frito
                Alface e tomate
                Maionese de alho
                Pão de hambúrguer clássico
                """, 24.50));
        hamburgueres.add(new Hamburguer("CheemsBurguer", """
                Hambúrguer de carne suína
                Queijo cheddar e queijo suíço
                Bacon crocante
                Alface, tomate e cebola roxa
                Molho especial de mostarda e mel
                Pão australiano
                """, 25.50));
        hamburgueres.add(new Hamburguer("Mortadela do Chaves", """
                Hambúrguer de carne bovina
                Fatias de mortadela grelhada
                Queijo provolone
                Alface e tomate
                Maionese temperada
                Pão francês
                """, 24.00));
        hamburgueres.add(new Hamburguer("BBB (Big Bold Burger)", """
                Hambúrguer de carne bovina extra grande
                Queijo cheddar duplo
                Bacon crocante
                Alface, tomate e cebola roxa
                Molho especial BBQ
                Pão de hambúrguer grande
                """, 28.00));
    }

    // Método estático para obter a lista de hambúrgueres
    public static List<Hamburguer> getHamburgueres() {
        return hamburgueres;
    }
}