package com.ciudades.ciudades.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("city")
public class Ciudad {
	
	@Id
	private Long id;
	private String descripcion;
	private Long departamentoId;

	public Ciudad(Long id, String descripcion, Long departamentoId) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.departamentoId = departamentoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departamentoId, descripcion, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(departamentoId, other.departamentoId) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", descripcion=" + descripcion + ", departamentoId=" + departamentoId + "]";
	}

}
