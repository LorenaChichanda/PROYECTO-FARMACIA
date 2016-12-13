/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

/**
 *
 * @author VK-PC
 */
public class factura {
    private int id_factura;
    private String cedula;
    private String nombre;
    private String producto;
    private int cantidad;
    private int tpagar;
    private int fecha;
    private int hora;
    private int preciouni;
   // private int id_cliente;

    public factura() {
    }

    public factura(int id_factura, String cedula, String nombre, String producto, int cantidad, int tpagar, int fecha, int hora, int preciouni) {
        this.id_factura = id_factura;
        this.cedula = cedula;
        this.nombre = nombre;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tpagar = tpagar;
        this.fecha = fecha;
        this.hora = hora;
        this.preciouni = preciouni;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(int preciouni) {
        this.preciouni = preciouni;
    }
    
}
