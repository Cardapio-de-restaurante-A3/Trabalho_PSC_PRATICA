import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private String email;

    public Cliente(String nome, int idade, String email) {            //Define o construtor da classe e declara 
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

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
