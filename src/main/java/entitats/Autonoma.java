package entitats;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author FPShare
 */
public abstract class Autonoma extends Aeronau implements Serializable{


    public Autonoma(int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        super(idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
    }

}
