package com.gemetech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String isbn;
    private String titulo;
    private int id_editorial;
    private int id_autor;
    private char tipo_libro;
    private int precio;
    private String contMaterial;
    private String categoria;
    private int cantidad;

    public Libro(int id, String isbn, String titulo, int id_editorial, int id_autor, char tipo_libro, int precio,
            String contMaterial, String categoria, int cantidad) {
        super();
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.id_editorial = id_editorial;
        this.id_autor = id_autor;
        this.tipo_libro = tipo_libro;
        this.precio = precio;
        this.contMaterial = contMaterial;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public Libro() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public char getTipo_libro() {
        return tipo_libro;
    }

    public void setTipo_libro(char tipo_libro) {
        this.tipo_libro = tipo_libro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getContMaterial() {
        return contMaterial;
    }

    public void setContMaterial(String contMaterial) {
        this.contMaterial = contMaterial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
