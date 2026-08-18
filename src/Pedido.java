public class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Para sobrescribir
    public void asignarRepartidor() {
        System.out.println("Pedido #" + idPedido + " (" + tipoPedido + "): Buscando un repartidor genérico...");
    }

    // Con parámetro
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido #" + idPedido + " (" + tipoPedido + "): Asignado manualmente a " + nombreRepartidor + ".");
    }

    // Getters
    public int getIdPedido() { return idPedido; }
    public String getDireccionEntrega() { return direccionEntrega; }
    public String getTipoPedido() { return tipoPedido; }
}