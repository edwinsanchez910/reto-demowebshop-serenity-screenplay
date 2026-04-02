package com.example.retos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target CHECKBOX_TERMINOS = Target.the("checkbox terminos de servicio")
            .located(By.id("termsofservice"));

    public static final Target BOTON_CHECKOUT = Target.the("boton checkout")
            .located(By.id("checkout"));

    public static final Target SELECT_COUNTRY = Target.the("select country")
            .located(By.id("BillingNewAddress_CountryId"));

    public static final Target SELECT_STATE = Target.the("select state")
            .located(By.id("BillingNewAddress_StateProvinceId"));

    public static final Target CAMPO_CITY = Target.the("campo city")
            .located(By.id("BillingNewAddress_City"));

    public static final Target CAMPO_ADDRESS1 = Target.the("campo address1")
            .located(By.id("BillingNewAddress_Address1"));

    public static final Target CAMPO_ZIP = Target.the("campo zip")
            .located(By.id("BillingNewAddress_ZipPostalCode"));

    public static final Target CAMPO_PHONE = Target.the("campo phone")
            .located(By.id("BillingNewAddress_PhoneNumber"));

    public static final Target BOTON_CONTINUE_BILLING = Target.the("boton continue billing")
            .located(By.cssSelector("#billing-buttons-container .new-address-next-step-button"));

    public static final Target BOTON_CONTINUE_SHIPPING_ADDRESS = Target.the("boton continue shipping address")
            .located(By.cssSelector("#shipping-buttons-container .new-address-next-step-button"));

    public static final Target RADIO_SHIPPING_GROUND = Target.the("radio shipping ground")
            .located(By.id("shippingoption_0"));

    public static final Target BOTON_CONTINUE_SHIPPING_METHOD = Target.the("boton continue shipping method")
            .located(By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button"));

    public static final Target RADIO_CREDIT_CARD = Target.the("radio credit card")
            .located(By.id("paymentmethod_2"));

    public static final Target BOTON_CONTINUE_PAYMENT_METHOD = Target.the("boton continue payment method")
            .located(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button"));

    public static final Target SELECT_TIPO_TARJETA = Target.the("select tipo tarjeta")
            .located(By.id("CreditCardType"));

    public static final Target CAMPO_NOMBRE_TITULAR = Target.the("campo nombre titular")
            .located(By.id("CardholderName"));

    public static final Target CAMPO_NUMERO_TARJETA = Target.the("campo numero tarjeta")
            .located(By.id("CardNumber"));

    public static final Target SELECT_MES_EXPIRACION = Target.the("select mes expiracion")
            .located(By.id("ExpireMonth"));

    public static final Target SELECT_ANIO_EXPIRACION = Target.the("select anio expiracion")
            .located(By.id("ExpireYear"));

    public static final Target CAMPO_CODIGO_TARJETA = Target.the("campo codigo tarjeta")
            .located(By.id("CardCode"));

    public static final Target BOTON_CONTINUE_PAYMENT_INFO = Target.the("boton continue payment info")
            .located(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button"));

    public static final Target BOTON_CONFIRMAR_ORDEN = Target.the("boton confirmar orden")
            .located(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button"));

    public static final Target MENSAJE_ORDEN_EXITOSA = Target.the("mensaje orden exitosa")
            .located(By.cssSelector(".section.order-completed .title strong"));
}
