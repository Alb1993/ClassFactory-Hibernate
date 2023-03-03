/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author FPShare
 */
@Entity
public abstract class Soldat implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSoldado", nullable = false, unique = true)
    protected int idSoldado;
    protected int edad;
    protected String nombreClave;
    protected float versionTransmisor;
    protected Date fechaAlistamiento;
    protected boolean operativo;

    public Soldat(int idSoldado, int edad, String nombreClave, float versionTransmisor, Date fechaAlistamiento, boolean operativo) {
        this.idSoldado = idSoldado;
        this.edad = edad;
        this.nombreClave = nombreClave;
        this.versionTransmisor = versionTransmisor;
        this.fechaAlistamiento = fechaAlistamiento;
        this.operativo = operativo;
    }

    public int getIdSoldado() {
        return idSoldado;
    }

    public void setIdSoldado(int idSoldado) {
        this.idSoldado = idSoldado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public float getVersionTransmisor() {
        return versionTransmisor;
    }

    public void setVersionTransmisor(float versionTransmisor) {
        this.versionTransmisor = versionTransmisor;
    }

    public Date getFechaAlistamiento() {
        return fechaAlistamiento;
    }

    public void setFechaAlistamiento(Date fechaAlistamiento) {
        this.fechaAlistamiento = fechaAlistamiento;
    }

    public boolean isOperativo() {
        return operativo;
    }

    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }

}
