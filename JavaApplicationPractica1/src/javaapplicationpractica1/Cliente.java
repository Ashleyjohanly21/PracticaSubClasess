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
public class Cliente extends PersonaCprincipal {
   
   public int saldo;
    
   public Cliente(String nombre, String apellido, int edad, String sexo, String direccion, int tel, String fechaNacimiento,
           String cedula, int saldo) {
        super(nombre, apellido, edad, sexo, direccion, tel, fechaNacimiento, cedula);
        this.saldo= saldo;
    }
    
    
    public void ContactarRepresentante(){
        System.out.println("Para contactar al representante marque al 809-897-2345");
    }
     
     public void SolicitarInformación(){
        System.out.println("Para solicitar información al 809-870-2345");
    }
}
    