package org.example;
import java.util.*;

public class PedidoEncomienda extends Pedido {
    private int peso;
    private String tipodedocumento;

    public PedidoEncomienda(int idpedido, String dirrecionEntrega, String tipodepedido, int peso,int distanciakm, String tipodedocumento) {
        super(idpedido, dirrecionEntrega, tipodepedido,distanciakm);
        this.peso = peso;
        this.tipodedocumento = tipodedocumento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipodedocumento() {
        return tipodedocumento;
    }

    public void setTipodedocumento(String tipodedocumento) {
        this.tipodedocumento = tipodedocumento;
    }

    @Override
    public void asignarrepartidor(String nombre, List<Repartidor> listaRepartidoresManual) {
        boolean encontrado = false;
        for (Repartidor rep : listaRepartidoresManual) {
            if (rep.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
            if (rep.getPesomaxparallevarKL() > peso) {
                super.asignarrepartidor(rep);
                System.out.println("[PedidoEnComienda]");
                System.out.println("Asignando Repartidor Que Aguente El Peso Del: " + tipodedocumento);
                System.out.println("Pedido Asignado a: " + rep.getNombre());
                return;
            }System.out.println("El Repartidor Asignado No Aguanta el peso");
            }
        }if (!encontrado) {
            System.out.println("EL Repartidor Asignado no existe en el sistema");
        }
    }
    public void asignarrepartidor(List<Repartidor> listaDeRepartidores) {
        for (Repartidor rep : listaDeRepartidores) {
            if (rep.getPesomaxparallevarKL() > peso) {
                super.asignarrepartidor(rep);
                System.out.println("Asignando Repartidor Que Aguente El Peso Del: " + tipodedocumento);
                System.out.println("Pedido Asignado a: " + rep.getNombre());
                return;
            }
        }
        System.out.println("Lo Siento ningun Repartidor Aguante el peso de su Encomienda ");
    }
    @Override
    protected void calcularTiempoEntrega(){
        double decimal =  20+1.5*getDistanciakm();
        int entero = (int) Math.round(decimal);
        System.out.println("El tiempo estimado de entrega:" + entero + "min");
    }
}
