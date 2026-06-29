package com.retos.tasks;

import com.retos.userinterfaces.CarritoPage;
import com.retos.userinterfaces.HomePage;
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
                // Esperar a que el link del carrito esté visible
                net.serenitybdd.screenplay.waits.WaitUntil.the(HomePage.LINK_CARRITO, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.LINK_CARRITO),
                net.serenitybdd.screenplay.waits.WaitUntil.the(CarritoPage.CHECKBOX_TERMINOS, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CarritoPage.CHECKBOX_TERMINOS),
                Click.on(CarritoPage.BOTON_CHECKOUT)
        );
    }
}
