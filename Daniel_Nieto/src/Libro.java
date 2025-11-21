/**
 * Clase Libro
 *
 * @author Alumno - Daniel
 * @version 1.0
 */
public class Libro {

    //Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    //Constructores

    /**
     * Constructor principal de la clase Libro
     *
     * @param titulo establece el titulo del libro
     * @param autor establece el nombre del autor del libro
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Getters y Setters

    /**
     * Getter del atributo titulo
     *
     * @return el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del atributo titulo
     *
     * @param titulo establece el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del atributo autor
     *
     * @return el nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter del atributo autor
     *
     * @param autor establece el nombre del autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter del atributo paginas
     *
     * @return el numero de paginas que tiene el libro
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Setter del atributo paginas
     *
     * @param paginas establece el numero de paginas que tiene el libro
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * Metodo para mostrar los datos del libro
     *
     * @return texto formateado con los datos del libro
     */
    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s", titulo, autor);
    }
}
