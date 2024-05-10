package dtos;

import java.time.YearMonth;

/**
 *
 * @author yohan
 */
public class TarjetaDTO {

    private Long id;
    private String numeroTarjeta;
    private YearMonth fechaVencimiento;
    private Integer cvv;
    private Float saldo;

    public TarjetaDTO() {
    }

    public TarjetaDTO(String numeroTarjeta, YearMonth fechaVencimiento, Integer cvv, Float saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.saldo = saldo;
    }

    public TarjetaDTO(Long id, String numeroTarjeta, YearMonth fechaVencimiento, Integer cvv, Float saldo) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.saldo = saldo;
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

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TarjetaDTO{");
        sb.append("id=").append(id);
        sb.append(", numeroTarjeta=").append(numeroTarjeta);
        sb.append(", fechaVencimiento=").append(fechaVencimiento);
        sb.append(", cvv=").append(cvv);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

}
