package org.itson.disenosw.dtos;

/**
 *
 * @author Roberto García
 */
public class UsuarioDTO {
    private Long id;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    public UsuarioDTO(Long id) {
        this.id = id;
    }

    public UsuarioDTO(Long id, String nombres, String apellidoPaterno, String apellidoMaterno) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    
    
}
