package practica06_MPO.models;

/**
 * Clase Pedido
 *
 * @author Alumno - Daniel
 * @version 1.0
 */
public class Pedido {
    //Atributos
    private String id;
    private String nombreCliente;
    private String plato;
    private double precio;

    //Constructor
    /**
     *
     * @param id establece el id del pedido
     * @param nombreCliente establece el nombre del cliente del pedido
     * @param plato establece el plato del pedido
     * @param precio establece el precio del pedido
     */
    public Pedido(String id, String nombreCliente, String plato, double precio) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.plato = plato;
        this.precio = precio;
    }

    //Getters y Setters
    /**
     * Getter del atributo id
     *
     * @return el id del pedido
     */
    public String getId() {
        return id;
    }

    /**
     * Setter del atributo id
     *
     * @param id establece el id del pedido
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter del atributo nombreCliente
     *
     * @return el nombreCliente del pedido
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Setter del atributo nombreCliente
     *
     * @param nombreCliente establece el nombre del cliente del pedido
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Getter del atributo plato
     *
     * @return el plato del pedido
     */
    public String getPlato() {
        return plato;
    }

    /**
     * Setter del atributo plato
     *
     * @param plato establece el plato del pedido
     */
    public void setPlato(String plato) {
        this.plato = plato;
    }

    /**
     * Getter del atributo precio
     *
     * @return el precio del pedido
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del atributo precio
     *
     * @param precio establece el precio del pedido
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para mostrar los datos del pedido
     *
     * @return texto formateado con los datos del pedido
     */
    @Override
    public String toString() {
        return String.format("Pedido: %s - Nombre del Cliente: %s - Plato: %s - Precio: %2f", id, nombreCliente, plato, precio);
    }
}
