package cl.speedfast.main;

// Importar clases
import cl.speedfast.model.Pedido;
import cl.speedfast.model.PedidoComida;
import cl.speedfast.model.PedidoEncomienda;
import cl.speedfast.model.PedidoExpress;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ENTREGAS SPEEDFAST ===");
        System.out.println();

        // Crear los pedidos
        Pedido pedido1 = new PedidoComida(101, "Av. Libertador 1234", 4.5);
        Pedido pedido2 = new PedidoEncomienda(102, "Calle Los Robles 567", 8.0);
        Pedido pedido3 = new PedidoExpress(103, "Pasaje Central 89", 6.2);

        // Mostrar comida
        System.out.println("--- Tipo: Pedido Comida ---");
        pedido1.mostrarResumen();
        System.out.println("Tiempo estimado: " + pedido1.calcularTiempoEntrega() + " minutos");
        System.out.println();

        // Mostrar encomienda
        System.out.println("--- Tipo: Pedido Encomienda ---");
        pedido2.mostrarResumen();
        System.out.println("Tiempo estimado: " + pedido2.calcularTiempoEntrega() + " minutos");
        System.out.println();

        // Mostrar express
        System.out.println("--- Tipo: Pedido Express ---");
        pedido3.mostrarResumen();
        System.out.println("Tiempo estimado: " + pedido3.calcularTiempoEntrega() + " minutos");
        System.out.println();

        System.out.println("=====================================");
    }
}