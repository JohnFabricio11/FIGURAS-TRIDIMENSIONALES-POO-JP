/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author ISTLOJA V
 */
public class Tetraedro extends Fijuratridimencional{
    public double calculoAREA(double ladotetra){
    return Math.pow (Math.sqrt(2)*ladotetra,2);
    }
    public double calculoVOLUMEN(double aristas){
        return Math.pow (Math.sqrt(2)/12*aristas,3);
    }
}
