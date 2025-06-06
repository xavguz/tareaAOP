/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tarea.tareaaop.Adapter;

/**
 *
 * @author Nueva
 */
public class ReciboAntiguo {
    public void imprimirRecibo(String nombreCliente, double cantidad) {
        System.out.println("=== RECIBO ===");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total: $" + cantidad);
        System.out.println("================");
    }
}
