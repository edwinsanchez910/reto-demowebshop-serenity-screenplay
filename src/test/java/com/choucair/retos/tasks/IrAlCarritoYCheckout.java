package com.example.retos.tasks;

import com.example.retos.userinterfaces.CarritoPage;
import com.example.retos.userinterfaces.HomePage;
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
