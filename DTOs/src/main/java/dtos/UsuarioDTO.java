package dtos;

import java.util.List;

/**
 *
 * @author Roberto García
 */
public class UsuarioDTO {
    private String id;
    private String idCia;
    private String nombre, apellidoPaterno, apellidoMaterno;
    private CarritoDTO carrito;
    private Integer saldoPuntos;
    private List<String> pedidos;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String idCia, String nombre, String apellidoPaterno, String apellidoMaterno, CarritoDTO carrito, Integer saldoPuntos, List<String> pedidos) {
        this.idCia = idCia;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
    }

    public UsuarioDTO(String id, String idCia, String nombre, String apellidoPaterno, String apellidoMaterno, CarritoDTO carrito, Integer saldoPuntos, List<String> pedidos) {
        this.id = id;
        this.idCia = idCia;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        StringBuilder sb = new StringBuilder();
        sb.append("UsuarioDTO{");
        sb.append("id=").append(id);
        sb.append(", idCia=").append(idCia);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", carrito=").append(carrito);
        sb.append(", saldoPuntos=").append(saldoPuntos);
        sb.append(", pedidos=").append(pedidos);
        sb.append('}');
        return sb.toString();
    }

    
    
   
    
    
}
