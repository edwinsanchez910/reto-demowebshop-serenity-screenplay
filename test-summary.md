# Resumen de pruebas

Proyecto: reto-demowebshop-serenity-screenplay1
Feature: Registro y Compra en Demo Web Shop
Escenario / Caso: Registro exitoso de nuevo usuario
Resultado global: SUCCESS
Inicio: 2026-06-29T09:04:18.475892300-05:00[America/Bogota]
Duración (ms): 4150
Tags: regresion, Escenario1, Chrome, Windows

Pasos principales (top-level):
- Dado que el usuario navega hasta la pagina de registro — SUCCESS
- Cuando registra un nuevo usuario — SUCCESS
- Y inicia sesion con el usuario creado — SUCCESS
- Y navega a notebooks y agrega un producto al carrito — SUCCESS
- Y entra al checkout y completa billing address — SUCCESS
- Y selecciona tarjeta de credito y completa la informacion de pago — SUCCESS
- Y confirma la orden — SUCCESS
- Entonces el usuario ve su sesion iniciada y el mensaje "Your order has been successfully processed!" — SUCCESS

Notas:
- Se generan capturas para cada paso en target/site/serenity/ (ver archivos PNG y JSON generados).
- Total de pasos (incluyendo subpasos): múltiples (ver JSON detallado en target/site/serenity/*.json).
- Para ver detalles por paso o las capturas, abrir los JSON en target/site/serenity o el HTML de reportes en target/site/serenity/index.html
