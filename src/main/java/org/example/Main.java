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


       PedidoComida pedidoPizza = new PedidoComida(501,"los pinos 505, cerrillos", "Comida", "Donde Don Claudio");

       pedidoPizza.asignarrepartidor();

       pedidoPizza.asignarrepartidor(listaDeRepartidores);

       PedidoEncomienda pedidoPaquete = new PedidoEncomienda(700,"rinconada 545, maipu","Encomienda", 6,"Paquete");

       pedidoPaquete.asignarrepartidor();

       pedidoPaquete.asignarrepartidor(listaDeRepartidores);

       PedidoExpress pedidoSuperMercado = new PedidoExpress(542,"Comercio 2312, maipu","Supermercado Express");

       pedidoSuperMercado.asignarrepartidor();

       pedidoSuperMercado.asignarrepartidor(listaDeRepartidores);

    }
}
