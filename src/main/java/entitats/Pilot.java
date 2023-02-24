package entitats;

import jakarta.persistence.OneToOne;
import java.sql.Date;

/**
 *
 * @author FPShare
 */
public class Pilot extends Soldat implements interficies.TesteableEntity {

    private String clavePiloto;
    private float distanciaPilotadaKM;

    @OneToOne
    private Pilotada pilotada;    
    
    public Pilot(String clavePiloto, float distanciaPilotadaKM, int idSoldado, int edad, String nombreClave, float versionTransmisor, java.util.Date fechaAlistamiento, boolean operativo) {
        super(idSoldado, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
        this.clavePiloto = clavePiloto;
        this.distanciaPilotadaKM = distanciaPilotadaKM;
    }

    public String getClavePiloto() {
        return clavePiloto;
    }

    public void setClavePiloto(String clavePiloto) {
        this.clavePiloto = clavePiloto;
    }

    public float getDistanciaPilotadaKM() {
        return distanciaPilotadaKM;
    }

    public void setDistanciaPilotadaKM(float distanciaPilotadaKM) {
        this.distanciaPilotadaKM = distanciaPilotadaKM;
    }

    @Override
    public Integer getAtributIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAtributString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Float getAtributFloat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Date getAtributDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean getAtributBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAtributString(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAtributFloat(Float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAtributDate(Date d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
