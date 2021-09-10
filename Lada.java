/*
 
 */
package kincseslada;

import java.util.Scanner;

/**
 *
 * @author hallgato
 */
public class Lada {

    String aranyLadaS = "Én rejtem a kincset.";
    String ezustLadaS = "Nem én rejtem a kincset.";
    String bronzLadaS = "Az arany láda hazudik !";
    
    int valasz;
    
    int arany;
    int ezust;
    int bronz;
    
    public void start(){
    uiFelulet();
    bekeres();
    ellenorzes();
    }
    
    public void setArany(int arany) {
        this.arany = 0;
    }

    public void setEzust(int ezust) {
        this.ezust = 1;
    }

    public void setBronz(int bronz) {
        this.bronz = 0;
    }
    
    //-------------Metod's---------------
    
    private int bekeres(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nSzerinted melyik ládában van a kincs? 1-2-3 :");
        valasz = myObj.nextInt();
        return valasz;
    }
    
    public void uiFelulet(){
        System.out.println("         arany                  ezüst                       bronz         ");
        System.out.println("          ____                  ____                        ____         ");
        System.out.println("         | 1 |                  | 2 |                       | 3 |        ");
        System.out.println("Én rejtem a kincset.   Nem én rejtem a kincset.   Az arany láda hazudik !");
    }
    
    public void ellenorzes(){
        if(valasz == 2){
            System.out.println("A válasz helyes!");
        }
        else{
            System.out.println("Hát ez nem nyert.");
        }
        
        
    }
}
