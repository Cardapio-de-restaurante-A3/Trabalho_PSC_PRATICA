import java.util.ArrayList;
import java.util.List;

/**
 * Uma classe que representa um hambúrguer com um nome, preço e lista de ingredientes.
 */
public class Hamburguer {
    private String nome;
    private double preco;
    private List<String> ingredientes;

    /**
     * Constrói uma instância de Hamburguer com o nome, preço e lista de ingredientes especificados.
     *
     * @param nome         o nome do hambúrguer
     * @param preco        o preço do hambúrguer
     * @param ingredientes a lista de ingredientes do hambúrguer
     */
    public Hamburguer(String nome, double preco, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = new ArrayList<>(ingredientes);
    }

    /**
     * Obtém o nome do hambúrguer.
     *
     * @return o nome do hambúrguer
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o preço do hambúrguer.
     *
     * @return o preço do hambúrguer
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Obtém a descrição do hambúrguer, incluindo seu nome e ingredientes.
     *
     * @return a descrição do hambúrguer
     */
    public String getDescricao() {
        return nome + " - Ingredientes: " + String.join(", ", ingredientes);
    }

    /**
     * Obtém a lista de ingredientes do hambúrguer.
     *
     * @return a lista de ingredientes
     */
    public List<String> getIngredientes() {
        return ingredientes;
    }

    /**
     * Adiciona um ingrediente à lista de ingredientes.
     *
     * @param ingrediente o ingrediente a ser adicionado
     */
    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    /**
     * Remove um ingrediente da lista de ingredientes pelo índice.
     *
     * @param index o índice do ingrediente a ser removido
     */
    public void removerIngrediente(int index) {
        if (index >= 0 && index < ingredientes.size()) {
            ingredientes.remove(index);
        }
    }

