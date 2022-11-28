/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retoscobember;

import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Usuarios {
    private String usuario; //usr
    private String email;   //eme
    private String password; //psw
    private int edad; //age
    private String localidad; // loc
    private int numeroSeguidores; // fll

    public Usuarios() {
    }

    public Usuarios(String usuario, String email, String password, int edad, String localidad, int numeroSeguidores) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.edad = edad;
        this.localidad = localidad;
        this.numeroSeguidores = numeroSeguidores;
    }

    
    
    
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", email=" + email + ", password=" + password + ", edad=" + edad + ", localidad=" + localidad + ", numeroSeguidores=" + numeroSeguidores + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.usuario);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.password);
        hash = 37 * hash + this.edad;
        hash = 37 * hash + Objects.hashCode(this.localidad);
        hash = 37 * hash + this.numeroSeguidores;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.numeroSeguidores != other.numeroSeguidores) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.localidad, other.localidad);
    }
    
    
    
    
    
}
