package boletin11;
//Yasmin

import java.util.Scanner;

public class Escritura {

    String frase;
    long Tinicio,Tfin,tiempo;
    

    public void escribe() {
        System.out.println("ESCRIBE A SEGUINTE FRASE:\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
        Scanner escribe = new Scanner(System.in);
        System.out.println();
        Tinicio=System.currentTimeMillis();
        frase = escribe.next();
        System.out.println("PREME ENTER PARA REMATAR");
        Tfin=System.currentTimeMillis();
        System.out.println("TARDACHES "+((Tfin-Tinicio)/1000)+" SEGUNDOS EN ESCRIBIR A FRASE");
    }
}
