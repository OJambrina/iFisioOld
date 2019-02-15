package com.ojambrina.ifisio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Usuario {

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
    String profesion;
    int telefono;

    //Hacer setters y getters


    public String toJson(Usuario user) {
        return gson.toJson(user);
    }

    public Usuario fromJson(String json) {
        return gson.fromJson(json, Usuario.class);
    }
}
