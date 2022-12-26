package com.testGolan.api.data.models;

import javax.persistence.*;

import net.bytebuddy.utility.nullability.NeverNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -4857434816089649885L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@NeverNull
    private Integer id;
	@Column(name = "nombre")
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_cliente", cascade = CascadeType.ALL)
    private List<Sucursal> listSucursales = new ArrayList<>();
    
    public Cliente(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public List<Sucursal> getListSucursales() {
		return listSucursales;
	}

	public void setListSucursales(List<Sucursal> listSucursales) {
		this.listSucursales = listSucursales;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", listSucursales=" + listSucursales + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, listSucursales, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id) && Objects.equals(listSucursales, other.listSucursales)
				&& Objects.equals(nombre, other.nombre);
	}
    
    
}
