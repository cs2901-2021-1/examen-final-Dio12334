package com.diego;

import java.util.Vector;

import static com.diego.Application.logger;

public class GestorDeCentros {
    private Vector<Centro> centros;
    int poblacionInicial;
    int poblacionVacunada;
    int poblacionVacunadaC;
    public GestorDeCentros(){
        poblacionInicial = 22935433;
        poblacionVacunada = 0;
        this.centros = new Vector<Centro>();
    }
    void addCentro(){
        if(centros.size()+1 <= 50)
            centros.addElement(new Centro());
        else
            logger.info("Se alcanzó el limite de centros..");
    }
    void removeCentro(){
        if(centros.size() > 0)
            centros.remove(0);
    }
    public void informacionConsolidada(){
        logger.info("Avance de Vacunación: \n");
        logger.info(()-> String.valueOf(poblacionVacunada/poblacionInicial*100));
        logger.info("\n");
        logger.info("Cobertura de vacunación: \n");
        logger.info("Numero de centros de vacunación: \n");
        logger.info(String.valueOf(centros.size()));
        logger.info("Numero de personas vacunadas parcialmente: \n");
        logger.info("Numero de personas vacunadas completamente: \n");
    }


}
