/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.github.javafaker.Faker;
import entitats.Aeronau;
import entitats.Combat;
import entitats.Dron;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Pilotada;
import entitats.Soldat;
import entitats.Transport;
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
    private Faker faker = new Faker();
    private Random rand = new Random();
    
    public ClassFactory(){};
    
    @Override
    public Aeronau addMecanicsToPilotada(List<Soldat> lo, Pilotada p) throws Exception {
        ArrayList<Mecanic> mecanics = new ArrayList<>();
        for(Soldat soldat: lo){
            mecanics.add((Mecanic)soldat);
        }
        p.setMecanics(mecanics);
        return (Aeronau) p;
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
            float versionArmamento = faker.number().randomNumber();
            //Pilot pilotAeronau = (Pilot)soldatFactory(Pilot.class);
            Pilot pilotAeronau = null;
            int edad_piloto = faker.number().numberBetween(16,65);
            ArrayList<Mecanic> mecanics = null;
            String nombreNave = faker.bothify("####") + "-" + faker.letterify("#####") + "-" + faker.numerify("#####");
            String nombre = faker.bothify("####");
            float kmRecorridos  = faker.number().randomNumber();
            Date fechaConstruccion  = utils.convertirSqlDate(faker.date().birthday());
            Date fecha = utils.convertirSqlDate(faker.date().birthday());
            boolean operativa = rand.nextBoolean();
            boolean bool = rand.nextBoolean();
            int estado = faker.number().numberBetween(1, 5);
            ArrayList<Missio> missions =null;
        
            if(tipus == Combat.class){
            Combat combat = new Combat(versionArmamento, pilotAeronau, edad_piloto, mecanics, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
            return combat;
            }
            else if(tipus == Transport.class){
            Transport transport = new Transport(versionArmamento, pilotAeronau, edad_piloto, mecanics, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
            return transport;
            }else if(tipus == Dron.class){
            Dron dron = new Dron(fechaConstruccion,operativa,nombreNave,nombre,versionArmamento,fecha,bool, estado, missions);
            return dron;
            }
        return null;
    }

    @Override
    public List<Soldat> mecanicsFactory(int elements) {
        /***
         * Instanciamos 3 objetos: Faker, Random, SingleSession y la Lista de Soldados a rellenar.
         */
        List<Soldat> mecanics = null;
        
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
            int edad = faker.number().numberBetween(16,65);
            String nombre = faker.name().firstName();
            float versionTransmisor = faker.number().randomNumber();
            Date fechaAlistamiento = utils.convertirSqlDate(faker.date().birthday());
            boolean operativo = rand.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas,navesReparadas,edad,nombre,versionTransmisor,fechaAlistamiento,operativo);
            mecanics.add((Soldat) mecanic);        
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
        
        String tituloMision = faker.job().title(); 
        String descripcion = faker.gameOfThrones().quote();
        float recompensa=faker.number().randomNumber();
        Date fechaPublicacion = utils.convertirSqlDate(faker.date().birthday());
        boolean completada = rand.nextBoolean(); 
        List<Aeronau> aeronaus = null;
        Missio missio = new Missio(tituloMision,descripcion,recompensa,fechaPublicacion,completada,aeronaus);
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
            int edad = faker.number().numberBetween(16,65);
            String nombre = faker.name().firstName();
            float versionTransmisor = faker.number().randomNumber();
            Date fechaAlistamiento = utils.convertirSqlDate(faker.date().birthday());
            boolean operativo = rand.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas,navesReparadas,edad,nombre,versionTransmisor,fechaAlistamiento,operativo);
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
                        int edad = faker.number().numberBetween(16,65);
                        String nombreClave = faker.bothify("####") + "-" + faker.letterify("#####") + "-" + faker.numerify("#####");
                        float versionTransmisor = faker.number().randomNumber();
                        Date fechaAlistamiento = utils.convertirSqlDate(faker.date().birthday());
                        boolean operativo = rand.nextBoolean();
                        Pilot pilot = new Pilot(clavePiloto, distanciaPilotadaKM, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
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
