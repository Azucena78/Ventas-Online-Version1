package com.cursocet.model;

import java.net.URL;

public class Productos {
	public static int IdProducto;
	private String nombreProducto;
	private double precioProducto;
	private String imagenURL; //admite URL como palabra reservada, pero solo url con http//....
	private String shortDesc;
	private String longDesc;
	private int stock;
	private int idProductoTemp;
	
	public Productos() {
		this.idProductoTemp = ++IdProducto;
	}

	public Productos(String nombre, double precio, String imagenURL, String shortDesc, String longDesc,
			int stock) {

		this.nombreProducto = nombre;
		this.precioProducto = precio;
		this.imagenURL = imagenURL;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.stock = stock;
		this.idProductoTemp = ++IdProducto;
	}
	
	public static int getIdProducto() {
		return IdProducto;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getImagenURL() {
		return imagenURL;
	}

	public void setImagenURL(String imagenURL) {
		this.imagenURL = imagenURL;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getIdProductoTemp() {
		return idProductoTemp;
	}
	public  void restarStock(int cantidad) {
		this.stock -= cantidad;
	}
	public  void aumentarStock(int cantidad) {
		this.stock += cantidad;
	}

	@Override
	public String toString() {
		return "Productos [nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", imagenURL="
				+ imagenURL + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + ", stock=" + stock
				+ ", idProductoTemp=" + idProductoTemp + "]";
	}
	
	
}
