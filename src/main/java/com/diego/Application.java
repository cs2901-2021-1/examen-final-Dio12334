package com.diego;

import java.util.Scanner;
import java.util.logging.Logger;

public class Application {
    static final Logger logger = Logger.getLogger(Application.class.getName());
    static final Scanner cin = new Scanner(System.in);
    GestorDeCentros centros = new GestorDeCentros();
    public String reverseString(String input){

        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }
    public String startMenu(String[] args){
        logger.info("Ingrese nombre de usuario: ");
        String nombreUsuario = cin.nextLine();
        logger.info("Ingrese contraseña: ");
        String contrasena = cin.nextLine();

        if(!nombreUsuario.equals(reverseString(contrasena)))
            startMenu(args);
        else
        return  mainMenu();

        return "correct";
    }

    public String mainMenu(){
        logger.info("""
                ===================Main Menu ==================== 
                1) Obtener información consolidada 
                2) Dar de Alta a centro de vacunación 
                3) Dar de Baja a centro de vacunación 
                4) Cerrar sesión 
                
                Ingresar opción:""");

        int option = Integer.parseInt(cin.nextLine());


        switch(option){
            case 1:
                centros.informacionConsolidada();
                mainMenu();
                break;
            case 2:
                centros.addCentro();
                mainMenu();
                break;
            case 3:
                centros.removeCentro();
                mainMenu();
                break;
            case 4:
                return "correct";
            default:
                logger.info("Elija una de las opciones listadas... ");
                mainMenu();
                break;
        }
        return "fail";
    }
}
