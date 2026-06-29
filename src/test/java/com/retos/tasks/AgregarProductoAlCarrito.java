package com.retos.tasks;

import com.retos.userinterfaces.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductoAlCarrito implements Task {

    public static AgregarProductoAlCarrito notebook() {
        return Tasks.instrumented(AgregarProductoAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Esperar a que el producto esté visible y luego agregar
                net.serenitybdd.screenplay.waits.WaitUntil.the(ProductoPage.PRODUCTO_NOTEBOOK, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductoPage.PRODUCTO_NOTEBOOK),
                net.serenitybdd.screenplay.waits.WaitUntil.the(ProductoPage.BOTON_AGREGAR_AL_CARRITO, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductoPage.BOTON_AGREGAR_AL_CARRITO)
        );
    }
}
