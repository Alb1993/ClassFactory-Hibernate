/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitats;

import java.util.Date;

/**
 *
 * @author FPShare
 */
public abstract class Autonoma extends Aeronau {

    public Autonoma(int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado) {
        super(idNave, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado);
    }

}
