package practica06_MPO.controller;

import practica06_MPO.exceptions.PedidoException;
import practica06_MPO.models.Pedido;
import practica06_MPO.recursos.MyScanner;
import practica06_MPO.service.PedidoService;

public class PedidoController {

    private static final MyScanner sc = new MyScanner();
    private static final PedidoService service = new PedidoService();

    public void agregarPedido() {
        boolean correcto;
        do {
            correcto = true;
            String id = getId();
            Pedido pedido = service.getPedido(id);
            if (pedido != null) {
                System.out.println("El codigo ya está asociado a un pedido.");
                correcto = false;
            } else {
                String nombreCliente = sc.pedirSoloTexto("Introduce el nombre del cliente: ");
                String plato =  sc.pideTexto("Introduce el plato: ");
                double precio = sc.pedirDecimal("Introduce el precio: ");
                if (precio <= 0) {
                    System.out.println("El precio no puede ser negativo.");
                    correcto = false;
                }
                service.addPedido(new Pedido(id, nombreCliente, plato, precio));
                System.out.println("Pedido registrado correctamente.");
            }
        } while (!correcto);
    }

    public void mostrarPedidos() {
        for (Pedido pedido : service.getPedidos()) {
            System.out.println(pedido);
        }
    }

    public void cargar() {
        service.cargar();

    }

    public void guardar() {
        try {
            service.guardar();
        } catch (PedidoException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getId() {
        String regex = "^[A-Z]{3}[0-9]{2}$";
        String id;
        do {
            id = sc.pideTexto("Introduce el id del pedido, 3 letras y 2 números: ").toUpperCase();
        } while (!id.matches(regex));
        return id;
    }
}
