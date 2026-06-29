<<<<<<< HEAD
package com.choucair.retos.tasks;

import com.choucair.retos.userinterfaces.CarritoPage;
=======
package com.example.retos.tasks;

import com.example.retos.userinterfaces.CarritoPage;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarOrden implements Task {

    public static ConfirmarOrden ahora() {
        return Tasks.instrumented(ConfirmarOrden.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoPage.BOTON_CONFIRMAR_ORDEN));
    }
}
