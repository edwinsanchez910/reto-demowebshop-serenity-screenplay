package com.retos.tasks;

import com.retos.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavegarCategoria implements Task {

    public static NavegarCategoria computersYNotebooks() {
        return Tasks.instrumented(NavegarCategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Esperar a que la categoria esté visible antes de interactuar
                net.serenitybdd.screenplay.waits.WaitUntil.the(HomePage.CATEGORIA_COMPUTERS, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.CATEGORIA_COMPUTERS),
                Click.on(HomePage.SUBCATEGORIA_NOTEBOOKS)
        );
    }
}
