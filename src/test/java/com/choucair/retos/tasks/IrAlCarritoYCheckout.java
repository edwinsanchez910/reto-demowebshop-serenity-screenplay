<<<<<<< HEAD
package com.choucair.retos.tasks;

import com.choucair.retos.userinterfaces.CarritoPage;
import com.choucair.retos.userinterfaces.HomePage;
=======
package com.example.retos.tasks;

import com.example.retos.userinterfaces.CarritoPage;
import com.example.retos.userinterfaces.HomePage;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrAlCarritoYCheckout implements Task {

    public static IrAlCarritoYCheckout continuar() {
        return Tasks.instrumented(IrAlCarritoYCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LINK_CARRITO),
                Click.on(CarritoPage.CHECKBOX_TERMINOS),
                Click.on(CarritoPage.BOTON_CHECKOUT)
        );
    }
}
