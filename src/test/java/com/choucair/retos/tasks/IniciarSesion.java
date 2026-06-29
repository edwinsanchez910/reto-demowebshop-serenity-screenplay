<<<<<<< HEAD
package com.choucair.retos.tasks;

import com.choucair.retos.userinterfaces.HomePage;
import com.choucair.retos.userinterfaces.LoginPage;
=======
package com.example.retos.tasks;

import com.example.retos.userinterfaces.HomePage;
import com.example.retos.userinterfaces.LoginPage;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

    public static IniciarSesion conElUsuarioRegistrado() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String correo = actor.recall("correoRegistrado");
        String password = actor.recall("passwordRegistrado");

<<<<<<< HEAD
        actor.attemptsTo(
                Click.on(HomePage.BOTON_LOGOUT),
=======
        // Si existe el boton de logout, hacer click para garantizar estado limpio
        try {
            if (HomePage.BOTON_LOGOUT.resolveFor(actor).isPresent()) {
                actor.attemptsTo(Click.on(HomePage.BOTON_LOGOUT));
            }
        } catch (Exception ignored) {
            // Ignorar si el elemento no está disponible
        }

        actor.attemptsTo(
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
                Click.on(HomePage.BOTON_LOGIN),
                Enter.theValue(correo).into(LoginPage.EMAIL),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BOTON_LOGIN)
        );
    }
}
