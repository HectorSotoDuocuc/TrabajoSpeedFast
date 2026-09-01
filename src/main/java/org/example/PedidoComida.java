package org.example;
import java.util.*;
import java.util.List;

public class PedidoComida extends Pedido {
    private String nombreRestaurante;
    private static ArrayList<PedidoComida> historialDePedidos = new ArrayList<>();
    private Boolean despacho;

    public PedidoComida(int idpedido, String dirrecionEntrega, String tipodepedido,int distanciakm, String nombreRestaurante) {
        super(idpedido, dirrecionEntrega, tipodepedido,distanciakm);
        this.nombreRestaurante = nombreRestaurante;
        this.historialDePedidos = new ArrayList<>();
        this.despacho = null;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public void asignarrepartidor(String nombre, List<Repartidor> listaRepartidoresManual){
        boolean encontrado = false;
        for (Repartidor rep : listaRepartidoresManual) {
            if (rep.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                if (rep.isMochilatermica() && rep.isDisponibilidadInmediata()) {
                    super.asignarrepartidor(rep);

                    System.out.println("Asignando Repartidor");
                    System.out.println("Verificando mochila termica");
                    System.out.println("Pedido Asignado a " + rep.getNombre());
                    return;
                }System.out.println("El Repartidor Que Asigno no tiene mochila termica o no esta disponible");
            }

        }if (!encontrado) {
            System.out.println("EL Repartidor Asignado no existe en el sistema");
        }
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
