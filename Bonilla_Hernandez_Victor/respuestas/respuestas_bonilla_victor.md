PREGUNTA 1:
Explica cómo funciona la relación 1:N entre Agencia y Satelite tanto en SQL como en Java.

RESPUESTA 1:
La relacion implica que una agencia podra tener varios satelites
pero que un satelite solo podra pertenecer a una agencia.


PREGUNTA 2: Explica por qué en Java utilizamos: private Agencia agencia; y no: private int agenciaId;

RESPUESTA2: Al utilizar Agencia estamos llamando directamente al objeto en lugar
de tener que llamar a un select en la base de datos para saber que elemento
coincide con el id de la agencia. Es mucho mas rapido y mucho mas simple, ademas de contar con todas las 
caracteristicas del objeto directamente desde java.


