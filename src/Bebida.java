import java.util.ArrayList;
import java.util.List;

public class Bebida {
    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }

    private static final List<Bebida> bebidas = new ArrayList<>();

    static {
        bebidas.add(new Bebida("Refrigerante", 5.00));
        bebidas.add(new Bebida("Suco Natural", 7.00));
        bebidas.add(new Bebida("Água Mineral", 3.00));
        bebidas.add(new Bebida("Chá Gelado", 6.00));
        bebidas.add(new Bebida("Cerveja", 8.00));
    }

    public static List<Bebida> getBebidas() {
        return bebidas;
    }
}