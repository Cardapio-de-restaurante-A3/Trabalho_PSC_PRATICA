import java.util.ArrayList;
import java.util.List;

public class Bebida {
    private String nome;
    private double preco;
    private String unidade;
    private String fabricante;

    public Bebida(String nome, double preco, String unidade, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public static List<Bebida> getBebidas() {
        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(new Bebida("Coca-Cola lata", 5.00, "350ml", "Coca-Cola Company"));
        bebidas.add(new Bebida("Guaraná Antarctica lata", 4.50, "350ml", "Ambev"));
        bebidas.add(new Bebida("Chá Gelado", 4.50, "500ml", "Leãozim"));
        bebidas.add(new Bebida("Água Mineral", 2.50, "500ml", "Crystal"));
        bebidas.add(new Bebida("Água com Gás", 2.50, "500ml", "Crystal"));
        return bebidas;
    }
}