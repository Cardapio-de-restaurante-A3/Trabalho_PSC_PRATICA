import java.util.ArrayList;
import java.util.List;

public class Bebida {
    private String nome; // Nome da bebida
    private double preco; // Preço da bebida

    // Construtor da classe Bebida
    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos getters para acessar as propriedades privadas
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        // Retorna uma representação da bebida como string
        return nome + " - R$" + preco;
    }

    // Lista estática para armazenar todas as bebidas
    private static final List<Bebida> bebidas = new ArrayList<>();

    // Bloco estático para inicializar a lista de bebidas com itens pré-definidos
    static {
        bebidas.add(new Bebida("Refrigerante", 5.00)); // adicionar casa decimal
        bebidas.add(new Bebida("Suco Natural", 7.00));
        bebidas.add(new Bebida("Água Mineral", 3.00));
        bebidas.add(new Bebida("Chá Gelado", 6.00));
        bebidas.add(new Bebida("Cerveja", 8.00));
    }

    // Método estático para obter a lista de bebidas
    public static List<Bebida> getBebidas() {
        return bebidas;
    }
}