package org.hmoldovan.appfacturas.modelo;

public class Producto {

    private int codigo;
    private float precio;
    private String nombre;
    private static int ultimoCodigo;

    public Producto() {
        this.codigo= ++ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }//el codigo lo generaremos de forma automática

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
