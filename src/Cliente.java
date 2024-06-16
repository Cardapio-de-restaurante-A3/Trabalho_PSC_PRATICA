import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * A classe Cliente representa um cliente com seu nome, idade e email.
 */
public class Cliente {
    private String nome;
    private int idade;
    private String email;

    /**
     * Construtor da classe Cliente.
     *
     * @param nome  O nome do cliente.
     * @param idade A idade do cliente.
     * @param email O email do cliente.
     */
    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    /**
     * Retorna o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a idade do cliente.
     *
     * @return A idade do cliente.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna o email do cliente.
     *
     * @return O email do cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Salva o total de clientes em um arquivo CSV.
     *
     * @param clientes A lista de clientes.
     */
    public static void salvarTotalClientesCSV(List<Cliente> clientes) {
        try (FileWriter writer = new FileWriter("total_clientes.csv")) {
            writer.append("Total de Clientes\n");
            writer.append(String.valueOf(clientes.size()));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}