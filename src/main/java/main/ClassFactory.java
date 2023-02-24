/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.github.javafaker.Faker;
import entitats.Aeronau;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Pilotada;
import entitats.Soldat;
import interficies.TesteableFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FPShare
 */
public class ClassFactory implements TesteableFactory {

    @Override
    public Aeronau addMecanicsToPilotada(List<Soldat> lo, Pilotada p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Aeronau addMissionsToAeronau(List<Missio> lm, Aeronau a) throws Exception {
        //Añadimos una lista de Misiones a una aeronave.
        a.setMissions(lm);
        //Devolvemos la aeronave.
        return a;
    }

    @Override
    public Missio addAeronausToMissio(List<Aeronau> la, Missio m) throws Exception {
        //Añadimos las Aeronaves a una Mision.
        m.setAeronaus(la);
        //Devolvemos la mision.
        return m;    
    }

    @Override
    public Aeronau addPilotToAeronauPilotada(Pilot p, Pilotada a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Aeronau aeronauFactory(Class<?> tipus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Soldat> mecanicsFactory(int elements) {
        /***
         * Instanciamos 3 objetos: Faker, Random, SingleSession y la Lista de Soldados a rellenar.
         */
        Faker faker = new Faker();
        Random rand = new Random();
        List<Soldat> mecanics = new ArrayList<Soldat>();
        SingleSession session = new SingleSession();
        
        /***
         * Iniciamos una transaccion con SingleSession.
         */
        session.getSessio().beginTransaction();
            
        /***
         * Generamos atributos random, los añadimos a un objeto mecanico y despues añadimos el mecanico a nuestro Array de Soldados.
         */
        for(int i=0; i<elements; i++){

            String claveMecanico = faker.bothify("########");
            float versionHerramientas = faker.number().randomNumber();
            int navesReparadas = faker.number().numberBetween(0,999);
            int id = (int)faker.number().randomNumber(8,true);
            int edad = faker.number().numberBetween(16,65);
            String nombre = faker.name().firstName();
            float versionTransmisor = faker.number().randomNumber();
            Date fechaAlistamiento = faker.date().birthday();
            boolean operativo = rand.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas,navesReparadas,id,edad,nombre,versionTransmisor,fechaAlistamiento,operativo);
            mecanics.add(mecanic);
            session.getSessio().persist(mecanic);          
        }
        session.getSessio().getTransaction().commit();
        return mecanics;
    }

    @Override
    public Missio missioFactory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Missio> missionsFactory(int elements) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Soldat> pilotsFactory(int elements) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Soldat soldatFactory(Class<?> tipus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
