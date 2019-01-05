package com.tecsup.javawebavanzado.sesion02.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *  Clase de ejemplo
 *
 */
@ManagedBean
@RequestScoped
public class EditorBean {
	private String comentarios;

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String grabar() {
		System.out.println("grabando: " + comentarios);
		return "test";
	}

}
