/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza_pos;

/**
 *
 * @author
 */
abstract class Product {
    String nombre;
    double precio;
    
    Product(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    abstract void imprimirDetalles();
}
