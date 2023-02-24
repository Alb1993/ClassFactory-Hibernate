/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitats;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author FPShare
 */
public abstract class Soldat implements Serializable{
    
    private int idSoldado;
    private  int edad;
    private String nombreClave;
    private float versionTransmisor;
    private Date fechaAlistamiento;
    private boolean operativo;

}
