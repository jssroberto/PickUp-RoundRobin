package cafeteria;

import dominio.Carrito;
import dominio.DetalleCarrito;
import dominio.DetallePedido;
import dominio.Pedido;
import java.util.List;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "productos_cafeteria")
public class ProductoCafeteria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;
    
    @Column(name = "precio", nullable = false)
    private Float precio;
    
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "descripcion", length = 200, nullable = true)
    private String descripcion;
    
    @Column(name = "cantidad_disponible", nullable = false)
    private Integer cantidadDisponible;
    
    @Column(name = "direccion_imagen", nullable = true)
    private String direccionImagen;
    
    public ProductoCafeteria() {
    }

    public ProductoCafeteria(Float precio, String nombre, Integer cantidadDisponible) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    public ProductoCafeteria(Float precio, String nombre, String descripcion, Integer cantidadDisponible) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
    }

    public ProductoCafeteria(Float precio, String nombre, String descripcion, Integer cantidadDisponible, String direccionImagen) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.direccionImagen = direccionImagen;
    }

    public ProductoCafeteria(Float precio, String nombre, Integer cantidadDisponible, String direccionImagen) {
        this.precio = precio;
        this.nombre = nombre;
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

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }
    
    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    
    public boolean estaDisponible(){
        return getCantidadDisponible()> 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", precio=").append(precio);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", cantidadDisponible=").append(cantidadDisponible);
        sb.append('}');
        return sb.toString();
    }
    
    
}
