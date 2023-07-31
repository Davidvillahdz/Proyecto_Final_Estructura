/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau2.arboles.listacontactos.models;

/**
 *
 * @author pablo
 */
public class Node {

    public Contacto contacto;
    private Node left;
    private Node right;

    public Node(Contacto contacto) {
        this.contacto = contacto;
        left = null;
        right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(Contacto value) {
        this.contacto = value;
    }

}
