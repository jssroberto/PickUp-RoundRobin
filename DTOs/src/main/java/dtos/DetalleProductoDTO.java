package dtos;

/**
 *
 * @author galan
 */
public class DetalleProductoDTO {

    private String id;
    private Integer cantidad;
    private Float subtotal;
    //desnormalización
    private String nombre;
    private Float precio;
    private Integer puntosCuesta, puntosGenera;
    private String direccionImagen;
    private String codigoProducto;

    public DetalleProductoDTO() {
    }

    public DetalleProductoDTO(Integer cantidad, String codigoProducto) {
        this.cantidad = cantidad;
        this.codigoProducto = codigoProducto;
    }

    public DetalleProductoDTO(Integer cantidad, Float subtotal, String nombre, Float precio, Integer puntosCuesta, Integer puntosGenera, String direccionImagen, String codigoProducto) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = puntosCuesta;
        this.puntosGenera = puntosGenera;
        this.direccionImagen = direccionImagen;
        this.codigoProducto = codigoProducto;
    }

    public DetalleProductoDTO(String id, Integer cantidad, Float subtotal, String nombre, Float precio, Integer puntosCuesta, Integer puntosGenera, String direccionImagen, String codigoProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = puntosCuesta;
        this.puntosGenera = puntosGenera;
        this.direccionImagen = direccionImagen;
        this.codigoProducto = codigoProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getPuntosCuesta() {
        return puntosCuesta;
    }

    public void setPuntosCuesta(Integer puntosCuesta) {
        this.puntosCuesta = puntosCuesta;
    }

    public Integer getPuntosGenera() {
        return puntosGenera;
    }

    public void setPuntosGenera(Integer puntosGenera) {
        this.puntosGenera = puntosGenera;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetalleProductoDTO{");
        sb.append("id=").append(id);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", subtotal=").append(subtotal);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", puntosCuesta=").append(puntosCuesta);
        sb.append(", puntosGenera=").append(puntosGenera);
        sb.append(", direccionImagen=").append(direccionImagen);
        sb.append(", codigoProducto=").append(codigoProducto);
        sb.append('}');
        return sb.toString();
    }

}
