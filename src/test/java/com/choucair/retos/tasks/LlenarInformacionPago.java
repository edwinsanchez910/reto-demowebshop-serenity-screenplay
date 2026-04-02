package com.example.retos.tasks;

import com.example.retos.models.DatosPago;
import com.example.retos.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LlenarInformacionPago implements Task {

    private final DatosPago datosPago;

    public LlenarInformacionPago(DatosPago datosPago) {
        this.datosPago = datosPago;
    }

    public static LlenarInformacionPago conTarjetaVisa() {
        return Tasks.instrumented(LlenarInformacionPago.class, DatosPago.tarjetaVisa());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosPago.getTipoTarjeta()).from(CarritoPage.SELECT_TIPO_TARJETA),
                Enter.theValue(datosPago.getNombreTitular()).into(CarritoPage.CAMPO_NOMBRE_TITULAR),
                Enter.theValue(datosPago.getNumeroTarjeta()).into(CarritoPage.CAMPO_NUMERO_TARJETA),
                SelectFromOptions.byVisibleText(datosPago.getMesExpiracion()).from(CarritoPage.SELECT_MES_EXPIRACION),
                SelectFromOptions.byVisibleText(datosPago.getAnioExpiracion()).from(CarritoPage.SELECT_ANIO_EXPIRACION),
                Enter.theValue(datosPago.getCodigo()).into(CarritoPage.CAMPO_CODIGO_TARJETA),
                Click.on(CarritoPage.BOTON_CONTINUE_PAYMENT_INFO)
        );
    }
}
