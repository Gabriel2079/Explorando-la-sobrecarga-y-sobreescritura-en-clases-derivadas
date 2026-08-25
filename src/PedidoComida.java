package cl.speedfast.model;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        // Acceso al atributo a través del getter getDistanciaKm()
        double tiempo = 15 + (2 * getDistanciaKm());
        return (int) Math.round(tiempo);
    }
}