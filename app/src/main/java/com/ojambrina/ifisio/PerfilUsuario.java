package com.ojambrina.ifisio;

import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

public class PerfilUsuario {

    //apartar la creación del objeto a un framework
    Gson gson = new Gson();

    String apellido1;
    String apellido2;
    String direccion;
    String dni;
    String doctor;
    String email;
    boolean esCliente;
    boolean esProfesional;
    int idDoctor;
    List<String> lesiones;
    String nombre;
    String password;
    String profesion;
    int telefono;
    List<String> tratamientos;
    List<Date> visitas;

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEsCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }

    public boolean isEsProfesional() {
        return esProfesional;
    }

    public void setEsProfesional(boolean esProfesional) {
        this.esProfesional = esProfesional;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public List<String> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<String> lesiones) {
        this.lesiones = lesiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<String> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<String> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<Date> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Date> visitas) {
        this.visitas = visitas;
    }

    public String toJson(PerfilUsuario user) {
        return gson.toJson(user);
    }

    public PerfilUsuario fromJson(String json) {
        return gson.fromJson(json, PerfilUsuario.class);
    }
}
