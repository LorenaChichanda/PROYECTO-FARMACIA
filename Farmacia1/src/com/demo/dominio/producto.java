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
public class producto {
    private int id_producto;
    private String nombre;
    private int cantidad;
    private double precio;

    public producto() {
    }

    public producto(int id_producto, String nombre, int cantidad, double precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
