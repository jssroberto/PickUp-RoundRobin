
import dominio.Pedido;
import dtos.PedidoDTO;
import interfaces.IPedidoBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetosNegocio.PedidosBO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jl4ma
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IPedidoBO b = new PedidosBO();
        try {

            List<PedidoDTO> lista = b.consultarPedidos("6641fa5323acc61bb9eb6eed");
            for (PedidoDTO pedidoDTO : lista) {
                System.out.println(pedidoDTO.getClaveRecoleccion());
            }
        } catch (Exception ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        Pedido pe = new Pedido();
        pe.setEtiquetaPedido("123455");
        System.out.println(b.consultarPedido(pe));
    }

}
