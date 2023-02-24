package entitats;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Aeronave para la creación de Aeronaves y después utilizarla en clases
 * inferiores.
 */
public abstract class Aeronau implements Serializable{

    private int idNave;
    private String nombreNave;
    private float kmRecorridos;
    private Date fechaConstruccion;
    private boolean operativa;
    private int estado;
    private List<Missio> missions;

    public Aeronau(int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        this.idNave = idNave;
        this.nombreNave = nombreNave;
        this.kmRecorridos = kmRecorridos;
        this.fechaConstruccion = fechaConstruccion;
        this.operativa = operativa;
        this.estado = estado;
        this.missions = missions;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public float getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public boolean isOperativa() {
        return operativa;
    }

    public void setOperativa(boolean operativa) {
        this.operativa = operativa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Missio> getMissions() {
        return missions;
    }

    public void setMissions(List<Missio> missions) {
        this.missions = missions;
    }

}
