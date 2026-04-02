# Reto de Automatizacion - Demo Web Shop

Proyecto de automatizacion web desarrollado con Java, Serenity BDD, Screenplay, Cucumber y JUnit para validar un flujo end to end sobre `https://demowebshop.tricentis.com/`.

## Objetivo

Automatizar el flujo completo de un usuario nuevo:

1. Registro de usuario
2. Inicio de sesion con el usuario creado
3. Navegacion a categoria y subcategoria
4. Agregar producto al carrito
5. Ingreso al checkout
6. Diligenciamiento de billing address
7. Seleccion de metodo de pago con tarjeta de credito
8. Diligenciamiento de informacion de pago
9. Confirmacion de la orden
10. Validacion del mensaje final:

`Your order has been successfully processed!`

## Stack Tecnologico

- Java 17
- Maven
- Serenity BDD
- Screenplay Pattern
- Cucumber
- JUnit 4
- Selenium WebDriver

## Estructura del Proyecto

```text
src/test/java/com/example/retos/
|-- runners
|   `-- RunnerTags.java
|-- stepdefinitions
|   `-- DemoWebShopStepDefinitions.java
|-- tasks
|   |-- Abrir.java
|   |-- RegistrarUsuario.java
|   |-- IniciarSesion.java
|   |-- NavegarCategoria.java
|   |-- AgregarProductoAlCarrito.java
|   |-- IrAlCarritoYCheckout.java
|   |-- LlenarBillingAddress.java
|   |-- SeleccionarMetodoPagoTarjeta.java
|   |-- LlenarInformacionPago.java
|   `-- ConfirmarOrden.java
|-- userinterfaces
|-- models
`-- questions

src/test/resources/features/
`-- reto.feature
```

## Patron Utilizado

El proyecto esta implementado con el patron `Screenplay`, separando:

- `Tasks` para las acciones del usuario
- `Questions` para las validaciones
- `UserInterfaces` para los localizadores
- `StepDefinitions` para orquestar el flujo

## Escenario Automatizado

El escenario principal valida:

- registro exitoso de un usuario nuevo
- login con el usuario registrado
- seleccion de producto en `Computers > Notebooks`
- proceso de compra con tarjeta de credito
- mensaje final de orden procesada exitosamente

## Datos de Pago Utilizados

- Tipo de tarjeta: `Visa`
- Nombre del titular: `Barbara Gordon`
- Numero de tarjeta: `4485564059489345`
- Expiracion: `04/2039`
- Codigo: `123`

## Ejecucion

### Desde IntelliJ IDEA

Ejecutar la clase:

`src/test/java/com/example/retos/runners/RunnerTags.java`

### Desde consola

Si Maven esta instalado y configurado en el `PATH`:

```bash
mvn test
```

## Validaciones Implementadas

Entre las validaciones principales del flujo se encuentran:

- usuario autenticado despues del login
- boton `Log out` visible
- mensaje final `Your order has been successfully processed!`
- URL final con `checkout/completed`
- carrito vacio al finalizar la compra

## Notas

- El correo del usuario se genera de forma dinamica para evitar conflictos por cuentas existentes.
- El proyecto fue refactorizado para mejorar legibilidad, separacion de responsabilidades y limpieza de estructura.
- La carpeta `target/` no se incluye porque es generada automaticamente en cada ejecucion.

## Autor

Proyecto realizado como prueba tecnica de automatizacion QA.
