/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpractica1;

/**
 *
 * @author Ashley Johanly
 */
public class Empleado extends PersonaCprincipal{
  
    private int sueldo;
    private String rol;

    public Empleado(String nombre, String apellido, int edad, String sexo, String direccion, int tel, String fechaNacimiento, String cedula, int sueldo, String rol) {
        super(nombre, apellido, edad, sexo, direccion, tel, fechaNacimiento, cedula);
        this.sueldo = sueldo;
        this.rol = rol;
    }
    
     public void solicitudPermiso(){
        System.out.println("para solicitar permiso marque al 809-897-2345");
    }
     
     public void ReporteHorasExtra(){
        System.out.println("para obtener un reporte de las horas extras marque al 829-234-1213");
    }
     
}
