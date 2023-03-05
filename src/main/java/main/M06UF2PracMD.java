package main;

import java.util.Scanner;

/**
 * @version 1.0
 * @author FPShare
 */
public class M06UF2PracMD {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce el nombre de la base de datos (si no tienes, deja en blanco este campo y se te creará una nueva):");
        String nombreBD = in.nextLine();
        System.out.print("Introduce tu usuario:");
        String user = in.nextLine();
        System.out.print("Introduce la contraseña:");
        String password = in.nextLine();
        
        menuPrincipal();
    }
    
    public static void creacionObjetos() {
        System.out.println("Has seleccionado crear");
        System.out.println("--------------------------------------");
        System.out.println("¿Que deseas crear?");
        System.out.println("");
        
        System.out.println("1. Aeronave de Combate");
        System.out.println("2. Aeronave de Transporte");
        System.out.println("3. Aeronave con Dron");
        System.out.println("4. Soldado Mecánico");
        System.out.println("5. Soldado Piloto");
        System.out.println("6. Misión");
    }
    
    public static void eliminacionObjetos() {
        System.out.println("Has seleccionado eliminar");
        System.out.println("--------------------------------------");
        System.out.println("¿Que deseas eliminar?");
        System.out.println("");
        
        System.out.println("1. Aeronave de Combate");
        System.out.println("2. Aeronave de Transporte");
        System.out.println("3. Aeronave con Dron");
        System.out.println("4. Soldado Mecánico");
        System.out.println("5. Soldado Piloto");
        System.out.println("6. Misión");
    }
    
    public static void listadoObjetos() {
        System.out.println("Has seleccionado listar");
        System.out.println("--------------------------------------");
        System.out.println("¿Que deseas listar?");
        System.out.println("");
        
        System.out.println("1. Aeronave de Combate");
        System.out.println("2. Aeronave de Transporte");
        System.out.println("3. Aeronave con Dron");
        System.out.println("4. Soldado Mecánico");
        System.out.println("5. Soldado Piloto");
        System.out.println("6. Misión");
    }
    
    public static void menuPrincipal() {
        in.next();
        System.out.println("Bienvenido usuario, ¿Qué deseas hacer?");
        System.out.println("--------------------------------------");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Crear un elemento");
        System.out.println("2. Eliminar un elemento");
        System.out.println("3. Listar un elemento");
        
        int opcionUser = in.nextInt();
        
        switch(opcionUser) {
            case 1 : {
                System.out.println("");
                creacionObjetos();
            }
            
            case 2 : {
                System.out.println("");
                eliminacionObjetos();
            }
            
            case 3 : {
                System.out.println("");
                listadoObjetos();
            }
        }
    }
}
