/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GIOVANNI
 */
public class Ftrigonometricas {

    public static void main(String[] args) {
        double resultado = 0;
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        resultado = Math.sin(anguloRadianes);
        System.out.println("Sen de" + anguloGrados + " = " + resultado);
        double ValorIngresado = 0.707;
        anguloRadianes = Math.asin(ValorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("arco cuyo sen " + ValorIngresado + " = " + anguloGrados);
    }

}
