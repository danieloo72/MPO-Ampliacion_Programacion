package practica06_MPO.service;

import practica06_MPO.exceptions.PedidoException;
import practica06_MPO.models.Pedido;
import practica06_MPO.persistence.PedidoDAO;

import java.util.ArrayList;

public class PedidoService {

    private ArrayList<Pedido> pedidos;
    private PedidoDAO dao;

    public PedidoService() {
        pedidos = new ArrayList<>();
        dao = new PedidoDAO();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido getPedido(String codigo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(codigo)) {
                return pedido;
            }
        }
        return null;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cargar() {
        pedidos = dao.cargar();
    }

    public void guardar() throws PedidoException {
        dao.guardar(pedidos);
    }
}
