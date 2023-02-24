package entitats;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Pilotada para crear aeronaves pilotadas por humanos, extiende de
 * Aeronave.
 */
public abstract class Pilotada extends Aeronau {

    private Pilot pilotAeronau;
    private int edad_piloto;
    private ArrayList<Mecanic> mecanics;

    public Pilotada(Pilot pilotAeronau, int edad_piloto, ArrayList<Mecanic> mecanics, int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, ArrayList<Missio> missions) {
        super(idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
        this.pilotAeronau = pilotAeronau;
        this.edad_piloto = edad_piloto;
        this.mecanics = mecanics;
    }

    public Pilot getPilotAeronau() {
        return pilotAeronau;
    }

    public void setPilotAeronau(Pilot pilotAeronau) {
        this.pilotAeronau = pilotAeronau;
    }

    public int getEdad_piloto() {
        return edad_piloto;
    }

    public void setEdad_piloto(int edad_piloto) {
        this.edad_piloto = edad_piloto;
    }

    public ArrayList<Mecanic> getMecanics() {
        return mecanics;
    }

    public void setMecanics(ArrayList<Mecanic> mecanics) {
        this.mecanics = mecanics;
    }

}
