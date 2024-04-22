package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "carritos")
public class Carrito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Long id;
    
    @Column(name = "total", nullable = false)
    private Float total;

    @Column(name = "cantidad_productos", nullable = false)
    private Integer cantidadProductos;
    
    @OneToOne
    @JoinColumn(name = "id_usuario") //referecedColumnName
    private Usuario usuario;
    
    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL)
    private List<DetalleCarrito> detalleCarrito;

    public Carrito() {
    }

    public Carrito(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Carrito(Float total, Integer cantidadProductos, Usuario usuario, List<DetalleCarrito> detalleCarrito) {
        this.total = total;
        this.cantidadProductos = cantidadProductos;
        this.usuario = usuario;
        this.detalleCarrito = detalleCarrito;
    }

    public Carrito(Float total, Integer cantidadProductos, Usuario usuario) {
        this.total = total;
        this.cantidadProductos = cantidadProductos;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public List<DetalleCarrito> getDetalleCarrito() {
        return detalleCarrito;
    }

    public void setDetalleCarrito(List<DetalleCarrito> detalleCarrito) {
        this.detalleCarrito = detalleCarrito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrito{");
        sb.append("id=").append(id);
        sb.append(", total=").append(total);
        sb.append(", cantidadProductos=").append(cantidadProductos);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }    

}
