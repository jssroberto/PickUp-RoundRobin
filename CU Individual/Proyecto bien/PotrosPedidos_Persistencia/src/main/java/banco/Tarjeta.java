package banco;

import java.io.Serializable;
import java.time.YearMonth;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Roberto García
 */
@Entity
@Table(name = "tarjetas")
public class Tarjeta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarjeta")
    private Long id;

    @Column(name = "numero_tarjeta", length = 19, nullable = false, unique = true)
    private String numeroTarjeta;

    @Column(name = "fecha_vencimiento", nullable = false)
    @Convert(converter = ConvertidorMesAnio.class)
    private YearMonth fechaVencimiento;

    @Column(name = "cvv", length = 4, nullable = false)
    private Integer cvv;

    public Tarjeta() {
    }

    public Tarjeta(String numeroTarjeta, YearMonth fechaVencimiento, Integer cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    public Tarjeta(Long id, String numeroTarjeta, YearMonth fechaVencimiento, Integer cvv) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public YearMonth getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(YearMonth fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

}
