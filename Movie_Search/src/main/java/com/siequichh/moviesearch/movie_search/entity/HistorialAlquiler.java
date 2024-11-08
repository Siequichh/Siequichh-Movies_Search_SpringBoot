package com.siequichh.moviesearch.movie_search.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class HistorialAlquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlquiler;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "historialAlquiler",cascade = CascadeType.ALL)
    private List<DetallesAlquiler> detallesAlquileres;

    public HistorialAlquiler() {}

    public HistorialAlquiler(Long idAlquiler, User user, List<DetallesAlquiler> detallesAlquileres) {
        this.idAlquiler = idAlquiler;
        this.user = user;
        this.detallesAlquileres = detallesAlquileres;
    }

    public HistorialAlquiler(User user, List<DetallesAlquiler> detallesAlquileres) {
        this.user = user;
        this.detallesAlquileres = detallesAlquileres;
    }

    public Long getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Long idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DetallesAlquiler> getDetallesAlquileres() {
        return detallesAlquileres;
    }

    public void setDetallesAlquileres(List<DetallesAlquiler> detallesAlquileres) {
        this.detallesAlquileres = detallesAlquileres;
    }
}
