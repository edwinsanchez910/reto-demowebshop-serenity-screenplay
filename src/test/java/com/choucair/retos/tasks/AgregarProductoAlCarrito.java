package com.example.retos.tasks;

import com.example.retos.userinterfaces.ProductoPage;
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
                Click.on(ProductoPage.PRODUCTO_NOTEBOOK),
                Click.on(ProductoPage.BOTON_AGREGAR_AL_CARRITO)
        );
    }
}
