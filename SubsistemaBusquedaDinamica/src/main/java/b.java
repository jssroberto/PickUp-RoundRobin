
import BOs.BusquedaBO;
import Interfaz.IBusquedaBO;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yohan
 */
public class b {
      public static void main(String[] args)  throws PersitenciaException{
        System.out.println("Hello World!");
        IBusquedaBO b = new BusquedaBO();
     
        List<ProductoCafeteriaDTO> pa = b.consultarProductos("h");

        for (ProductoCafeteriaDTO prrr : pa) {
            System.out.println(prrr.getNombre());
        }
    }
}