[![Universidad Politécnica Salesiana ](UPS "Universidad Politécnica Salesiana ")](https://upload.wikimedia.org/wikipedia/commons/b/b0/Logo_Universidad_Polit%C3%A9cnica_Salesiana_del_Ecuador.png "Universidad Politécnica Salesiana ")
# Universidad Politécnica Salesiana

# PROYECTO FIN DE CICLO

Juan Álvarez, David Villa

Estructura de Datos

Ing. Pablo Torres.



# DESCRIPCION DEL PROYECTO:

El objetivo de este proyecto es desarrollar un programa que permita gestionar una lista de contactos telefónicos. Cada contacto compuesto por lo siguiente:

•	NOMBRE: El nombre del contacto, puede ser cualquier cadena de texto representado el nombre y apellido.

•	Número de teléfono: Un número telefónico asociado al contacto, que puede ser de cualquier longitud y formato (número fijo, móvil, con código de país, etc.).

•	Colección de correos: Una lista que contendrá las direcciones de correo electrónico asociadas al contacto. Puede haber cero o varias direcciones de correo electrónico almacenadas en esta colección.

•	Diccionario de redes sociales: Un diccionario donde se almacenará la información de las redes sociales asociadas al contacto. La clave del diccionario será el nombre de la red social (por ejemplo, "Facebook", "Twitter", "Instagram", etc.), y el valor será el usuario o perfil del contacto en esa red.

## FUNCIONALIDADES:

•	Agregar contacto: El programa permitirá ingresar un nuevo contacto con su nombre, número de teléfono, cero o más correos electrónicos y las redes sociales con sus respectivos usuarios.

•	Eliminar contacto: Se podrá eliminar un contacto existente a partir de su nombre o número de teléfono.

•	Agregar un correo (Según nombre de contacto, agrega un correo a la Coleccion)

•	Agregar una red social (Según nombre de contacto, agrega una red social, pasando como argumento la llave del diccionario y el valor (url)) (Si la llave ya existe deberá ser actualizado por la url que me manda).

•	Imprimir el árbol según el recorrido:

o	preorder

o	inorder

o	postorder

o	anchura

•	Obtener el número de contactos totales (Peso del árbol)

•	Buscar contacto: El programa permitirá buscar un contacto por su nombre o número de teléfono y mostrar toda su información, incluyendo correos electrónicos y redes sociales asociadas.

•	Salir: Opción para cerrar el programa de forma segura.

Este proyecto proporciona una herramienta útil para que los usuarios puedan almacenar y administrar sus contactos de manera organizada, con la flexibilidad de agregar información sobre correos electrónicos y perfiles de redes sociales asociados a cada contacto.


## DOCUMENTACION DE CADA UNA DE LAS CLASES DEL PROYECTO:

### ARBOL CONTACTOS

La clase ArbolContactos representa el árbol de búsqueda binaria y tiene una variable miembro privada raíz de tipo Node, que sirve como raíz del árbol.

El constructor inicializa el árbol estableciendo la raíz raíz en null.
 
El método Agregar se utiliza para agregar un nuevo contacto al árbol. Si el árbol está vacío (la raíz es null), crea directamente un nuevo nodo raíz. De lo contrario, llama al método recursivo privado agregarRecursivo para encontrar la posición adecuada para insertar el nuevo contacto en el árbol. 

El método recursivo privado agregarRecursivo se encarga de encontrar la posición correcta para insertar el nuevo contacto en el árbol. 

Compara el nombre del nuevoContacto con el nombre de contacto del nodo actual y recorre el árbol en consecuencia hasta que encuentra una posición adecuada. 

El método buscarContacto le permite buscar un contacto proporcionando su nombre. Llama al método recursivo privado buscarContactoRecursivo para realizar la búsqueda a partir de la raíz. 

El método recursivo privado buscarContactoRecursivo busca un contacto comparando el proporcionado nombre con los nombres de contacto en el árbol. Recorre el árbol de manera similar a agregar, pero en lugar de insertar, busca un contacto coincidente. 

El método eliminarse utiliza para eliminar un contacto del árbol. Llama al método recursivo privado eliminarContactoRecpara realizar la eliminación a partir de la raíz. 

El método recursivo privado eliminarContactoRecse encarga de eliminar un contacto del árbol. Maneja tres casos: eliminar un nodo sin hijos, un hijo o dos hijos. 

Los métodos agregarCorreo y agregarRedSocial permiten agregar direcciones de correo electrónico e información de redes sociales a un contacto, respectivamente. Encuentran el contacto por nombre usando el buscarContactométodo y luego actualizan la información correspondiente. 

Los métodos Preorder, inorderRecursivo, poserRecursivoy Achurase utilizan para diferentes tipos de recorridos de árboles: preorden, en orden, postorden y recorrido primero en anchura (orden de nivel), respectivamente. Imprimen los nombres de los contactos mientras recorren el árbol en el orden especificado. 

El método getRoot de vuelve el nodo raíz del árbol. El método estaBalanceadocomprueba si el árbol está equilibrado o no llamando al método recursivo privado verificarBalance. 

El método recursivo privado verificarBalance verifica si el árbol que comienza desde lo dado nodo está equilibrado. Calcula las alturas de los subárboles izquierdo y derecho y asegura que la diferencia entre sus alturas no sea mayor a 1. 

El método pesoArbolcalcula el número total de nodos (peso) en el árbol llamando al método recursivo privado pesoRecursivo. 

El método recursivo privado pesoRecursivocalcula el peso del árbol enraizado en el dado nodocontando el número de nodos en el subárbol.

Esa es una breve descripción general de la funcionalidad del fragmento de código proporcionado para un árbol de búsqueda binaria para administrar contactos. Permite agregar, buscar y eliminar contactos, así como agregar información adicional como direcciones de correo electrónico y enlaces de redes sociales. La clase también proporciona varios métodos transversales de árboles y métodos para verificar el saldo y calcular el número total de nodos en el árbol.

### CONTACTO

Atributos:

Nombre: Un atributo público de tipo String, que almacena el nombre del contacto.

Teléfono: Un atributo privado de tipo String, que almacena el número de teléfono del contacto.

Emails: Una colección de tipo List que almacenará correos electrónicos asociados al contacto.

RedesSociales: Un diccionario de tipo Map que almacenará las redes sociales del contacto, con las llaves siendo el nombre de la red social y los valores siendo los nombres de usuario asociados.

Constructor:

La clase tiene un constructor público que acepta dos parámetros: nombre y teléfono. Al crear un objeto Contacto, se deben proporcionar estos valores, y la colección de correos electrónicos y el diccionario de redes sociales se inicializarán como listas vacías.

Métodos:

getNombre () y getTelefono (): Métodos públicos para obtener el nombre y el teléfono del contacto, respectivamente.

setNombre () y setTelefono(): Métodos públicos para establecer el nombre y el teléfono del contacto, respectivamente.

getEmails () y getRedesSociales (): Métodos públicos para obtener las listas de correos electrónicos y redes sociales del contacto, respectivamente.

setEmails () y setRedesSociales (): Métodos públicos para establecer la lista de correos electrónicos y el diccionario de redes sociales del contacto, respectivamente.

agregarRedSocial (): Método público que permite agregar una red social al diccionario redesSociales, tomando como entrada el nombre de la red social y el nombre de usuario asociado.

eliminarRedSocial (): Método público que permite eliminar una red social del diccionario redes Sociales, tomando como entrada el nombre de la red social.

modificarRedSocial (): Método público que permite modificar el valor de una red social en el diccionario redes Sociales, tomando como entrada el nombre de la red social y el nuevo nombre de usuario.

### NODE

Contacto: Esta variable contiene un objeto de tipo Contacto. Representa los datos asociados con este nodo en el árbol binario.

Left: esta variable contiene una referencia al nodo secundario izquierdo del nodo actual.

Right: esta variable contiene una referencia al nodo secundario derecho del nodo actual.

La clase tiene un constructor que toma un Contacto objeto como parámetro. Cuando Node se crea un nuevo objeto, inicializa el contacto variable con el Contacto objeto dado y establece tanto left como right referencias a null.

Estos son métodos getter para acceder a las variables de instancia de la clase. Permiten que código externo recupere los valores de left, right y contacto variables.

En resumen, esta Node clase representa un nodo básico de un árbol binario, donde cada nodo contiene un Contacto objeto y tiene referencias a sus nodos secundarios izquierdo y derecho.

Esta clase se puede utilizar para construir una estructura de datos de árbol binario para administrar y organizar Contacto objetos.





