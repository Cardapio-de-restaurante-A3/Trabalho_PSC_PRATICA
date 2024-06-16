import java.util.ArrayList;
import java.util.List;

/**
 * A classe Bebida representa uma bebida com seu nome, preço, unidade e fabricante.
 */
public class Bebida {
    private String nome;
    private double preco;
    private String unidade;
    private String fabricante;

    /**
     * Construtor da classe Bebida.
     *
     * @param nome       O nome da bebida.
     * @param preco      O preço da bebida.
     * @param unidade    A unidade da bebida (por exemplo, ml, lata, garrafa, etc.).
     * @param fabricante O fabricante da bebida.
     */
    public Bebida(String nome, double preco, String unidade, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
        this.fabricante = fabricante;
    }

    /**
     * Retorna o nome da bebida.
     *
     * @return O nome da bebida.
     */
    public String retornaNome() {
        return nome;
    }

    /**
     * Retorna o preço da bebida.
     *
     * @return O preço da bebida.
     */
    public double retornaPreco() {
        return preco;
    }

    /**
     * Retorna a unidade da bebida.
     *
     * @return A unidade da bebida.
     */
    public String retornaUnidade() {
        return unidade;
    }

    /**
     * Retorna o fabricante da bebida.
     *
     * @return O fabricante da bebida.
     */
    public String retornaFabricante() {
        return fabricante;
    }

    /**
     * Retorna uma lista de bebidas pré-definidas.
     *
     * @return Uma lista de objetos Bebida.
     */
    public static List<Bebida> retornaBebidas() {
        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(new Bebida("Coca-Cola lata", 5.00, "350ml", "Coca-Cola Company"));
        bebidas.add(new Bebida("Guaraná Antarctica lata", 4.50, "350ml", "Ambev"));
        bebidas.add(new Bebida("Chá Gelado", 4.50, "500ml", "Leãozim"));
        bebidas.add(new Bebida("Água Mineral", 2.50, "500ml", "Crystal"));
        bebidas.add(new Bebida("Água com Gás", 2.50, "500ml", "Crystal"));
        return bebidas;
    }
}