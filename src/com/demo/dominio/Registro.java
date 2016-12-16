
package com.demo.dominio;

public class Registro {
    private int id_registro;
    private String ciudad;
    private String direccion;
    private String email;
    private int telefono;
    private int codigo_regional;
    public Registro(){
        
    }

    public Registro(int id_registro, String ciudad, String direccion, String email, int telefono, int codigo_regional) {
        this.id_registro = id_registro;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.codigo_regional = codigo_regional;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigo_regional() {
        return codigo_regional;
    }

    public void setCodigo_regional(int codigo_regional) {
        this.codigo_regional = codigo_regional;
    }

    
}
