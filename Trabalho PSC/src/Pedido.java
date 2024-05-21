public class Pedido {
    private int numero;
    private String cliente;
    private String item;

    public Pedido(int numero, String cliente, String item) {
        this.numero = numero;
        this.cliente = cliente;
        this.item = item;
    }
    public int getNumero() {
        return numero;
    }
    public String getCliente() {
        return cliente;
    }
    public String getItem() {
        return item;
    }
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", cliente='" + cliente + '\'' + ", item='" + item + '\'' + '}';
    }
}