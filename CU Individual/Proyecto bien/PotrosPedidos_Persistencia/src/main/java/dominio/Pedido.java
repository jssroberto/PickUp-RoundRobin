package dominio;

import cafeteria.ProductoCafeteria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
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
    
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePedido> detallePedido;
    

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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido{");
        sb.append("id=").append(id);
        sb.append(", estado=").append(estado);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }
    
}
