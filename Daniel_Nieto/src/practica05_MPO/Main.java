package practica05_MPO;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Clase GestionInventario
 *
 * @author Alumno - Daniel
 * @version 1.0
 */
public class Main {

    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Map<Libro, Integer> ejemplares = new LinkedHashMap<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("==== GESTIÓN BIBLIOTECA ====");
        boolean exit;
        do {
            exit = false;
            int opcion = sc.pedirNumero("1. Registrar libro" +
                    "\n2. Mostrar catálogo" +
                    "\n3. Gestionar ejemplares" +
                    "\n4. Salir" +
                    "\nSeleccione una opcion: ");
            switch (opcion) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    mostrarCatalogo();
                    break;
                case 3:
                    gestionarEjemplares();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!exit);
    }

    public static void registrarLibro() {
        boolean correcto;
        String isbn = "";
        do {
            correcto = true;
            try {
                isbn = sc.pideTexto("Introduce el ISBN del libro: ");
                if (isbn.equals("")) {
                    throw new IsbnInvalidoException("El ISBN no puede estar vacio.");
                } else if (isbn.length() < 5) {
                    throw new IsbnInvalidoException("El código tiene que tener al menos 5 caracteres.");
                } else {
                    for (Libro libro : libros) {
                        if (libro.getIsbn().equals(isbn)) {
                            throw new IsbnInvalidoException("El ISBN ya existe.");
                        }
                    }
                }
            } catch (IsbnInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        String titulo = sc.pedirSoloTexto("Introduce el titulo del libro: ");
        String autor = sc.pideTexto("Introduce el nombre del autor del libro: ");
        int anioPublicacion = 0;
        do {
            correcto = true;
            try {
                anioPublicacion = sc.pedirNumero("Introduce el año de publicacion del libro: ");
                if (anioPublicacion < 1) {
                    throw new AnioInvalidoException("El precio no tiene que ser negativo.");
                }
            } catch (AnioInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        libros.add(new Libro(isbn, titulo, autor, anioPublicacion));
    }

    public static void mostrarCatalogo() {
        for (Libro libro : ejemplares.keySet()) {
            System.out.printf("%s - Ejemplares disponible: %s\n", libro, ejemplares.get(libro));
        }
    }

    public static void gestionarEjemplares() {
        boolean correcto;
        for (Libro libro : libros) {
            int cantidad = 0;
            do {
                correcto = true;
                try {
                    System.out.println(libro);
                    cantidad = sc.pedirNumero("Introduce el número de ejemplares del libro: ");
                    if (cantidad < 0) {
                        throw new CantidadInvalidaException("La cantidad de ejemplares no puede ser negativa.");
                    }
                }  catch (CantidadInvalidaException e) {
                    System.out.println(e.getMessage());
                    correcto = false;
                }
            } while (!correcto);

            ejemplares.put(libro, cantidad);
        }
    }

}
