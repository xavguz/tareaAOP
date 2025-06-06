/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tareaaop.Singleton;

/**
 *
 * @author Nueva
 */
public class Configurador {
    
    private String url;
    private String baseDatos;
    private static Configurador miconfigurador;
    
    private Configurador(String url, String baseDatos){
        this.url = url;
        this.baseDatos = baseDatos;
       }
    
    public static Configurador getConfigurador(String url, String baseDatos) {
        if (miconfigurador == null) {
            miconfigurador = new Configurador(url, baseDatos);
        }
        return miconfigurador;
    }
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getBaseDatos() {
        return baseDatos;
    }
    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }   
}
