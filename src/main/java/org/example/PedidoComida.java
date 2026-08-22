package org.example;

import java.util.List;

public class PedidoComida extends Pedidos{
    private String nombreRestaurante;
    public PedidoComida(int idpedido, String dirrecionEntrega, String tipodepedido,int distanciakm, String nombreRestaurante) {
        super(idpedido, dirrecionEntrega, tipodepedido,distanciakm);
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public void asignarrepartidor(){
        System.out.println("[Pedido De Comida]");
    }

    public void asignarrepartidor(List<Repartidor> listaDeRepartidores){
        for (Repartidor rep : listaDeRepartidores) {
            if (rep.isMochilatermica() && rep.isDisponibilidadInmediata()) {
                super.asignarrepartidor(rep);

                System.out.println("Asignando Repartidor");
                System.out.println("Verificando mochila termica");
                System.out.println("Pedido Asignado a " + rep.getNombre());
                return;
            }
        }
        System.out.println("Lo siento, No se Encuentra Ningun Repartidor con Mochila Termica");
    }
    @Override
    protected void calcularTiempoEntrega(){
        System.out.println("El tiempo estimado de entrega:" + (15+(2*getDistanciakm())) + "min");
    }
}
