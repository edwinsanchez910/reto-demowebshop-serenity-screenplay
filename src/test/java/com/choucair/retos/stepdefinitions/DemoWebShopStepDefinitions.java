package com.example.retos.stepdefinitions;

import com.example.retos.tasks.Abrir;
import com.example.retos.tasks.AgregarProductoAlCarrito;
import com.example.retos.tasks.ConfirmarOrden;
import com.example.retos.tasks.IniciarSesion;
import com.example.retos.tasks.IrAlCarritoYCheckout;
import com.example.retos.tasks.LlenarBillingAddress;
import com.example.retos.tasks.LlenarInformacionPago;
import com.example.retos.tasks.NavegarCategoria;
import com.example.retos.questions.OrdenProcesadaCorrectamente;
import com.example.retos.tasks.RegistrarUsuario;
import com.example.retos.tasks.SeleccionarMetodoPagoTarjeta;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.example.retos.userinterfaces.CarritoPage.MENSAJE_ORDEN_EXITOSA;
import static com.example.retos.userinterfaces.RegistroPage.MENSAJE_EMAIL_EXISTENTE;
import static com.example.retos.userinterfaces.RegistroPage.MENSAJE_REGISTRO_EXITOSO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.hamcrest.Matchers.is;

public class DemoWebShopStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario navega hasta la pagina de registro")
    public void queElUsuarioNavegaHastaLaPaginaDeRegistro() {
        OnStage.theActorCalled("Usuario").wasAbleTo(Abrir.laPaginaDeRegistro());
    }

    @Cuando("registra un nuevo usuario")
    public void registraUnNuevoUsuario() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(RegistrarUsuario.conDatosValidos());
    }

    @Cuando("inicia sesion con el usuario creado")
    public void iniciaSesionConElUsuarioCreado() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(IniciarSesion.conElUsuarioRegistrado());
    }

    @Cuando("navega a notebooks y agrega un producto al carrito")
    public void navegaANotebooksYAgregaUnProductoAlCarrito() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                NavegarCategoria.computersYNotebooks(),
                AgregarProductoAlCarrito.notebook()
        );
    }

    @Cuando("entra al checkout y completa billing address")
    public void entraAlCheckoutYCompletaBillingAddress() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                IrAlCarritoYCheckout.continuar(),
                LlenarBillingAddress.yContinuar()
        );
    }

    @Cuando("selecciona tarjeta de credito y completa la informacion de pago")
    public void seleccionaTarjetaDeCreditoYCompletaLaInformacionDePago() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                SeleccionarMetodoPagoTarjeta.yContinuar(),
                LlenarInformacionPago.conTarjetaVisa()
        );
    }

    @Cuando("confirma la orden")
    public void confirmaLaOrden() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(ConfirmarOrden.ahora());
    }

    @Entonces("el usuario ve su sesion iniciada y el mensaje Your order has been successfully processed!")
    public void elUsuarioVeSuSesionIniciadaYElMensajeYourOrderHasBeenSuccessfullyProcessed() {
        Actor actor = OnStage.theActorInTheSpotlight();

        if (MENSAJE_REGISTRO_EXITOSO.resolveFor(actor).isVisible()) {
            String mensaje = MENSAJE_REGISTRO_EXITOSO.resolveFor(actor).getText();
            assertTrue("El registro no fue exitoso", mensaje.contains("Your registration completed"));
        }

        if (MENSAJE_EMAIL_EXISTENTE.resolveFor(actor).isVisible()) {
            fail("El usuario ya existe y no se completo el registro: "
                    + MENSAJE_EMAIL_EXISTENTE.resolveFor(actor).getText());
        }

        actor.attemptsTo(WaitUntil.the(MENSAJE_ORDEN_EXITOSA, isVisible()).forNoMoreThan(10).seconds());
        actor.should(
                GivenWhenThen.seeThat("la orden fue procesada correctamente",
                        OrdenProcesadaCorrectamente.conElUsuarioRegistrado(), is(true))
        );
    }
}
