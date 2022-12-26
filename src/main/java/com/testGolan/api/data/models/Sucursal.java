package com.testGolan.api.data.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.utility.nullability.NeverNull;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable {

	private static final long serialVersionUID = 5504206492622128090L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@NeverNull
    private Integer id;
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    @JsonIgnore
	private Cliente id_cliente;
	
	public Sucursal(){}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	@Override
	public String toString() {
		return "Sucursal [id=" + id + ", direccion=" + direccion + ", id_cliente=" + id_cliente + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, id, id_cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sucursal other = (Sucursal) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(id, other.id)
				&& Objects.equals(id_cliente, other.id_cliente);
	}

	
}
