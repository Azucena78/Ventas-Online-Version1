package com.cursoceat.controller;
import java.util.ArrayList;
import com.cursocet.model.Clientes;
import com.cursocet.model.Pais;
import com.cursocet.model.Pedido;
import com.cursocet.model.Productos;

public class Controller {

	public static void main(String[] args) {
		Productos miProductos = new  Productos("Camiseta Roja", 15.5, "c:\\imagenes\\img1.jgp", "Camiseta de Algodon" , "100% Algodon, lava a Maquina 30º", 10);
		ArrayList<Productos> p1 = new ArrayList<Productos>();
		p1.add(miProductos);
		System.out.println(p1.toString());
		miProductos.aumentarStock(5);
		System.out.println(p1.toString());
		Productos miProductos2 = new  Productos("Camiseta Azul", 12.5, "c:\\imagenes\\img2.jgp", "Camiseta de Poliester" , "60% Algodon, 40% Poliester, lava a Maquina 30º", 25);
		p1.add(miProductos2);
		System.out.println(p1.toString());
		miProductos2.restarStock(3);
		System.out.println(p1.toString());
		
		Clientes miCliente1 = new Clientes("María", "Pérez", "Calle Oriente, 59", "Tomelloso", Pais.SPAIN, "6564564", "06789987T");
		System.out.println(miCliente1.toString());
		
		Pedido miPedido = new Pedido();
		System.out.println(miPedido.toString());
		miPedido.setIdCliente(miCliente1.getIdTemp());
		miPedido.setIvaPaisCliente(miCliente1.getPaisCliente().getPorcentaje());
		miPedido.setIdProducto(miProductos.getIdProductoTemp());
		miPedido.setCantidadProducto(5);
		miPedido.setPrecioProducto(miProductos.getPrecioProducto());
		miPedido.setTotalSinIva(miPedido.getPrecioProducto(), miPedido.getCantidadProducto());
		miPedido.setTotalPedido(miPedido.getTotalSinIva(), miPedido.getIvaPaisCliente());
		System.out.println(miPedido.toString());
		
	}

}
