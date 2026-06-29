package com.retos.tasks;

import com.retos.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Click;

public class LlenarBillingAddress implements Task {

    public static LlenarBillingAddress yContinuar() {
        return Tasks.instrumented(LlenarBillingAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Esperar a que el selector de pais esté visible antes de interactuar
                net.serenitybdd.screenplay.waits.WaitUntil.the(CarritoPage.SELECT_COUNTRY, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                SelectFromOptions.byVisibleText("Colombia").from(CarritoPage.SELECT_COUNTRY),
                SelectFromOptions.byVisibleText("Other (Non US)").from(CarritoPage.SELECT_STATE),
                Enter.theValue("Bogota").into(CarritoPage.CAMPO_CITY),
                Enter.theValue("Calle 123 #45-67").into(CarritoPage.CAMPO_ADDRESS1),
                Enter.theValue("110111").into(CarritoPage.CAMPO_ZIP),
                Enter.theValue("3001234567").into(CarritoPage.CAMPO_PHONE),
                Click.on(CarritoPage.BOTON_CONTINUE_BILLING)
        );
    }
}