    /**
     * Lista os ingredientes do hambúrguer em formato numerado.
     *
     * @return uma string com a lista numerada de ingredientes
     */
    public String listarIngredientesNumerados() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ingredientes.size(); i++) {
            sb.append((i + 1)).append(". ").append(ingredientes.get(i)).append("\n");
        }
        return sb.toString();
    }

    /**
     * Gera uma lista de instâncias de Hamburguer pré-definidas.
     *
     * @return uma lista de objetos Hamburguer
     */
    public static List<Hamburguer> getHamburgueres() {
        List<Hamburguer> hamburgueres = new ArrayList<>();

        List<String> ingredientesBaconPlus = new ArrayList<>();
        ingredientesBaconPlus.add("Pão de brioche tostado");
        ingredientesBaconPlus.add("Carne bovina");
        ingredientesBaconPlus.add("Bacon crocante");
        ingredientesBaconPlus.add("Queijo cheddar");
        ingredientesBaconPlus.add("Alface");
        ingredientesBaconPlus.add("Tomate");
        ingredientesBaconPlus.add("Cebola roxa");
        ingredientesBaconPlus.add("Molho especial");
        hamburgueres.add(new Hamburguer("Bacon ++", 25.00, ingredientesBaconPlus));

        List<String> ingredientesCheese = new ArrayList<>();
        ingredientesCheese.add("Pão de gergelim");
        ingredientesCheese.add("Carne bovina");
        ingredientesCheese.add("Queijo cheddar");
        ingredientesCheese.add("Queijo suíço");
        ingredientesCheese.add("Picles");
        ingredientesCheese.add("Cebola caramelizada");
        ingredientesCheese.add("Molho de queijo");
        hamburgueres.add(new Hamburguer("Cheese#", 23.00, ingredientesCheese));

        List<String> ingredientesPHPBurger = new ArrayList<>();
        ingredientesPHPBurger.add("Pão artesanal");
        ingredientesPHPBurger.add("Carne bovina");
        ingredientesPHPBurger.add("Queijo provolone");
        ingredientesPHPBurger.add("Bacon");
        ingredientesPHPBurger.add("Alface americana");
        ingredientesPHPBurger.add("Tomate");
        ingredientesPHPBurger.add("Molho barbecue");
        hamburgueres.add(new Hamburguer("PHP Burger", 26.50, ingredientesPHPBurger));

        List<String> ingredientesSQLDelight = new ArrayList<>();
        ingredientesSQLDelight.add("Pão integral");
        ingredientesSQLDelight.add("Frango grelhado");
        ingredientesSQLDelight.add("Queijo muçarela");
        ingredientesSQLDelight.add("Abacate");
        ingredientesSQLDelight.add("Alface");
        ingredientesSQLDelight.add("Tomate");
        ingredientesSQLDelight.add("Cebola roxa");
        ingredientesSQLDelight.add("Molho de maionese com ervas");
        hamburgueres.add(new Hamburguer("SQL Delight", 24.00, ingredientesSQLDelight));

        List<String> ingredientesUMLStack = new ArrayList<>();
        ingredientesUMLStack.add("Pão integral");
        ingredientesUMLStack.add("Hambúrguer de grão-de-bico");
        ingredientesUMLStack.add("Queijo cheddar");
        ingredientesUMLStack.add("Alface");
        ingredientesUMLStack.add("Tomate");
        ingredientesUMLStack.add("Pepino");
        ingredientesUMLStack.add("Cebola roxa");
        ingredientesUMLStack.add("Molho de iogurte com hortelã");
        hamburgueres.add(new Hamburguer("UML Stack", 22.00, ingredientesUMLStack));

        List<String> ingredientesComicSans = new ArrayList<>();
        ingredientesComicSans.add("Pão de hambúrguer clássico");
        ingredientesComicSans.add("Carne bovina");
        ingredientesComicSans.add("Queijo prato");
        ingredientesComicSans.add("Bacon");
        ingredientesComicSans.add("Ovo frito");
        ingredientesComicSans.add("Alface");
        ingredientesComicSans.add("Tomate");
        ingredientesComicSans.add("Maionese de alho");
        hamburgueres.add(new Hamburguer("Comic Sans(duíche)", 24.50, ingredientesComicSans));

        List<String> ingredientesCheemsBurguer = new ArrayList<>();
        ingredientesCheemsBurguer.add("Pão australiano");
        ingredientesCheemsBurguer.add("Carne suína");
        ingredientesCheemsBurguer.add("Queijo cheddar");
        ingredientesCheemsBurguer.add("Queijo suíço");
        ingredientesCheemsBurguer.add("Bacon crocante");
        ingredientesCheemsBurguer.add("Alface");
        ingredientesCheemsBurguer.add("Tomate");
        ingredientesCheemsBurguer.add("Cebola roxa");
        ingredientesCheemsBurguer.add("Molho de mostarda e mel");
        hamburgueres.add(new Hamburguer("CheemsBurguer", 25.50, ingredientesCheemsBurguer));

        List<String> ingredientesMortadelaChaves = new ArrayList<>();
        ingredientesMortadelaChaves.add("Pão francês");
        ingredientesMortadelaChaves.add("Carne bovina");
        ingredientesMortadelaChaves.add("Mortadela grelhada");
        ingredientesMortadelaChaves.add("Queijo provolone");
        ingredientesMortadelaChaves.add("Alface");
        ingredientesMortadelaChaves.add("Tomate");
        ingredientesMortadelaChaves.add("Maionese temperada");
        hamburgueres.add(new Hamburguer("Mortadela do Chaves", 24.00, ingredientesMortadelaChaves));

        List<String> ingredientesBBB = new ArrayList<>();
        ingredientesBBB.add("Pão de hambúrguer grande");
        ingredientesBBB.add("Carne bovina extra grande");
        ingredientesBBB.add("Queijo cheddar duplo");
        ingredientesBBB.add("Bacon crocante");
        ingredientesBBB.add("Alface");
        ingredientesBBB.add("Tomate");
        ingredientesBBB.add("Cebola roxa");
        ingredientesBBB.add("Molho BBQ");
        hamburgueres.add(new Hamburguer("BBB Big Bold Burger", 28.00, ingredientesBBB));

        return hamburgueres;
    }
}
