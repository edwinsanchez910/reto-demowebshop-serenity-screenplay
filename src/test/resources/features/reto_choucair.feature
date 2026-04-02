# language: es
@regresion
Característica: Registro y Compra en Demo Web Shop
  Como un nuevo usuario
  Quiero registrarme en la plataforma y realizar una compra
  Para validar el flujo completo de la tienda

  @Escenario1
  Escenario: Registro exitoso de nuevo usuario
    Dado que el usuario navega hasta la pagina de registro
    Cuando registra un nuevo usuario
    Y inicia sesion con el usuario creado
    Y navega a notebooks y agrega un producto al carrito
    Y entra al checkout y completa billing address
    Y selecciona tarjeta de credito y completa la informacion de pago
    Y confirma la orden
    Entonces el usuario ve su sesion iniciada y el mensaje Your order has been successfully processed!
