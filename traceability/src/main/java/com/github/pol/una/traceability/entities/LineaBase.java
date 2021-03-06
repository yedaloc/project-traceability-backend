package com.github.pol.una.traceability.entities;

import javax.persistence.*;

public class LineaBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @Column (name = "id_fase")
    private long idFase;

    @Column(name = "estado")
    private String estado;

    @Column (name = "fecha_alta")
    private String fechaAlta;

    @Column (name = "fecha_modificacion")
    private String fechaModificacion;

    @Column (name = "usuario_modificacion")
    private long usuarioModificacion;

    @Column(name = "usuario_alta")
    private long usuarioAlta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdFase() {
        return idFase;
    }

    public void setIdFase(long idFase) {
        this.idFase = idFase;
    }

    public String getEstado() { return estado; }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public long getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(long usuarioModificacion) { this.usuarioModificacion = usuarioModificacion; }

    public long getUsuarioAlta() {return usuarioAlta; }

    public void setUsuarioAlta(long usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

}
