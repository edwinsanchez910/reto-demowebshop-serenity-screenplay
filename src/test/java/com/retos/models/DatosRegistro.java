package com.retos.models;

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

    public void validate() {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede estar vacío");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("Apellido no puede estar vacío");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password inválida: debe tener al menos 8 caracteres");
        }
    }
}
