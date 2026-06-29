<<<<<<< HEAD
package com.choucair.retos.models;
=======
package com.example.retos.models;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)

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
<<<<<<< HEAD
        return new DatosRegistro("Brandon", "Lopez", "Choucair123*");
=======
        // Generar una contraseña por defecto no vacía para evitar problemas en login de pruebas
        String pwd = "AutoPass" + System.currentTimeMillis();
        return new DatosRegistro("Brandon", "Lopez", pwd);
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
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
