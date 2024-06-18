import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma bebida disponível para compra.
 */
public class Bebida {
    private String nome;        // Nome da bebida
    private double preco;       // Preço da bebida
    private String unidade;     // Unidade da bebida (ex: ml, L)
    private String fabricante;  // Fabricante da bebida

    /**
     * Cria uma nova bebida com os detalhes fornecidos.
     * @param nome O nome da bebida.
     * @param preco O preço da bebida.
     * @param unidade A unidade da bebida (ex: ml, L).
     * @param fabricante O fabricante da bebida.
     */
    public Bebida(String nome, double preco, String unidade, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
        this.fabricante = fabricante;
    }

    /**
     * Obtém o nome da bebida.
     * @return O nome da bebida.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o preço da bebida.
     * @return O preço da bebida.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Obtém a unidade da bebida.
     * @return A unidade da bebida.
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Obtém o fabricante da bebida.
     * @return O fabricante da bebida.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Obtém uma lista de bebidas disponíveis para compra.
     * @return Uma lista de bebidas disponíveis.
     */
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
