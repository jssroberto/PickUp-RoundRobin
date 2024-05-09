package dominio;


import dominio.Carrito;
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
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;
    
    @Column(name = "precio", nullable = false)
    private Float precio;
    
    @Column(name = "nombre", length = 50, nullable = false, unique=true)
    private String nombre;
    
    @Column(name = "descripcion", length = 200, nullable = true)
    private String descripcion;
    
    @Column(name = "id_producto_cafeteria", nullable=false)
    private Long idProductoCafeteria;
    
    @Column(name = "direccion_imagen", nullable = true)
    private String direccionImagen;
    
    @OneToMany(mappedBy = "producto" , cascade = CascadeType.ALL)
    private List<DetalleCarrito> detallesCarrito;
    
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetallePedido> detallesPedido;

    public Producto() {
    }

    public Producto(Float precio, String nombre, Long idProductoCafeteria) {
        this.precio = precio;
        this.nombre = nombre;
        this.idProductoCafeteria= idProductoCafeteria;
    }

    public Producto(Float precio, String nombre, String descripcion, Long idProductoCafeteria) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idProductoCafeteria= idProductoCafeteria;
    }

    public Producto(Float precio, String nombre, String descripcion, String direccionImagen, Long idProductoCafeteria) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
        this.idProductoCafeteria= idProductoCafeteria;
    }


    public Producto(Float precio, String nombre, String descripcion) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    

    public Long getId() {
        return id;
    }

    public Long getIdProductoCafeteria() {
        return idProductoCafeteria;
    }

    public void setIdProductoCafeteria(Long idCafeteria) {
        this.idProductoCafeteria = idCafeteria;
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

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }
    
    public List<DetalleCarrito> getDetallesCarrito() {
        return detallesCarrito;
    }

    public void setDetallesCarrito(List<DetalleCarrito> detallesCarrito) {
        this.detallesCarrito = detallesCarrito;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", precio=").append(precio);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
