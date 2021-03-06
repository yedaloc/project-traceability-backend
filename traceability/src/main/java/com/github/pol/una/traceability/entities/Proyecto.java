package com.github.pol.una.traceability.entities;

import javax.persistence.*;


public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column (name = "fecha_inicio")
    private String fechaInicio;

    @Column (name = "fecha_fin")
    private String fechaFin;

    @Id
    @Column (name = "id_lider")
    private long idLider;

    @Column (name = "fecha_alta")
    private String fechaAlta;

    @Column (name = "fecha_modificacion")
    private String fechaModificacion;

    @Column(name = "usuario_alta")
    private long usuarioAlta;

    @Column (name = "usuario_modificacion")
    private long usuarioModificacion;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaInicio() { return fechaInicio; }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public long getIdLider() { return idLider; }

    public void setIdLider(long idLider) {
        this.idLider = idLider;
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

    public long getUsuarioAlta() { return usuarioAlta; }

    public void setUsuarioAlta(long usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    public long getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(long usuarioModificacion) { this.usuarioModificacion = usuarioModificacion; }
}
