package cl.speedfast.model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10; // Base de 10 min

        // Acceso al atributo a través del getter getDistanciaKm()
        if (getDistanciaKm() > 5) {
            tiempo += 5; // 5 min extra si supera los 5 km
        }

        return tiempo;
    }
}