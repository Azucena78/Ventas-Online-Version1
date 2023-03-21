package com.cursocet.model;

public enum Pais {
 SPAIN(21), PORTUGAL(23), FRANCIA(20);
	int porcentaje;

	private Pais(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}
}
