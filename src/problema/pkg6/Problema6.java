/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg6;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h,p,x,n;
        h=getHoras();
        p=getPaga();
        x=horaExt(h);
        n=horasNetas(h,x);
        sueldo(p,n,x);
    }
    public static int getHoras(){
        int horas;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce cantidad de horas trabajadas");
        horas=teclado.nextInt();
        return horas;
    }
    public static int getPaga(){
        int paga;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce paga por hora del empleado");
        paga=teclado.nextInt();
        return paga;
    }
   
    
    public static int horaExt(int horas){   
        int horasExtra=0;
            if (horas>40){
            horasExtra=horas-40;
        }
        if (horasExtra<=8){
                    horasExtra=horasExtra*2;
            }else if(horasExtra>8){
                            horasExtra=horasExtra*3;
                            System.out.println(horasExtra);
            }    
    return horasExtra;
    }
    public static int horasNetas(int horas, int horasExtra){
        int horasNetas=horas-horasExtra;
        return horasNetas;
    }
     public static void sueldo(int paga, int horasNetas,int horasExtra){
        double sueldo=((paga*horasNetas)+(paga*horasExtra));
        System.out.println("El sueldo del empleado es: $"+sueldo);
     }
}
