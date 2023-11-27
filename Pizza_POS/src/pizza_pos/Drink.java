/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza_pos;

/**
 *
 * @author jade
 */
public class Drink extends Product {
    String flavor;

    Drink(String nombre, double precio, String flavor) {
        super(nombre, precio);
        this.flavor = flavor;
    }

    @Override
    void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Sabor: " + flavor);
    }

    // You can add additional methods specific to the Drink class if needed
}
