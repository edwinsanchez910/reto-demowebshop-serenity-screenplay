package com.example.retos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {

    public static final Target GENERO_MASCULINO = Target.the("opcion genero masculino")
            .located(By.id("gender-male"));

    public static final Target NOMBRE = Target.the("campo first name")
            .located(By.id("FirstName"));

    public static final Target APELLIDO = Target.the("campo last name")
            .located(By.id("LastName"));

    public static final Target EMAIL = Target.the("campo email")
            .located(By.id("Email"));

    public static final Target PASSWORD = Target.the("campo password")
            .located(By.id("Password"));

    public static final Target CONFIRMAR_PASSWORD = Target.the("campo confirm password")
            .located(By.id("ConfirmPassword"));

    public static final Target BOTON_REGISTRAR = Target.the("boton register")
            .located(By.id("register-button"));

    public static final Target MENSAJE_REGISTRO_EXITOSO = Target.the("mensaje de registro exitoso")
            .located(By.cssSelector(".result"));

    public static final Target MENSAJE_EMAIL_EXISTENTE = Target.the("mensaje de email existente")
            .located(By.cssSelector(".message-error.validation-summary-errors"));
}
