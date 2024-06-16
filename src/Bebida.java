import java.util.ArrayList;
import java.util.List;

public class Bebida {
    private String nome;
    private double preco;
    private String unidade;
    private String fabricante;

    public Bebida(String nome, double preco, String unidade, String fabricante) {               //Cria o construtor da classe bebidas 
        this.nome = nome;                                                                     //Inicia atributo
        this.preco = preco;                                                                 //Inicia atributo
        this.unidade = unidade;                                                            //Inicia atributo
        this.fabricante = fabricante;                                                     //Inicia atributo
    }
    //Define metodos get publicos para acessar os atributos privados das classes 

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

    //Define um método getBebidas estático que retorna uma lista de objetos Bebida
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
