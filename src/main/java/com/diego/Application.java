package com.diego;

import java.util.Scanner;
import java.util.logging.Logger;

public class Application {
    static final Logger logger = Logger.getLogger(Application.class.getName());
    private String reverseString(String input){

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

    void mainMenu(){}
}
