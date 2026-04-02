package com.example.retos.tasks;

import com.example.retos.userinterfaces.HomePage;
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
                Click.on(HomePage.CATEGORIA_COMPUTERS),
                Click.on(HomePage.SUBCATEGORIA_NOTEBOOKS)
        );
    }
}
