package org.example;

public abstract class Pedidos {
    private int idpedido;
    private String dirrecionEntrega;
    private String tipodepedido;
    private int distanciakm;
    private Repartidor repartidorAsignado;

    public Pedidos(int idpedido, String dirrecionEntrega, String tipodepedido, int distanciakm) {
        this.idpedido = idpedido;
        this.dirrecionEntrega = dirrecionEntrega;
        this.tipodepedido = tipodepedido;
        this.distanciakm = distanciakm;
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

    public int getDistanciakm() {
        return distanciakm;
    }

    public void setDistanciakm(int distanciakm) {
        this.distanciakm = distanciakm;
    }

    public void asignarrepartidor(Repartidor repartidor) {
        this.repartidorAsignado = repartidor;
    }

    public final void ejecutarProceso(){
        mostrarResumen();
        calcularTiempoEntrega();
    }
    public void mostrarResumen(){
        System.out.println("Mostrar Datos Del Pedido:");
        System.out.println("Pedido" + getTipodepedido());
        System.out.println("Dirrecion: " + dirrecionEntrega);
        System.out.println("distancia: " + distanciakm + "km");
    }
    protected abstract void calcularTiempoEntrega();
}
