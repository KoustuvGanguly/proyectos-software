package com.vst.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="codigo",length=10)
	private String codigo;

	@Column(name="login",length=50)
	private String login;

	@Column(name="clave",length=50)
	private String clave;
	
	@Column(name="estado_civil",length=1)
	private Integer estadoCivil;

	@Column(name="ruc",length=11)
	private String ruc;

	@Column(name="tipo_documento",length=1)
	private Integer tipo_documento;
	
	@Column(name="numero_documento",length=12)
	private String numero_documento;
	
	@ManyToMany(mappedBy="usuarios")
	private List<Perfil> perfils;


    public Usuario() {
    }


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public Integer getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public Integer getTipo_documento() {
		return tipo_documento;
	}


	public void setTipo_documento(Integer tipo_documento) {
		this.tipo_documento = tipo_documento;
	}


	public String getNumero_documento() {
		return numero_documento;
	}


	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}


	public List<Perfil> getPerfils() {
		return perfils;
	}


	public void setPerfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}

	
	
}