package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
       List<Repartidor> listaDeRepartidores = new ArrayList<>();

       listaDeRepartidores.add(new Repartidor("Pedro", true, 10, false,7));
       listaDeRepartidores.add(new Repartidor("Camilo", false, 15, true,6));
       listaDeRepartidores.add(new Repartidor("juan",true,6, true,15));
       listaDeRepartidores.add(new Repartidor("flash", false, 3, true,5));
       listaDeRepartidores.add(new Repartidor("kid flash", true, 5, true,6));
       listaDeRepartidores.add(new Repartidor("Reverse FLash",false, 3, true, 10));


       PedidoComida pedido1 = new PedidoComida(453,"Las palmas 453","Comida",4,"carmen");
       pedido1.mostrarResumen();
       pedido1.calcularTiempoEntrega();
       PedidoEncomienda pedido2 = new PedidoEncomienda(544,"las pergolas 432","Encomienda", 2, 11,"paquete" );
       pedido2.mostrarResumen();
       pedido2.calcularTiempoEntrega();
       PedidoExpress pedido3 = new PedidoExpress(646,"grajales 5010" , "Express", 6);
       pedido3.mostrarResumen();
       pedido3.calcularTiempoEntrega();
    }
}
