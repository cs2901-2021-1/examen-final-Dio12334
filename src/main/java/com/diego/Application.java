package com.diego;

import java.util.Scanner;
import java.util.logging.Logger;

public class Application {
    static final Logger logger = Logger.getLogger(Application.class.getName());
    public String reverseString(String input){

        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }
    void startMenu(){
        Scanner cin = new Scanner(System.in);
        logger.info("Ingrese nombre de usuario: ");
        String nombreUsuario = cin.nextLine();
        logger.info("Ingrese contraseña: ");
        String contrasena = cin.nextLine();

        if(!nombreUsuario.equals(reverseString(contrasena)))
            startMenu();
        else
            mainMenu();
    }

    void mainMenu(){
        Scanner cin = new Scanner(System.in);
        logger.info("""
                ===================Main Menu ==================== \n
                1) Obtener información consolidada \n
                2) Dar de Alta a centro de vacunación \n
                3) Dar de Baja a centro de vacunación \n
                4) Cerrar sesión \n
                \n
                Ingresar opción:""");
        int option = cin.nextInt();
        switch(option){
            case 1:
                mainMenu();
                break;
            case 2:
                mainMenu();
                break;
            case 3:
                mainMenu();
                break;
            case 4:
                startMenu();
                break;
            default:
                logger.info("Elija una de las opciones listadas... ");
                mainMenu();
                break;
        }
    }
}
