/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tareaaop.Adapter;

/**
 *
 * @author Nueva
 */
public class ReciboAdapter implements Factura {
    private ReciboAntiguo reciboAntiguo;

    public ReciboAdapter(ReciboAntiguo reciboAntiguo) {
        this.reciboAntiguo = reciboAntiguo;
    }

    @Override
    public void generarFactura(String cliente, double monto) {
        // Adaptamos la llamada al formato esperado por el sistema antiguo
        reciboAntiguo.imprimirRecibo(cliente, monto);
    }
}
