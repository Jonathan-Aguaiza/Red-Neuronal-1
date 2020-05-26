/*
 * Implemente un algoritmo que le permita:
1). Desplegar el nombre del proyecto de su paper.
2). Qué es una red neuronal.
3). Cuáles son los elementos que forman una red neuronal.
4). Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5). Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto.
6). En qué consistió el entrenamiento utilizado una red neuronal, e indique 
    el algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objeto=new Scanner(System.in);
        System.out.println("            UNIVEIRSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        System.out.println("1.- Ingrese el nombre del Paper");
        String paper=objeto.nextLine();
        //
               
        
        System.out.println("2.- ¿Qué es una Red Neuronal?");
        String redNeuronal=objeto.nextLine();
        
        System.out.println("3.- Cuáles son los elementos que forman una red neuronal");
        String elemento=objeto.nextLine();
        
        System.out.println("4.- Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado");
        String utilizar=objeto.nextLine();
        
        System.out.println("5.- Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto");
        String utilizaria=objeto.nextLine();
        
        System.out.println("6.- En qué consistió el entrenamiento utilizado una red neuronal, e indique "
                + "el algoritmo utilizado");
        String entrenamiento=objeto.nextLine();
        
    }
    
}
