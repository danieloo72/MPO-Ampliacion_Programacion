package practica05_MPO;

public class Libro {

    //Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Constructor

    /**
     *
     * @param isbn establece el isbn del libro
     * @param titulo establece el titulo del libro
     * @param autor establece el autor del libro
     * @param anioPublicacion establece año de publicacion código del libro
     */
    public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Getters y Setters

    /**
     * Getter del atributo isbn
     *
     * @return el isbn del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Setter del atributo isbn
     *
     * @param isbn establece el isbn del libro
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


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
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter del atributo autor
     *
     * @param autor establece el autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter del atributo año de publicacion
     *
     * @return el año de publicacion del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Setter del atributo anioPublicacion
     *
     * @param anioPublicacion establece el año de publicacion del libro
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Metodo para mostrar los datos del producto
     *
     * @return texto formateado con los datos del producto
     */
    @Override
    public String toString() {
        return String.format("ISBN: %s,\n\tDescripción: %s, %s, %d", isbn, titulo, autor, anioPublicacion);
    }

    /**
     * Metodo que compara un producto con otro objeto
     *
     * @param obj objeto a comparar
     * @return true si los codigos coinciden, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;

        return this.isbn != null ? this.isbn.equals(libro.isbn) : libro.isbn == null;
    }

    /**
     * Metodo que genera un hash basado en el codigo producto
     *
     * @return valor hash del producto
     */
    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }
}
