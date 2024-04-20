package dominio;

import cafeteria.ProductoCafeteria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoPedido estado;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario") //referenced column name
    private Usuario usuario;
    
    @ManyToMany
    @JoinTable(name = "pedidos_productos", 
            joinColumns = @JoinColumn(name = "id_pedido"), 
            inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private List<ProductoCafeteria> productos;

    public Pedido() {
    }

    public Pedido(EstadoPedido estado, Usuario usuario) {
        this.estado = estado;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<ProductoCafeteria> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoCafeteria> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido{");
        sb.append("id=").append(id);
        sb.append(", estado=").append(estado);
        sb.append(", usuario=").append(usuario);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }
    
}
