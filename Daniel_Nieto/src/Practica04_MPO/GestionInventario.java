package Practica04_MPO;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class GestionInventario {

    private static final Scanner sc = new Scanner(System.in);
    private static Map<String, Double> inventario = new HashMap<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println("==== GESTIÓN DE INVENTARIO ====");
                System.out.println("1. Añadir producto" +
                        "\n2. Buscar producto" +
                        "\n3. Actualizar precio" +
                        "\n4. Mostrar inventario" +
                        "\n5. Salir" +
                        "\nOpcion: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        añadirProducto();
                        break;
                    case 2:
                        buscarProducto();
                        break;
                    case 3:
                        actualizarPrecio();
                        break;
                    case 4:
                        mostrarInventario();
                        break;
                    case 5:
                        System.out.println("Saliendo ...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La opción tiene que ser numérica!");
                sc.nextLine();
            }
        } while (opcion != 5);
    }

    /**
     * metodo que actualiza el precio del producto a uno nuevo
     * @throws ProductoNoEncontradoException lanza una excepción cuando no se encuentra el producto
     * @throws PrecioInvalidoException lanza una exceptcion cuando el precio no es valido
     */
    public static void actualizarPrecio() throws ProductoNoEncontradoException, PrecioInvalidoException {
        System.out.println("Introduzca el código del producto: ");
        String codigo = sc.nextLine();
        boolean existe = inventario.containsKey(codigo);
        if (!existe) {
            throw new ProductoNoEncontradoException("Código de producto no encontrado!");
        }
        System.out.println("Introduzca el nuevo precio del producto: ");
        double nuevoPrecio = sc.nextDouble();
        try {
            if (nuevoPrecio > 0) {
                inventario.put(codigo, nuevoPrecio);
            }
        } catch (PrecioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * metodo que muestra los productos que hay en el inventario
     */
    public static void mostrarInventario() {
        if (inventario.size() == 0) {
            System.out.println("No hay ningún producto en el inventario.");
        } else {
            for (int i = 0; i <= inventario.size(); i++) {
                System.out.println(i + " - " + inventario.get(inventario.get(i)));
            }
        }
    }

    /**
     * metodo que busca productos dentro del inventario
     */
    public static void buscarProducto() {
        System.out.println("Introduce el código del producto que quieres buscar: ");
        String codigo = sc.nextLine();
        try {
            if (inventario.containsKey(codigo)) {
                System.out.println("Producto encontrado, código del producto: " + inventario.get(codigo));
            } else {
                throw new ProductoNoEncontradoException("Producto no encontrado!");
            }
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * metodo que añade un producto al inventario
     */
    public static void añadirProducto() {
        String codigo = "";
        Double precio = 0.0;
        boolean correcto;

        do {
            try {
                codigo = validarCodigo();
                correcto = true;
            } catch (CodigoInvalidoException e) {
                correcto = false;
            }
        } while (!correcto);

        do {
            try {
                precio = validarPrecio();
                correcto = true;
            } catch (PrecioInvalidoException e) {
                correcto = false;
            }
        } while (!correcto);

        inventario.put(codigo, precio);
        System.out.println("Producto añadido correctamente!");
    }

    /**
     * metodo que valida que el codigo este bien
     * @return codigo del producto
     * @throws CodigoInvalidoException lanza una excepcion cuando el codigo no es valido
     */
    public static String validarCodigo() throws CodigoInvalidoException {
        System.out.println("Introduzca el codigo del producto: ");
        String codigo = sc.nextLine();
        if (codigo.length() >= 3 && codigo.matches("[A-Z0-9]+")) {
            return codigo;
        }
        throw new CodigoInvalidoException("Código de producto no válido");
    }

    /**
     * metodo que valida que el precio este bien
     * @return precio del producto
     * @throws PrecioInvalidoException lanza una excepcion cuando el precio no es valido
     */
    public static Double validarPrecio() throws PrecioInvalidoException {
        System.out.println("Introduzca el precio del producto: ");
        Double precio = sc.nextDouble();
        if (precio > 0) {
            return precio;
        }
        throw new PrecioInvalidoException("Precio no válido");
    }
}
