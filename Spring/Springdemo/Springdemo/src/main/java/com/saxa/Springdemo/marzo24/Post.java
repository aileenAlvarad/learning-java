package com.saxa.springdemo.marzo24;

import java.util.Date;

public class Post {
	private int id;
	private String descripcion;
	private String urlImg;
	private Date fecha;
	private String titulo;
	
	public Post() {
		
	}

	public Post(int id, String descripcion, String urlImg, Date fecha, String titulo) {
		this.id = id;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
		this.fecha = fecha;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", " + (descripcion != null ? "descripcion=" + descripcion + ", " : "")
				+ (urlImg != null ? "urlImg=" + urlImg + ", " : "") + (fecha != null ? "fecha=" + fecha + ", " : "")
				+ (titulo != null ? "titulo=" + titulo : "") + "]";
	}

	
}
