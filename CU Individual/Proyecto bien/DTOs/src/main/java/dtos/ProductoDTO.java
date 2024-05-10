package dtos;

/**
 *
 * @author yohan
 */
public class ProductoDTO {

    private String id;
    private String codigoProducto;
    private String nombre;
    private Float precio;
    private Integer puntosCuesta, puntosGenera;
    private String descripcion;
    private String direccionImagen;

    public ProductoDTO() {
    }

    public ProductoDTO(String codigoProducto, String nombre, Float precio, Integer puntosCuesta, Integer puntosGenera, String direccionImagen) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = puntosCuesta;
        this.puntosGenera = puntosGenera;
        this.direccionImagen = direccionImagen;
    }
    
    public ProductoDTO(String codigoProducto, String nombre, Float precio, Integer puntosCuesta, Integer puntosGenera, String descripcion, String direccionImagen) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = puntosCuesta;
        this.puntosGenera = puntosGenera;
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
    }

    public ProductoDTO(String id, String codigoProducto, String nombre, Float precio, Integer puntosCuesta, Integer puntosGenera, String descripcion, String direccionImagen) {
        this.id = id;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = puntosCuesta;
        this.puntosGenera = puntosGenera;
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoDTO{");
        sb.append("id=").append(id);
        sb.append(", codigoProducto=").append(codigoProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", puntosCuesta=").append(puntosCuesta);
        sb.append(", puntosGenera=").append(puntosGenera);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", direccionImagen=").append(direccionImagen);
        sb.append('}');
        return sb.toString();
    }

    
}
