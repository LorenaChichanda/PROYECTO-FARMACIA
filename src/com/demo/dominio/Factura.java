
package com.demo.dominio;

public class Factura {
    private int id_factura;
    private String nombre;
    private String producto;
    private int cantidad;
    private int tpagar;
    private int preciouni;
  private int cedula;

    public Factura() {
    }

    public Factura(int id_factura, String nombre, String producto, int cantidad, int tpagar, int preciouni, int cedula) {
        this.id_factura = id_factura;
        this.nombre = nombre;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tpagar = tpagar;
        this.preciouni = preciouni;
        this.cedula = cedula;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTpagar() {
        return tpagar;
    }

    public void setTpagar(int tpagar) {
        this.tpagar = tpagar;
    }

    public int getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(int preciouni) {
        this.preciouni = preciouni;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

}