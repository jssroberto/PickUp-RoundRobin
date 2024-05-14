package prueba;

import DAOs.PedidoDAO;
import DAOs.UsuarioDAO;
import IDAOs.IPedidoDAO;
import IDAOs.IUsuarioDAO;
import dominio.Pedido;
import dominio.Usuario;
import excepciones.PersistenciaException;
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
        try {
            
            
            Pedido pedido = pedidoDAO.consultarPorId("6641fa39b4fa762fef8b4c03");
            System.out.println(pedido.getEtiquetaPedido());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PruebaPedidos.class.getName()).log(Level.SEVERE, "No hay pedidos");
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
