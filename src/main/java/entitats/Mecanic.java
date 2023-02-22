package entitats;

import java.sql.Date;

/**
 *
 * @author FPShare
 */
public class Mecanic extends Soldat implements interficies.TesteableEntity {

    private String claveMecanico;
    private float versionHerramientas;
    private int navesReparadas;

    public Mecanic(String claveMecanico, float versionHerramientas, int navesReparadas, int idSoldado, int edad, String nombreClave, float versionTransmisor, java.util.Date fechaAlistamiento, boolean operativo) {
        super(idSoldado, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
        this.claveMecanico = claveMecanico;
        this.versionHerramientas = versionHerramientas;
        this.navesReparadas = navesReparadas;
    }

    public String getClaveMecanico() {
        return claveMecanico;
    }

    public void setClaveMecanico(String claveMecanico) {
        this.claveMecanico = claveMecanico;
    }

    public float getVersionHerramientas() {
        return versionHerramientas;
    }

    public void setVersionHerramientas(float versionHerramientas) {
        this.versionHerramientas = versionHerramientas;
    }

    public int getNavesReparadas() {
        return navesReparadas;
    }

    public void setNavesReparadas(int navesReparadas) {
        this.navesReparadas = navesReparadas;
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
