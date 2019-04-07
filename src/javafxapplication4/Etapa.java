/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.scene.Node;

/**
 *
 * @author 19927664
 */
abstract public class Etapa {
    
    private String Descripcion;
    private Etapa siguiente;
    
    
    
    
    
    public Etapa(String Descripcion) {
        this.Descripcion = Descripcion;
        this.siguiente = null;
    }
    
    
    
    abstract public String Funcionamiento();

    abstract public Node crearFigura();
    
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Etapa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Etapa siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
