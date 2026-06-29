<<<<<<< HEAD
package com.choucair.retos.tasks;

import com.choucair.retos.userinterfaces.HomePage;
=======
package com.example.retos.tasks;

import com.example.retos.userinterfaces.HomePage;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
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
