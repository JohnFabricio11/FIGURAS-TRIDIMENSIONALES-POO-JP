/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA V
 */
public class Fijuratridimencional extends Figura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para  encontrar el radio de la esfera 2 para cubo y 3 para tetraedro"
                + "cubo y 3 para tetaedro");
        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("ingrese el radio de la esfera ");
                double radios = entrada.nextDouble();
                Esfera objeto1 = new Esfera();
                double calculateRadio = objeto1.calculateRadio(radios);
                double calculateVolumen = objeto1.calculateVolumen(radios);
                System.out.println("radio" + calculateRadio + " volumen" + calculateVolumen);
                break;// este va despues de cada case
            case 2:
                System.out.println("ingrese la longitud del cubo");
                double cubo = entrada.nextDouble();
                System.out.println("ingrese el volumen ");
                double volumen = entrada.nextDouble();
                Cubo objeto2 = new Cubo();
                double calcularlongitubcubo = objeto2.calcularlongitubcubo(cubo);
                double calcularvolumen = objeto2.calcularvolumen(volumen);
                System.out.println("longitud" + calcularlongitubcubo + "volumen" + calcularvolumen);
                break;
            case 3:
                System.out.println("escriba el valor para el area");
                double ladotetra = entrada.nextDouble();
                System.out.println("ingresa la arista");
                double aristas = entrada.nextDouble();
                Tetraedro objeto3 = new Tetraedro();
                double calculoAREA = objeto3.calculoAREA(ladotetra);
                double calculoVOLUMEN = objeto3.calculoVOLUMEN(aristas);
                System.out.println("este es area del tetraedro" + calculoAREA + "este es EL VOLUMEN DEL TETRAEDRO" + calculoVOLUMEN);
                break;
            default:
                System.out.println("ingrese un numero correcto");
                break;

        }

    }
}
