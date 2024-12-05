package com.example.Servidorsura6.modelos;
import jakarta.persistence.*;


@Entity
@Table(name = "vehiculos")
public class Vehiculo {


    //ID(AUTO LONG)
    //PLACA (STRING)
    //MODELO (STRING)
    //MARCA (STRING)
    //CILINDRAJE (STRING)
    //COLOR (STRING)
    //DESCRIPCION (STRING)
    //NUMEROSINIESTROS (INT)(Integer)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "placa", nullable = false, length = 7)
    private String placa;

    @Column(name = "modelo", nullable = false, length = 4)
    private String modelo;

    @Column(name = "marca", nullable = false, length = 10)
    private String marca;

    @Column(name = "cilindraje", nullable = false, length = 4)
    private String cilindraje;

    @Column(name = "color", nullable = false, length = 10)
    private String color;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "numero_siniestro", length = 11)
    private Integer numeroSiniestro;

    // Constructor sin parámetros (requerido por JPA)
    public Vehiculo() {
    }

    // Constructor con todos los parámetros

    public Vehiculo(Long id, String placa, String modelo, String marca, String cilindraje, String color, String descripcion, Integer numeroSiniestro) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.descripcion = descripcion;
        this.numeroSiniestro = numeroSiniestro;
    }


    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumeroSiniestro() {
        return numeroSiniestro;
    }

    public void setNumeroSiniestro(Integer numeroSiniestro) {
        this.numeroSiniestro = numeroSiniestro;
    }
}
