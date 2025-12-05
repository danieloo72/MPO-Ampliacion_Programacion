package Practica04_MPO;

public class Producto {

    private String codigo;
    private double precio;

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * metodo que da el código y el precio del producto
     * @return
     */
    @Override
    public String toString() {
        return "Producto{" + "Código:" + codigo + " | Precio:" + precio + '}';
    }
}
