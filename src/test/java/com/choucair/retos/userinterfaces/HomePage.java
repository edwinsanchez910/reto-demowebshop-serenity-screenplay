<<<<<<< HEAD
package com.choucair.retos.userinterfaces;
=======
package com.example.retos.userinterfaces;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://demowebshop.tricentis.com/")
public class HomePage extends PageObject {

    public static final Target BOTON_REGISTRO = Target.the("boton para ir al registro")
            .located(By.className("ico-register"));

    public static final Target BOTON_LOGIN = Target.the("boton para ir al login")
            .located(By.className("ico-login"));

    public static final Target BOTON_LOGOUT = Target.the("boton para cerrar sesion")
            .located(By.className("ico-logout"));

    public static final Target USUARIO_LOGUEADO = Target.the("correo del usuario logueado")
            .located(By.className("account"));

    public static final Target CATEGORIA_COMPUTERS = Target.the("categoria computers")
            .located(By.linkText("Computers"));

    public static final Target SUBCATEGORIA_NOTEBOOKS = Target.the("subcategoria notebooks")
            .located(By.linkText("Notebooks"));

    public static final Target CONTADOR_CARRITO = Target.the("contador del carrito")
            .located(By.cssSelector(".cart-qty"));

    public static final Target LINK_CARRITO = Target.the("link del carrito")
            .located(By.cssSelector(".cart-label"));
}
