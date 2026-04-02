package com.example.retos.models;

public class DatosRegistro {

    private final String nombre;
    private final String apellido;
    private final String password;

    private DatosRegistro(String nombre, String apellido, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }

    public static DatosRegistro porDefecto() {
        // Generar una contraseña por defecto no vacía para evitar problemas en login de pruebas
        String pwd = "AutoPass" + System.currentTimeMillis();
        return new DatosRegistro("Brandon", "Lopez", pwd);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPassword() {
        return password;
    }
}
