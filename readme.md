# Universidad Politécnica Salesiana

Estructura de Datos
- Arboles Binarios
- Diccionarios con HashMap

[Ejercicio Ejemplo]



# Sistema de Gestión de Contactos

Este proyecto implementa un sistema de gestión de contactos telefónicos utilizando el patrón Modelo-Vista-Controlador (MVC). A continuación, se detalla la estructura del proyecto y se brinda una explicación sobre los diccionarios y HashMap utilizados.

## Estructura del proyecto

El proyecto está organizado en las siguientes clases:

- `ArbolContactos`: Representa el árbol binario de búsqueda utilizado para almacenar los contactos. Esta clase implementa las operaciones de inserción, búsqueda y eliminación de contactos en el árbol.

- `Contacto`: Representa un contacto telefónico y contiene los atributos `nombre` y `telefono`. Además, se ha agregado una variable adicional llamada `redesSociales` que almacena una colección de redes sociales asociadas al contacto.

- `Node`: Clase que representa un nodo del árbol binario de búsqueda. Cada nodo contiene una instancia de la clase `Contacto` y las referencias a los nodos izquierdo y derecho.

- `Main`: Clase principal que contiene el punto de entrada del programa y se encarga de interactuar con el usuario a través de la consola.

## Explicación de Diccionarios y HashMap

### Diccionarios

Los diccionarios son estructuras de datos que almacenan pares clave-valor, donde cada clave es única y se utiliza para acceder a su correspondiente valor. En este proyecto, la clase `HashMap` de Java se considera un diccionario, ya que almacena elementos en forma de pares clave-valor.

### HashMap

La clase `HashMap` en Java es una implementación de la interfaz `Map`, que proporciona una estructura de datos basada en tablas hash. Permite almacenar y acceder eficientemente a elementos utilizando claves únicas. En el contexto de este proyecto, se utiliza un `HashMap` para asociar el nombre de un contacto con su instancia correspondiente.





---

### JSON: Estructura de Datos en Formato Clave-Valor

**JSON** (JavaScript Object Notation) no es considerado un diccionario en sí mismo, sino un formato de intercambio de datos. Sin embargo, la estructura de un objeto JSON se asemeja a un diccionario en algunos aspectos.

En **JSON**, los datos se representan en **pares clave-valor**, donde cada clave es única y se utiliza para acceder a su correspondiente valor. Esto se asemeja a la estructura de un diccionario, donde cada elemento se identifica por una clave y contiene un valor asociado.

En muchos lenguajes de programación, es común utilizar estructuras de datos como **diccionarios** o **mapas** para almacenar y manipular objetos JSON. Estas estructuras permiten acceder a los valores mediante las claves y proporcionan métodos para agregar, modificar y eliminar elementos.

JSON en sí mismo no es un diccionario, pero su estructura de pares clave-valor se asemeja a la de un diccionario y puede ser representado y manipulado utilizando estructuras de datos similares.

