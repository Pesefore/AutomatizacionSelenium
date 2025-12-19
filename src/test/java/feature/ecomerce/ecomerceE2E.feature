@EcomerceE2E
Feature: Flujo end two end de una plataforma de Ecommerce
  Scenario Outline:
    Given el usuario se encuentra en la plataforma de Academia Centyc
    And ingresa al modulo de TIENDA PARA PRUEBAS
    And da click a IR A LA TIENDA DE PRUEBAS CENTYC
    Then habra cargado otra pestaña de articulos para que el usuario pueda hacer su compra
    And escoge la Mascara Buena Onda
    And agrega al carrito cuatro unidades del articulo escogido
    And da click a AGREGAR AL CARRITO
    And da click a Finalzar Compra
    Then se redirigira a una nueva pagina para colocar los detalles del usuario comprador
    And el usuario digita su "<correoElectronico>" en el imput de Correo electronico
    And digita su "<nombreCompleto>" en el imput de Nombre
    And digita su "<apellidoCompleto>" en el imput de Apellido
    And escoge su pais de nacimiento en el dropdown de Pais
    And digita su "<ciudad>" en el imput de Ciudad
    And ingresa su "<direccionCompleta>" en el imput de Direccion
    And ingresa su "<numeroTelefono>" en el imput de Telefono
    And ingresa su "<notaAdicional>" en el imput de Notas del Pedido
    And usuario da click al REALIZAR EL PEDIDO
    Then usuario habra completado exitosamente el pedido
    Examples:
    |correoElectronico|nombreCompleto|apellidoCompleto|ciudad|direccionCompleta|numeroTelefono|notaAdicional|
    |zerlego89@gmail.com|Alexis Santiago|Cordobez Pelagato|Lima|Pasaje Nicolás de Ribera El Viejo 145, Centro Histórico de Lima|904856366|Esto es una prueba de automatización funcional por parte de un QE Senior|
