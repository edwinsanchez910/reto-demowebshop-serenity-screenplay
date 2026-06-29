<<<<<<< HEAD
package com.choucair.retos.tasks;

import com.choucair.retos.userinterfaces.HomePage;
=======
package com.example.retos.tasks;

import com.example.retos.userinterfaces.HomePage;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    public static Abrir laPaginaDeRegistro() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class),
                Click.on(HomePage.BOTON_REGISTRO)
        );
    }
}
