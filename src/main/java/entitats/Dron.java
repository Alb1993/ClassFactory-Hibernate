/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitats;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Dron que extiende de la Clase Autonoma y implementa la interfaz de
 * TesteableEntity
 */
public class Dron extends Autonoma implements interficies.TesteableEntity, Serializable {

    private Date fechaProximoMantimiento;
    private boolean tieneArmas;
    private String tipoDeDron;

    public Dron(Date fechaProximoMantimiento, boolean tieneArmas, String tipoDeDron, int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        super(idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
        this.fechaProximoMantimiento = fechaProximoMantimiento;
        this.tieneArmas = tieneArmas;
        this.tipoDeDron = tipoDeDron;
    }

    public Date getFechaProximoMantimiento() {
        return fechaProximoMantimiento;
    }

    public void setFechaProximoMantimiento(Date fechaProximoMantimiento) {
        this.fechaProximoMantimiento = fechaProximoMantimiento;
    }

    public boolean isTieneArmas() {
        return tieneArmas;
    }

    public void setTieneArmas(boolean tieneArmas) {
        this.tieneArmas = tieneArmas;
    }

    public String getTipoDeDron() {
        return tipoDeDron;
    }

    public void setTipoDeDron(String tipoDeDron) {
        this.tipoDeDron = tipoDeDron;
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
    public java.sql.Date getAtributDate() {
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
    public void setAtributDate(java.sql.Date d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
