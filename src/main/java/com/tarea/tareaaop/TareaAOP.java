/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tarea.tareaaop;
import com.tarea.tareaaop.Adapter.Factura;
import com.tarea.tareaaop.Adapter.ReciboAdapter;
import com.tarea.tareaaop.Adapter.ReciboAntiguo;
import com.tarea.tareaaop.Singleton.Configurador;

/**
 *
 * @author Nueva
 */
public class TareaAOP {

    public static void main(String[] args) {
        
       //Adapter
       Factura factura1 = new ReciboAdapter(new ReciboAntiguo());
       factura1.generarFactura("Pedro Lopez", 243.21);
       
       
       //Singleton
       Configurador conf1 = Configurador.getConfigurador("jdbc:mysql://localhost:3306/", "mi_base");
       Configurador conf2 = Configurador.getConfigurador("otra_url", "otra_base");

       System.out.println("Configuración 1:");
       System.out.println("URL: " + conf1.getUrl());
       System.out.println("Base de Datos: " + conf1.getBaseDatos());

       System.out.println("\nConfiguración 2:");
       System.out.println("URL: " + conf2.getUrl());
       System.out.println("Base de Datos: " + conf2.getBaseDatos());

       System.out.println("\n¿conf1 y conf2 son la misma instancia? " + (conf1 == conf2));
    
    }
    
    
}
