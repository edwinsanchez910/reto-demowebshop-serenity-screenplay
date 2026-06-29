package com.retos.tasks;

import com.retos.models.DatosRegistro;
import com.retos.userinterfaces.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarUsuario implements Task {

    private final DatosRegistro datosRegistro;

    public RegistrarUsuario(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static RegistrarUsuario conDatosValidos() {
        return Tasks.instrumented(RegistrarUsuario.class, DatosRegistro.porDefecto());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Validate registration data before using it
        datosRegistro.validate();

        String correo = "usuario" + System.currentTimeMillis() + "@mailinator.com";
        String password = datosRegistro.getPassword();

        actor.remember("correoRegistrado", correo);
        actor.remember("passwordRegistrado", password);

        actor.attemptsTo(
                Click.on(RegistroPage.GENERO_MASCULINO),
                Enter.theValue(datosRegistro.getNombre()).into(RegistroPage.NOMBRE),
                Enter.theValue(datosRegistro.getApellido()).into(RegistroPage.APELLIDO),
                Enter.theValue(correo).into(RegistroPage.EMAIL),
                Enter.theValue(password).into(RegistroPage.PASSWORD),
                Enter.theValue(password).into(RegistroPage.CONFIRMAR_PASSWORD),
                net.serenitybdd.screenplay.waits.WaitUntil.the(RegistroPage.BOTON_REGISTRAR, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegistroPage.BOTON_REGISTRAR)
        );
    }
}
