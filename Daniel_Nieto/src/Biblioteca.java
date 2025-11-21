import java.util.ArrayList;

/**
 * Clase Biblioteca
 *
 * @author Alumno - Daniel
 * @version 1.0
 */
public class Biblioteca {

    //Atributo
    private ArrayList<Libro> libros = new ArrayList<>();

    //Constructor

    /**
     * Constructor principal de la clase Biblioteca
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //Getter y Setter

    /**
     * Getter del atributo libros
     *
     * @return libros del ArrayList
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Setter del atributo libros
     *
     * @param libros establece los libros del ArrayList
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para agregar un libro a la lista de libros
     *
     * @param libro establece el libro que añades al ArrayList
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Metodo que muestra todos los libros que hay en la lista de libros
     */
    public void mostrarLibro() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    /**
     * Metodo que busca un libro de la lista de libros según el nombre del autor
     *
     * @param autor establece el nombre del autor para la busqueda del libro en la lista de libros
     */
    public void buscarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Metodo que busca un libro dependiendo del numero de paginas que tenga
     *
     * @param minimo establece el numero minimo de paginas que tiene el libro para su busqueda
     * @param maximo establece el numero maximo de paginas que tiene el libro para su busqueda
     */
    public void numeroPaginas(int minimo, int maximo) {
        for (Libro libro : libros) {
            if (libro.getPaginas() >= minimo && libro.getPaginas() <= maximo) {
                System.out.println(libro);
            }
        }
    }
}
