/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.util.Scanner;

/**
 *
 * @author Chiri
 */
public class Vista {

    private static Scanner teclado = new Scanner(System.in);
  public static Usuario login()  {
        Scanner tc = new Scanner(System.in);
        System.out.println("Dime user");
        String user = tc.nextLine();
        tc.nextLine();
        System.out.println("Cual es su contraseña");
        String contra = tc.nextLine();
        tc.nextLine();
        Usuario comparar = new Usuario( user,contra);
        if(comparar.equals)
        
    
    }
    public static Comando menu() {
        System.out.println("Bienvenido a la centralita");

        System.out.println("----------------------------");
        System.out.println("-------¿Que quieres hacer?-------");
        System.out.println("1.- Apagar sistema");
        System.out.println("2.- Consultar hora");
        System.out.println("3.- Modifica la hora de la centralita");
        System.out.println("4.- Subir puerta del garaje");
        System.out.println("5.- Bajar puerta del garaje");
        System.out.println("6.- Subir persianas salon");
        System.out.println("7.- Bajar persianas salon");
        System.out.println("8.- Subir persianas dormitorio");
        System.out.println("9.- Bajar persianas dormitorio");
        System.out.println("10.- Encender camara");
        System.out.println("11.- Apagar camara");
        System.out.println("12.- Encender luces salon");
        System.out.println("13.- Apagar luces salon");
        System.out.println("14.- Encender luces dormitorio");
        System.out.println("15.- Apagar luces dormitorio");
        System.out.println("16.- Consultar estado luces del dormitorio");
        System.out.println("17.- Consultar estado luces del salon");
        System.out.println("18.- Consultar estado general vivienda");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                return Comando.APAGAR_SISTEMA;           
            case 2:
                return Comando.CONSULTAR_HORA;
            case 3:
                return Comando.MODIFICAR_HORA;
            case 4:
                return Comando.SUBIR_PUERTA_GARAJE;
            case 5:
                return Comando.BAJAR_PUERTA_GARAJE;
            case 6:
                return Comando.SUBIR_PERSIANAS_SALON;           
            case 7:
                return Comando.BAJAR_PERSIANAS_SALON;
            case 8:
                return Comando.SUBIR_PERSIANAS_DORMITORIO;
            case 9:
                return Comando.BAJAR_PERSIANAS_DORMITORIO;
            case 10:
                return Comando.ENCENDER_CAMARA;
            case 11:
                return Comando.APAGAR_CAMARA;           
            case 12:
                return Comando.ENCENDER_LUCES_SALON;
            case 13:
                return Comando.APAGAR_LUCES_SALON;
            case 14:
                return Comando.ENCENDER_LUCES_DORMITORIO;
            case 15:
                return Comando.APAGAR_LUCES_DORMITORIO;
            case 16:
                return Comando.CONSULTAR_ESTADO_LUCES_DORMITORIO;
            case 17:
                return Comando.CONSULTAR_ESTADO_LUCES_SALON;
            case 18:
                return Comando.CONSULTAR_ESTADO_GENERAL_VIVIENDA;    
            default:
                throw new AssertionError();

        }
        

    }

}
