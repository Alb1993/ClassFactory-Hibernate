package entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author FPShare
 */
@Entity
public abstract class Autonoma extends Aeronau implements Serializable{


    public Autonoma(int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        super(idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
    }

}
