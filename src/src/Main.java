public class Main {
    public static void main(String[] args) {
        // 1. Crear objetos de cada subclase
        Pedido pedido1 = new PedidoComida(101, "Av. Providencia 1234");
        Pedido pedido2 = new PedidoEncomienda(102, "Calle Las Flores 456");
        Pedido pedido3 = new PedidoExpress(103, "Av. Libertador 789");

        // 2. Ejecutar métodos sobrescritos
        System.out.println("=== ASIGNACIÓN AUTOMÁTICA (SOBREESCRITURA) ===");
        pedido1.asignarRepartidor();
        System.out.println();
        pedido2.asignarRepartidor();
        System.out.println();
        pedido3.asignarRepartidor();
        System.out.println();

        // 3. Ejecutar métodos con parámetro
        System.out.println("=== ASIGNACIÓN CON NOMBRE (SOBRECARGA) ===");
        pedido1.asignarRepartidor("Juan Pérez");
        System.out.println();
        pedido2.asignarRepartidor("Camila Soto");
        System.out.println();
        pedido3.asignarRepartidor("Luis Díaz");
    }
}