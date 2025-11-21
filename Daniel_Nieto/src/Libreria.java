/*
    Alumno - Daniel Nieto
    DAW - Ampliación de Programación
    21/11/2025
 */

public class Libreria {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Quijote", "Cervantes" ,300);
        Libro libro2 = new Libro("Fundación", "Isaac Asimov", 500);
        Libro libro3 = new Libro("It", "Stephen King", 250);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("=== TODOS LOS LIBROS ===");
        biblioteca.mostrarLibro();

        System.out.println("=== BÚSQUEDA POR AUTOR: Cervantes ===");
        biblioteca.buscarPorAutor("Cervantes");

        System.out.println("=== BÚSQUEDA POR NÚMERO DE PÁGINAS ===");
        biblioteca.numeroPaginas(200, 300);
    }
}
