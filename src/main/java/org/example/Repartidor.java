package org.example;

public class Repartidor {
    private String nombre;
    private boolean mochilatermica;
    private int distanciadelasucursal;
    private boolean disponibilidadInmediata;
    private int pesomaxparallevarKL;

    public Repartidor(String nombre, boolean mochilatermica, int distanciadelasucursal, boolean disponibilidadInmediata, int pesomaxparallevarKL) {
        this.nombre = nombre;
        this.mochilatermica = mochilatermica;
        this.distanciadelasucursal = distanciadelasucursal;
        this.disponibilidadInmediata = disponibilidadInmediata;
        this.pesomaxparallevarKL = pesomaxparallevarKL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMochilatermica() {
        return mochilatermica;
    }

    public void setMochilatermica(boolean mochilatermica) {
        this.mochilatermica = mochilatermica;
    }

    public int getDistanciadelasucursal() {
        return distanciadelasucursal;
    }

    public void setDistanciadelasucursal(int distanciadelasucursal) {
        this.distanciadelasucursal = distanciadelasucursal;
    }

    public boolean isDisponibilidadInmediata() {
        return disponibilidadInmediata;
    }

    public void setDisponibilidadInmediata(boolean disponibilidadInmediata) {
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    public int getPesomaxparallevarKL() {
        return pesomaxparallevarKL;
    }

    public void setPesomaxparallevarKL(int pesomaxparallevarKL) {
        this.pesomaxparallevarKL = pesomaxparallevarKL;
    }
}
