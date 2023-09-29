package com.gemetech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="AdminList")
public class AdminList {
	
	@Id
	private int id;
	private String usuario;
	private String clave;
	private String nombre;
        private String apellido;
        private String direccion;
        private int cargo;
	public AdminList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminList(int id, String usuario, String clave, String nombre, String apellido, String direccion, int cargo) {
		super();
		this.id = id;
		 this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cargo = cargo;
	}
	 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
