package dtos;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Roberto García
 */
public class UsuarioDTO {
    private ObjectId id;
    private String idCia;
    private String Nombre, apellidoPaterno, apellidoMaterno;
    private CarritoDTO carrito;
    private Integer saldoPuntos;
    private List<String> pedidos;

    public UsuarioDTO(ObjectId id, String idCia, String Nombre, String apellidoPaterno, String apellidoMaterno, CarritoDTO carrito, Integer saldoPuntos, List<String> pedidos) {
        this.id = id;
        this.idCia = idCia;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
    }

    public UsuarioDTO(String idCia, String Nombre, String apellidoPaterno, String apellidoMaterno, CarritoDTO carrito, Integer saldoPuntos, List<String> pedidos) {
        this.idCia = idCia;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
    }

    public UsuarioDTO() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getIdCia() {
        return idCia;
    }

    public void setIdCia(String idCia) {
        this.idCia = idCia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public CarritoDTO getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoDTO carrito) {
        this.carrito = carrito;
    }

    public Integer getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setSaldoPuntos(Integer saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    public List<String> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<String> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", idCia=" + idCia + ", Nombre=" + Nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", Fechanacimiento=" + Fechanacimiento + ", carrito=" + carrito + ", saldoPuntos=" + saldoPuntos + ", pedidos=" + pedidos + '}';
    }
    
   
    
    
}
