package objetosNegocio;

import convertidores.ConvertidorDAOaDTO;
import convertidores.ConvertidorDTOaDAO;
import daos.UsuarioDAO;
import dominio.Pedido;
import dominio.Usuario;
import dtos.UsuarioDTO;
import excepciones.PersistenciaException;
import excepciones.BOException;
import interfaces.IUsuarioBO;

/**
 *
 * @author yohan
 */
public class UsuarioBO implements IUsuarioBO{

    UsuarioDAO usuarios = new UsuarioDAO();
    ConvertidorDAOaDTO convertir = new ConvertidorDAOaDTO();
    ConvertidorDTOaDAO c = new ConvertidorDTOaDAO();

    @Override
    public void persistir(UsuarioDTO usuario) throws BOException {
        if (usuario == null) {
            throw new BOException("Usuario vacio");
        } else {
            try {
                usuarios.persistir(c.convertirDTOenDAO(usuario));
            } catch (PersistenciaException ex) {
                throw new BOException(ex.getMessage(), ex);

            }
        }
    }

    @Override
    public UsuarioDTO consultarUsuario(UsuarioDTO usuario) throws BOException {

        if (usuario == null) {
            throw new BOException("Usuario vacio");
        } else {
            try {
                return convertir.convertirDAOenDTO(usuarios.consultarUsuario(c.convertirDTOenDAO(usuario)));
            } catch (PersistenciaException ex) {
                throw new BOException(ex.getMessage(), ex);
            }
        }
    }

    public void referenciarPedido(Usuario usuario, Pedido pedido) {

    }
}
