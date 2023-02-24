/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitats;

import jakarta.persistence.OneToOne;

/**
 *
 * @author FPShare
 */
public abstract class Pilotada extends Aeronau {

    private String piloto;
    private int edad_piloto;
    
    @OneToOne
    private Pilot pilot;

}
