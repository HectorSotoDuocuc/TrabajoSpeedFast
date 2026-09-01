package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    private int idpedido;
    private String dirrecionEntrega;
    private String tipodepedido;
    private int distanciakm;
    private Repartidor repartidorAsignado;
    protected String estadoPedido = null;

    public Pedido(int idpedido, String dirrecionEntrega, String tipodepedido, int distanciakm) {
        this.idpedido = idpedido;
        this.dirrecionEntrega = dirrecionEntrega;
        this.tipodepedido = tipodepedido;
        this.distanciakm = distanciakm;
        this.repartidorAsignado = null;
        this.estadoPedido = null;

    }
    public void asignarrepartidor(String nombre, List<Repartidor> listaRepartidoresManual){
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getDistanciakm() {
        return distanciakm;
    }

    public void setDistanciakm(int distanciakm) {
        this.distanciakm = distanciakm;
    }

    public void asignarrepartidor(Repartidor repartidor) {
        this.repartidorAsignado = repartidor;
    }
    public void cambiarEstado(String nuevoEstado) {
        this.estadoPedido = nuevoEstado;
    }

    public final void ejecutarProceso(){
        mostrarResumen();
        calcularTiempoEntrega();
    }
    public void mostrarResumen(){
        System.out.println("Mostrar Datos Del Pedido:");
        System.out.println("ID Del Pedido:" + idpedido);
        System.out.println("Pedido" + tipodepedido);
        System.out.println("Dirrecion: " + dirrecionEntrega);
        System.out.println("distancia: " + distanciakm + "km");
        if (this.repartidorAsignado != null) {
            System.out.println("Repartidor: " + this.repartidorAsignado.getNombre());
        } else {
            System.out.println("Repartidor: aun no ha sido asignado");
        }
    }
    protected abstract void calcularTiempoEntrega();
}
