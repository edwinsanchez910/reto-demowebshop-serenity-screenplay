package com.example.retos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.example.retos.userinterfaces.CarritoPage.MENSAJE_ORDEN_EXITOSA;
import static com.example.retos.userinterfaces.HomePage.BOTON_LOGOUT;
import static com.example.retos.userinterfaces.HomePage.CONTADOR_CARRITO;
import static com.example.retos.userinterfaces.HomePage.USUARIO_LOGUEADO;

public class OrdenProcesadaCorrectamente implements Question<Boolean> {

    public static OrdenProcesadaCorrectamente conElUsuarioRegistrado() {
        return new OrdenProcesadaCorrectamente();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String correoRegistrado = actor.recall("correoRegistrado");
        String urlActual = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();

        return USUARIO_LOGUEADO.resolveFor(actor).getText().contains(correoRegistrado)
                && BOTON_LOGOUT.resolveFor(actor).isVisible()
                && MENSAJE_ORDEN_EXITOSA.resolveFor(actor).getText().contains("Your order has been successfully processed!")
                && urlActual.contains("checkout/completed")
                && CONTADOR_CARRITO.resolveFor(actor).getText().contains("(0)");
    }
}
