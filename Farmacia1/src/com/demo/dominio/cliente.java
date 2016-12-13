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
public class cliente {
        private int id_cliente;
        private int cedula;
        private String nombre;
        private String direccion;
        private int telefono;
        private String sexo;
public cliente(){
    
}
    public cliente(int id_cliente, int cedula, String nombre, String direccion, int telefono, String sexo) {
        this.id_cliente = id_cliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
//
//    @Override
//    public String toString() {
//        return "cliente{" + "id_cliente=" + id_cliente + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", sexo=" + sexo + '}';
//    }
//        
}
