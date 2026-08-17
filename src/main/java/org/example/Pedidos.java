package org.example;

public class Pedidos {
    private int idpedido;
    private String dirrecionEntrega;
    private String tipodepedido;
    private Repartidor repartidorAsignado;

    public Pedidos(int idpedido, String dirrecionEntrega, String tipodepedido) {
        this.idpedido = idpedido;
        this.dirrecionEntrega = dirrecionEntrega;
        this.tipodepedido = tipodepedido;
        this.repartidorAsignado = null;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getDirrecionEntrega() {
        return dirrecionEntrega;
    }

    public void setDirrecionEntrega(String dirrecionEntrega) {
        this.dirrecionEntrega = dirrecionEntrega;
    }

    public String getTipodepedido() {
        return tipodepedido;
    }

    public void setTipodepedido(String tipodepedido) {
        this.tipodepedido = tipodepedido;
    }

    public void asignarrepartidor(){

    }

    public void asignarrepartidor(Repartidor repartidor) {
        this.repartidorAsignado = repartidor;
    }
}
