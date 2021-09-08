
Feature: login exitoso y compra exitosa

  Scenario: datos personales
    Given el usuario desea ingresar a la tienda
    When da click en el boton Sign in creara una cuenta
    And ingresara un correo electrinico
    And dara click en el boton crete an account
    And llenara la lista de datos solicitados
    Then quedara registrado en la pagina 
    And seleccionara una prenda
    And la agregara al carrito de compras
    And tendra la opcion de realizar el pago en linea

  