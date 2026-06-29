package com.retos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL = Target.the("campo email login")
            .located(By.id("Email"));

    public static final Target PASSWORD = Target.the("campo password login")
            .located(By.id("Password"));

    public static final Target BOTON_LOGIN = Target.the("boton login")
            .located(By.cssSelector("input.login-button"));
}
