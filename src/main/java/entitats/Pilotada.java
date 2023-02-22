package entitats;

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

    private String piloto;
    private int edad_piloto;

    public Pilotada(String piloto, int edad_piloto, int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado) {
        super(idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado);
        this.piloto = piloto;
        this.edad_piloto = edad_piloto;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getEdad_piloto() {
        return edad_piloto;
    }

    public void setEdad_piloto(int edad_piloto) {
        this.edad_piloto = edad_piloto;
    }

}
