
import dominio.Pedido;
import interfaces.IPedidoBO;
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
            Pedido pe = new Pedido();
            pe.setEtiquetaPedido("123455");
            System.out.println(b.consultarPedido(pe));
    }
    
}
