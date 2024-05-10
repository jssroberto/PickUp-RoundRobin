package dtos;

/**
 *
 * @author galan
 */
public class ProductoCafeteriaDTO {

    private Long id;
    private String codigoProducto;
    private Float precio;
    private String nombre;
    private String descripcion;
    private Integer cantidadDisponible;
    private String direccionImagen;

    public ProductoCafeteriaDTO() {
    }

    public ProductoCafeteriaDTO(String codigoProducto, Float precio, String nombre, Integer cantidadDisponible, String direccionImagen) {
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.direccionImagen = direccionImagen;
    }

    public ProductoCafeteriaDTO(String codigoProducto, Float precio, String nombre, String descripcion, Integer cantidadDisponible, String direccionImagen) {
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.direccionImagen = direccionImagen;
    }
    
    public ProductoCafeteriaDTO(Long id, String codigoProducto, Float precio, String nombre, String descripcion, Integer cantidadDisponible, String direccionImagen) {
        this.id = id;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.direccionImagen = direccionImagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
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
        sb.append("ProductoCafeteriaDTO{");
        sb.append("id=").append(id);
        sb.append(", codigoProducto=").append(codigoProducto);
        sb.append(", precio=").append(precio);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", cantidadDisponible=").append(cantidadDisponible);
        sb.append(", direccionImagen=").append(direccionImagen);
        sb.append('}');
        return sb.toString();
    }
}
