package com.abril7;

import java.util.Date;

public class Cliente extends Persona {
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorClientes;

	public Cliente(Date fechaRegistro, boolean vip) {
		this.idCliente = ++contadorClientes;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public static int getContadorClientes() {
		return contadorClientes;
	}

	@Override
	public String toString() {
		return  "Cliente [idCliente=" + idCliente + ", "
				+ (fechaRegistro != null ? "fechaRegistro=" + fechaRegistro + ", " : "") + "vip=" + vip + "]";
	}

	

	

}
