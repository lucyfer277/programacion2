# Justificación

Los campos de la clase son privados para impedir que otras clases puedan
modificar directamente la capacidad o el nivel del tanque.

La capacidad se declara como final porque representa el límite máximo
del tanque y no debe cambiar después de construir el objeto.

El invariante principal de la clase es que el nivel siempre debe estar
entre cero y la capacidad máxima.

El método llenar evita que el nivel supere la capacidad y devuelve la
cantidad de combustible que no pudo entrar al tanque.

El método consumir solamente modifica el nivel cuando existe suficiente
combustible, evitando que el nivel llegue a ser negativo.

Además, las cantidades negativas se rechazan mediante una excepción.
De esta manera, ninguna secuencia válida de llamadas puede dejar al
tanque en un estado imposible.