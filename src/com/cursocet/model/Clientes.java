package com.cursocet.model;

public class Clientes {
	public static int idClientes;
	private String nombrecliente;
	private String apellidosCliente;
	private String direccionCliente;
	private String localidadCliente;
	//pais lo referencio del enum
	Pais paisCliente;
	private String telefonoCliente;
	private String nif;
	private int idTemp = 0;
	
	public Clientes() {
		this.idTemp = ++idClientes;
	}
	public Clientes(String nombrecliente, String apellidosCliente, String direccionCliente, String localidadCliente,
			Pais paisCliente, String telefonoCliente, String nif) {
		super();
		this.nombrecliente = nombrecliente;
		this.apellidosCliente = apellidosCliente;
		this.direccionCliente = direccionCliente;
		this.localidadCliente = localidadCliente;
		this.paisCliente = paisCliente;
		this.telefonoCliente = telefonoCliente;
		this.nif = nif;
		this.idTemp = ++idClientes;
	}
	public static int getIdClientes() {
		return idClientes;
	}
	public static void setIdClientes(int idClientes) {
		Clientes.idClientes = idClientes;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getLocalidadCliente() {
		return localidadCliente;
	}
	public void setLocalidadCliente(String localidadCliente) {
		this.localidadCliente = localidadCliente;
	}
	public Pais getPaisCliente() {
		return paisCliente;
	}
	public void setPaisCliente(Pais paisCliente) {
		this.paisCliente = paisCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getIdTemp() {
		return idTemp;
	
	}
	@Override
	public String toString() {
		return "Clientes [idTemp=" + idTemp + ", nombrecliente=" + nombrecliente + ", apellidosCliente="
				+ apellidosCliente + ", direccionCliente=" + direccionCliente + ", localidadCliente=" + localidadCliente
				+ ", paisCliente=" + paisCliente + ", telefonoCliente=" + telefonoCliente + ", nif=" + nif + "]";
	}
	 
}
