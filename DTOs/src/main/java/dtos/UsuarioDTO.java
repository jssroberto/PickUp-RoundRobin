package dtos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Roberto García
 */
public class UsuarioDTO {
    private String id;
    private String idCia;
    private String Nombre, apellidoPaterno, apellidoMaterno;
    private Date Fechanacimiento;
    private CarritoDTO carrito;
    private Integer saldoPuntos;
    private List<PedidoDTO> pedidos;

    public UsuarioDTO(String id, String idCia, String Nombre, String apellidoPaterno, String apellidoMaterno, Date Fechanacimiento, CarritoDTO carrito, Integer saldoPuntos, List<PedidoDTO> pedidos) {
        this.id = id;
        this.idCia = idCia;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Fechanacimiento = Fechanacimiento;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
    }

    public UsuarioDTO(String idCia, String Nombre, String apellidoPaterno, String apellidoMaterno, Date Fechanacimiento, CarritoDTO carrito, Integer saldoPuntos, List<PedidoDTO> pedidos) {
        this.idCia = idCia;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Fechanacimiento = Fechanacimiento;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
    }

    public UsuarioDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(Date Fechanacimiento) {
        this.Fechanacimiento = Fechanacimiento;
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

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", idCia=" + idCia + ", Nombre=" + Nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", Fechanacimiento=" + Fechanacimiento + ", carrito=" + carrito + ", saldoPuntos=" + saldoPuntos + ", pedidos=" + pedidos + '}';
    }
    
   
    
    
}
