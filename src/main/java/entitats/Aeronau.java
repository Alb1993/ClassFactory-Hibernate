package entitats;

import java.util.Date;

/**
 *
 * @author FPShare
 * @version 1.0
 * 
 * Clase Aeronave para la creación de Aeronaves y después utilizarla en clases
 * inferiores.
 */
public abstract class Aeronau {

    private int idNave;
    private String nombreNave;
    private float kmRecorridos;
    private Date fechaConstruccion;
    private boolean operativa;
    private int estado;

    public Aeronau(int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado) {
        this.idNave = idNave;
        this.nombreNave = nombreNave;
        this.kmRecorridos = kmRecorridos;
        this.fechaConstruccion = fechaConstruccion;
        this.operativa = operativa;
        this.estado = estado;
    }

    public int getIdNave() {
        return idNave;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public float getKmRecorridos() {
        return kmRecorridos;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public boolean isOperativa() {
        return operativa;
    }

    public int getEstado() {
        return estado;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public void setKmRecorridos(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public void setOperativa(boolean operativa) {
        this.operativa = operativa;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
