package org.example;

import java.util.List;

public class PedidoExpress extends Pedidos{
    public PedidoExpress(int idpedido, String dirrecionEntrega, String tipodepedido) {
        super(idpedido, dirrecionEntrega, tipodepedido);
    }
    @Override
    public void asignarrepartidor(){
    }
    public void asignarrepartidor(List<Repartidor> listaDeRepartidores){
        Repartidor repartidormascercano = null;
        int distanciamascorta = 50000000;
        for (Repartidor rep : listaDeRepartidores) {
            if (rep.getDistanciadelasucursal() < distanciamascorta && rep.isDisponibilidadInmediata()){
                distanciamascorta = rep.getDistanciadelasucursal();
                repartidormascercano = rep;
            }
        }
        if (repartidormascercano != null) {
            super.asignarrepartidor(repartidormascercano);
            System.out.println("[Pedido Express]");
            System.out.println("Asignando Repartidor mas cercano");
            System.out.println("Pedido Asignado a " + repartidormascercano.getNombre());

        }else {
            System.out.println("No se Encuentra Repartidores Disponibles");
        }
    }
}
