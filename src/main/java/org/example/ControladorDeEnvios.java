package org.example;

import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable,Cancelable,Rasteable{
    private ArrayList<Pedido> historialDeEntregas;

    public ControladorDeEnvios() {
        this.historialDeEntregas = new ArrayList<>();
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.cambiarEstado("Cancelado");
        System.out.println("El Pedido" + pedido.getIdpedido() + " ha sido Cancelado");
    }

    @Override
    public void despachar(Pedido pedido) {
        pedido.cambiarEstado("Despachado");
        this.historialDeEntregas.add(pedido);
        System.out.println("EL Pedido" + pedido.getIdpedido() + " Fue Despachado Con Exito");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial De Pedidos Despachados");
        if (this.historialDeEntregas.isEmpty()){
            System.out.println("No se han realizado despachado el dia de hoy");
            return;
        }
        for (Pedido p : this.historialDeEntregas) {
            p.mostrarResumen();
        }
    }
}
