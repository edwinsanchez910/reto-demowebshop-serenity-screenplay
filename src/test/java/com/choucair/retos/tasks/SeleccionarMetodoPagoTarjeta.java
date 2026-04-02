package com.example.retos.tasks;

import com.example.retos.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarMetodoPagoTarjeta implements Task {

    public static SeleccionarMetodoPagoTarjeta yContinuar() {
        return Tasks.instrumented(SeleccionarMetodoPagoTarjeta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoPage.BOTON_CONTINUE_SHIPPING_ADDRESS),
                Click.on(CarritoPage.RADIO_SHIPPING_GROUND),
                Click.on(CarritoPage.BOTON_CONTINUE_SHIPPING_METHOD),
                Click.on(CarritoPage.RADIO_CREDIT_CARD),
                Click.on(CarritoPage.BOTON_CONTINUE_PAYMENT_METHOD)
        );
    }
}
