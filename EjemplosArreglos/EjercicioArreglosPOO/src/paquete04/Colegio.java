/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author ASUS
 */
public class Colegio {
    
    private String nombre;
    private String ciudad;
    
    public Colegio(String n, String c){
        
        nombre = n;
        ciudad = c;
        
    }
    
    public void establecerNombre(String x){
        
        nombre = x;
        
    }
    
    public void establecerCiudad(String x){
        
        ciudad = x;
        
    }
    
    public String obtenerNombre(){
        
        return nombre;
        
    }
    
    public String obtenerCiudad(){
        
        return ciudad;
        
    }
        
        
    
}
