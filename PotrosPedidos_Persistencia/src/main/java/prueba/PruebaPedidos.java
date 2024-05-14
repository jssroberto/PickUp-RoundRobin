package prueba;

import DAOs.PedidoDAO;
import DAOs.UsuarioDAO;
import IDAOs.IPedidoDAO;
import IDAOs.IUsuarioDAO;
import dominio.DetalleProducto;
import dominio.MetodoPago;
import dominio.Pedido;
import dominio.Usuario;
import excepciones.PersistenciaException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto García
 */
public class PruebaPedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        IUsuarioDAO usuarioDAO = new UsuarioDAO();
//        Usuario usuario = new Usuario();
//        usuario.setIdCia("00000240157");
//        usuario = usuarioDAO.consultarUsuario(usuario);
//        System.out.println(usuario.getId().toString());
        IPedidoDAO pedidoDAO = new PedidoDAO();

        List<DetalleProducto> productos;
        try {
            productos = pedidoDAO.consultarDetalleProductosPorIdPedido("6642de7044a4e34b81505bbc");
            System.out.println(productos.get(0).getNombre());

//            pedidoDAO.persistir(new Pedido("54564", "10", "456", LocalDate.now(), 1, 1000.0, MetodoPago.EFECTIVO, new DetalleProducto(Integer.SIZE, Float.NaN, nombre, Float.NaN, Integer.MIN_VALUE, Integer.MIN_VALUE, direccionImagen, codigoProducto)));
        } catch (PersistenciaException ex) {
            Logger.getLogger(PruebaPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            IUsuarioDAO usuarioDAO = new UsuarioDAO();
//            Usuario usuario = usuarioDAO.consultarUsuario("00000011211");
//            System.out.println(usuario.getNombre());
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(PruebaPedidos.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
