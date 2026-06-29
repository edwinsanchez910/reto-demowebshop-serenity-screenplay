<<<<<<< HEAD
package com.choucair.retos.userinterfaces;
=======
package com.example.retos.userinterfaces;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {

    public static final Target PRODUCTO_NOTEBOOK = Target.the("producto notebook")
            .located(By.linkText("14.1-inch Laptop"));

    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("boton agregar al carrito")
            .located(By.id("add-to-cart-button-31"));

    public static final Target MENSAJE_PRODUCTO_AGREGADO = Target.the("mensaje de producto agregado")
            .located(By.cssSelector(".bar-notification.success"));

    public static final Target TITULO_PRODUCTO = Target.the("titulo del producto")
            .located(By.cssSelector(".product-name h1"));
}
