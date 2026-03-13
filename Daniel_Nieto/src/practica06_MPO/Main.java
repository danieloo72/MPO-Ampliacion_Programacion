package practica06_MPO;

import practica06_MPO.controller.PedidoController;
import practica06_MPO.models.Pedido;
import practica06_MPO.recursos.MyScanner;

public class Main {
    private static final MyScanner sc = new MyScanner();
    private static final PedidoController controller = new PedidoController();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int opcion;
        do {
            opcion = sc.pedirNumero("==== GESTION DE PEDIDOS ====" +
                    "\n1. Registrar pedido" +
                    "\n2. Mostrar pedidos" +
                    "\n3. Guardar pedidos en fichero" +
                    "\n4. Cargar pedidos desde fichero" +
                    "\n5. Salir" +
                    "\nOpcion: ");
            switch (opcion) {
                case 1:
                    controller.agregarPedido();
                    break;
                case 2:
                    controller.mostrarPedidos();
                    break;
                case 3:
                    controller.guardar();
                    break;
                case 4:
                    controller.cargar();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }
}

