/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau2.arboles.listacontactos.controller;

import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Node;
import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Contacto;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pablo
 */
public class ArbolContactos {

    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insertar(Contacto nuevoContacto) {
        if (raiz == null) {
            raiz = new Node(nuevoContacto);
        } else {
            insertarRecursivo(raiz, nuevoContacto);
        }
    }

    private void insertarRecursivo(Node nodo, Contacto nuevoContacto) {

        if (nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0) {
            if (nodo.getLeft() == null) {
                nodo.setLeft(new Node(nuevoContacto));
            } else {
                insertarRecursivo(nodo.getLeft(), nuevoContacto);
            }
        } else if (nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0) {
            if (nodo.getRight() == null) {
                nodo.setRight(new Node(nuevoContacto));
            } else {
                insertarRecursivo(nodo.getRight(), nuevoContacto);
            }
        } else {
            // El nombre del contacto ya existe, se puede manejar el caso según tus
            // necesidades
            // Por ejemplo, puedes actualizar los datos del contacto existente
        }
    }

    public Contacto buscarContacto(String nombre) {
        return buscarContactoR(this.raiz, nombre);
    }

    private Contacto buscarContactoR(Node node, String nombre) {
        if (node == null || node.contacto.nombre.equals(nombre)) {
            return node != null ? node.contacto : null;
        }

        if (nombre.compareTo(node.contacto.nombre) < 0) {
            return buscarContactoR(node.getLeft(), nombre);
        } else {
            return buscarContactoR(node.getRight(), nombre);
        }
    }

    public void eliminar(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        this.raiz = eliminarContactoR(this.raiz, nombre);
    }

    private Node eliminarContactoR(Node nodo, String nombre) {
        if (nodo == null) {
            return null;
        }
        //Busca el nodo para eliminar el nombre del contacto
        if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            // Si el nombre es menor, se debe buscar en el subárbol izquierdo
            nodo.setLeft(eliminarContactoR(nodo.getLeft(), nombre));
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
            // Si el nombre es mayor,se debe buscar en el subárbol derecho
            nodo.setRight(eliminarContactoR(nodo.getRight(), nombre));
        } else {

            if (nodo.getLeft() == null) {
                return nodo.getRight();
            } else if (nodo.getRight() == null) {
                return nodo.getLeft();
            }

            Node sucesor = encontrarMinimo(nodo.getRight());
            nodo.setValue(sucesor.getContacto());

            nodo.setRight(eliminarContactoR(nodo.getRight(), sucesor.getContacto().getNombre()));
        }

        return nodo;
    }

    public void inorderRecursivo(Node node) {
        if (node != null) {
            inorderRecursivo(node.getLeft());
            System.out.print(node.getContacto() + " - ");
            inorderRecursivo(node.getRight());

        }
    }

    public void rderRecursivo(Node node) {
        if (node != null) {
            System.out.print(node.getContacto() + " - ");
            inorderRecursivo(node.getLeft());

            inorderRecursivo(node.getRight());

        }
    }

    public void poserRecursivo(Node node) {
        if (node != null) {
            inorderRecursivo(node.getLeft());

            inorderRecursivo(node.getRight());
            System.out.print(node.getContacto() + " - ");

        }
    }

    public void printTreeNode(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getContacto());
            printTreeNode(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            printTreeNode(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }

    }

    public Node getRoot() {
        return raiz;
    }

    public boolean estaBalanceado() {
        return verificarBalance(raiz);
    }

    private boolean verificarBalance(Node nodo) {
        if (nodo == null) {
            return true; // Árbol vacío, se considera balanceado
        }

        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRight());

        int diferenciaAlturas = Math.abs(alturaIzquierda - alturaDerecha);

        // Verificar si las alturas difieren en más de 1 unidad
        if (diferenciaAlturas > 1) {
            return false; // No está balanceado
        }

        // Verificar recursivamente los subárboles izquierdo y derecho
        return verificarBalance(nodo.getLeft()) && verificarBalance(nodo.getRight());
    }

    private int obtenerAltura(Node nodo) {
        if (nodo == null) {
            return 0; // Altura de un árbol vacío es 0
        }

        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRight());

        // La altura del nodo es el máximo entre la altura de sus subárboles más 1
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    //// [Eliminar un nodo]
    public void eliminarContacto(String nombre) {
        raiz = eliminarContactoRec(raiz, nombre);
    }

    public Node eliminarContactoRec(Node nodo, String nombre) {
        // Caso base: si el nodo es nulo, no se puede eliminar
        if (nodo == null) {
            return nodo;
        }

        // Buscar el nodo a eliminar según el nombre del contacto
        if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            // Si el nombre es menor, buscar en el subárbol izquierdo
            nodo.setLeft(eliminarContactoRec(nodo.getLeft(), nombre));
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
            // Si el nombre es mayor, buscar en el subárbol derecho
            nodo.setRight(eliminarContactoRec(nodo.getRight(), nombre));
        } else {
            // Si el nombre coincide, este es el nodo a eliminar

            // Caso 1: nodo sin hijos o con un solo hijo
            if (nodo.getLeft() == null) {
                return nodo.getRight();
            } else if (nodo.getRight() == null) {
                return nodo.getLeft();
            }

            // Caso 2: nodo con dos hijos
            // Encontrar el nodo sucesor más pequeño en el subárbol derecho o el nodo
            // predecesor más grande en el subárbol izquierdo
            Node sucesor = encontrarMinimo(nodo.getRight());
            nodo.setValue(sucesor.getContacto());

            // Eliminar el sucesor encontrado
            nodo.setRight(eliminarContactoRec(nodo.getRight(), sucesor.getContacto().getNombre()));
        }

        return nodo;
    }

    private Node encontrarMinimo(Node root) {
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    public void agregarCorreo(String nombre, String correo) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contacto.emails.add(correo);
        }
    }

    public void agregarRedSocial(String nombre, String redSocial, String url) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contacto.redesSociales.put(redSocial, url);
        }
    }

    public void Preorder() {
        imprimirPreorderRe(this.raiz);
    }

    private void imprimirPreorderRe(Node node) {
        if (node != null) {
            System.out.println(node.contacto.nombre);
            imprimirPreorderRe(node.getLeft());
            imprimirPreorderRe(node.getRight());
        }
    }

    public void Achura() {
        if (this.raiz == null) {
            return;
        }

        Queue<Node> cola = new LinkedList<>();
        cola.add(this.raiz);

        while (!cola.isEmpty()) {
            Node nodo = cola.poll();
            System.out.println(nodo.contacto.nombre);

            if (nodo.getLeft() != null) {
                cola.add(nodo.getLeft());
            }

            if (nodo.getRight() != null) {
                cola.add(nodo.getRight());
            }
        }
    }

    public int pesoArbol() {
        if (this.raiz == null) {
            return 0;
        }
        return pesoRecursivo(this.raiz);
    }

    private int pesoRecursivo(Node nodo) {
        if (nodo == null) {
            return 0;
        }

        int izquierdo = pesoRecursivo(nodo.getLeft());
        int derecho = pesoRecursivo(nodo.getRight());

        return 1 + izquierdo + derecho;
    }

}
