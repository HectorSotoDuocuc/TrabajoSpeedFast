package org.example;

import java.util.List;

public class PedidoExpress extends Pedidos{
    public PedidoExpress(int idpedido, String dirrecionEntrega, String tipodepedido, int distanciakm) {
        super(idpedido, dirrecionEntrega, tipodepedido,distanciakm);
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
    @Override
    protected void calcularTiempoEntrega(){
        int agregado =0;
        if(getDistanciakm()> 5)
            agregado = 5;
        System.out.println("El tiempo estimado de entrega:" + (10 + agregado) + "min");
    }
}
