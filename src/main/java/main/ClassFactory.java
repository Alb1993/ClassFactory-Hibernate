/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.github.javafaker.Faker;
import entitats.Aeronau;
import entitats.Combat;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Pilotada;
import entitats.Soldat;
import interficies.TesteableFactory;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FPShare
 */
public class ClassFactory implements TesteableFactory {
    /***
    * Instanciamos 3 objetos: Faker, Random, SingleSession y la Lista de Soldados a rellenar.
    */
    private static Faker faker = new Faker();
    private static Random rand = new Random();
    
    
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
        a.setPilotAeronau(p);
        return a;
    }

    @Override
    public Aeronau aeronauFactory(Class<?> tipus) {
            if(tipus == Combat.class){
      
            /***
             * Iniciamos una transaccion con SingleSession.
             */
            float versionArmamento = faker.number().randomNumber();
            //Pilot pilotAeronau = (Pilot)soldatFactory(Pilot.class);
            Pilot pilotAeronau = null;
            int edad_piloto = faker.number().numberBetween(16,65);
            ArrayList<Mecanic> mecanics = new ArrayList<>(); 
            int idNave = faker.number().numberBetween(0, 999);
            String nombreNave = faker.bothify("####") + "-" + faker.letterify("#####") + "-" + faker.numerify("#####");
            float kmRecorridos  = faker.number().randomNumber();
            Date fechaConstruccion  = utils.convertirSqlDate(faker.date().birthday());
            boolean operativa = rand.nextBoolean();
            int estado = faker.number().numberBetween(1, 5);
            ArrayList<Missio> missions =new ArrayList<>();
            Combat combat = new Combat(versionArmamento, pilotAeronau, edad_piloto, mecanics, idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
            /***
             * Persistimos el objeto Mecanic i devolvemos el objeto.
             */
            return combat;
            }
        return null;
    }

    @Override
    public List<Soldat> mecanicsFactory(int elements) {
        /***
         * Instanciamos 3 objetos: Faker, Random, SingleSession y la Lista de Soldados a rellenar.
         */
        Faker faker = new Faker();
        Random rand = new Random();
        List<Soldat> mecanics = new ArrayList<Soldat>();
        
        /***
         * Iniciamos una transaccion con SingleSession.
         */
            
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
            Date fechaAlistamiento = (Date)faker.date().birthday();
            boolean operativo = rand.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas,navesReparadas,id,edad,nombre,versionTransmisor,fechaAlistamiento,operativo);
            mecanics.add(mecanic);        
        }
        return mecanics;
    }

    @Override
    public Missio missioFactory() {
        /***
         * Instanciamos 3 objetos: Faker, Random, SingleSession y la Lista de Soldados a rellenar.
         */
        Faker faker = new Faker();
        Random rand = new Random();
        
        /***
         * Iniciamos una transaccion con SingleSession.
         */
            
        int idMision = 1;
        String tituloMision = faker.job().title(); 
        String descripcion = faker.gameOfThrones().quote();
        float recompensa=faker.number().randomNumber();
        Date fechaPublicacion = utils.convertirSqlDate(faker.date().birthday());
        boolean completada = rand.nextBoolean(); 
        List<Aeronau> aeronaus = new ArrayList<Aeronau>();
        Missio missio = new Missio(idMision,tituloMision,descripcion,recompensa,fechaPublicacion,completada,aeronaus);
        return missio;
    }

    @Override
    public List<Missio> missionsFactory(int elements) {
        List<Missio> missions = new ArrayList<Missio>();
        for(int i=0; i<elements; i++){
            Missio missio = (Missio) missioFactory(); 
            missions.add(missio);
        } 
        return missions;
    }

    @Override
    public List<Soldat> pilotsFactory(int elements) {
        List<Soldat> pilots = new ArrayList<Soldat>();
        for(int i=0; i<elements; i++){
           Pilot pilot = (Pilot) soldatFactory(Pilot.class);
           pilots.add(pilot);
        }
        return pilots;
    }

    @Override
    public Soldat soldatFactory(Class<?> tipus) {
    
        if(tipus == Mecanic.class){
            /***
             * Iniciamos una transaccion con SingleSession.
             */

            /***
             * Generamos atributos random, los añadimos a un objeto mecanico y despues añadimos el mecanico a nuestro Array de Soldados.
             */
            String claveMecanico = faker.bothify("########");
            float versionHerramientas = faker.number().randomNumber();
            int navesReparadas = faker.number().numberBetween(0,999);
            int id = faker.number().numberBetween(0, 999);
            int edad = faker.number().numberBetween(16,65);
            String nombre = faker.name().firstName();
            float versionTransmisor = faker.number().randomNumber();
            Date fechaAlistamiento = utils.convertirSqlDate(faker.date().birthday());
            boolean operativo = rand.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas,navesReparadas,id,edad,nombre,versionTransmisor,fechaAlistamiento,operativo);
            /***
             * Persistimos el objeto Mecanic i devolvemos el objeto.
             */
            return mecanic;
        } 
            else if(tipus == Pilot.class){
                        /***
                         * Iniciamos una transaccion con SingleSession.
                         */

                        /***
                         * Generamos atributos random, los añadimos a un objeto mecanico y despues añadimos el mecanico a nuestro Array de Soldados.
                         */
                        String clavePiloto  = faker.bothify("########");
                        float distanciaPilotadaKM = faker.number().randomNumber();
                        int idSoldado = faker.number().numberBetween(0, 999);
                        int edad = faker.number().numberBetween(16,65);
                        String nombreClave = faker.bothify("####") + "-" + faker.letterify("#####") + "-" + faker.numerify("#####");
                        float versionTransmisor = faker.number().randomNumber();
                        Date fechaAlistamiento = utils.convertirSqlDate(faker.date().birthday());
                        boolean operativo = rand.nextBoolean();
                        Pilot pilot = new Pilot(clavePiloto, distanciaPilotadaKM, idSoldado, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
                        /***
                         * Persistimos el objeto Pilot i devolvemos el objeto.
                         */
                        return pilot;
            }else if(tipus == Combat.class){
                    Combat combat = (Combat)aeronauFactory(Combat.class);
                    Soldat soldat = combat.getPilotAeronau();
                    return soldat;
            }
                
        
        return null;
    }
}
