package com.siequichh.moviesearch.movie_search.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DetallesAlquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetallesAlquiler;
    private Date fecha;
    private String idPelicula;

    @ManyToOne
    @JoinColumn(name = "id_alquiler")
    private HistorialAlquiler historialAlquiler;

    public DetallesAlquiler() {}

    public DetallesAlquiler(Date fecha, String idPelicula, HistorialAlquiler historialAlquiler) {
        this.fecha = fecha;
        this.idPelicula = idPelicula;
        this.historialAlquiler = historialAlquiler;
    }

    public DetallesAlquiler(Long idDetallesAlquiler, Date fecha, String idPelicula, HistorialAlquiler historialAlquiler) {
        this.idDetallesAlquiler = idDetallesAlquiler;
        this.fecha = fecha;
        this.idPelicula = idPelicula;
        this.historialAlquiler = historialAlquiler;
    }

    public Long getIdDetallesAlquiler() {
        return idDetallesAlquiler;
    }

    public void setIdDetallesAlquiler(Long idDetallesAlquiler) {
        this.idDetallesAlquiler = idDetallesAlquiler;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public HistorialAlquiler getHistorialAlquiler() {
        return historialAlquiler;
    }

    public void setHistorialAlquiler(HistorialAlquiler historialAlquiler) {
        this.historialAlquiler = historialAlquiler;
    }
}
