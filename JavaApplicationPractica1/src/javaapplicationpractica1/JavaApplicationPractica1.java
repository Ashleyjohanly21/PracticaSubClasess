/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpractica1;
import java.util.Scanner;

/**
 *
 * @author Ashley Johanly
 */
public class JavaApplicationPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
         int opcion;
         
    
            System.out.println("1. Solicitar Permiso");
            System.out.println("2. Reportar Horas Extra");
            System.out.println("3. Contactar Representante");
            System.out.println("4. Solicitar Información");
           

            System.out.println("Seleccione una opción:");
            opcion = lectura.nextInt();
            
            Empleado Empleado_p= new Empleado("felipe", "franco", 33,"masculino","bella vista", 80900045, "12 de enero", "098/0764/87",30000,"SECRETARIO");
            Cliente Cliente_p= new Cliente("juan", "franco", 43,"masculino","bella vista", 80900045, "12 de enero", "098/0764/87",40000);
               
        switch (opcion) {
            case 1:
                Empleado_p.solicitudPermiso();
                break;
            case 2:
                Empleado_p.ReporteHorasExtra();
                break;
            case 3:
                Cliente_p.ContactarRepresentante();
                break;
            case 4:
                Cliente_p.SolicitarInformación();
                break;
            default:
                break;
        }
             
               
             

           

    }
}
       
    
        
        
            
    

