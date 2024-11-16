package proyecto_pdoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dani
 */
public class Proyecto_PDOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Monedas monedas = new Monedas(20, 10, 999999, "Null");
        Experiencia experiencia = new Experiencia();
        List<Mejoras> upgrades = new ArrayList<>();
        ObjetoClicker objeto = new ObjetoClicker("Null", experiencia, monedas, upgrades);
        Mejoras_monedas upgrade_1 = new Mejoras_monedas("Mejora 1", "Añade dineros", "", 10, objeto, 1500);
        Mejoras_experiencia upgrade_2 = new Mejoras_experiencia("Mejora 2", "Añade experiencia", "", 10, objeto, 200);
        Mejoras_tiempo upgrade_3 = new Mejoras_tiempo(1, "Mejora 3", "Hace clics en 1 seg", "", 0, objeto);

        upgrades.add(upgrade_1);
        upgrades.add(upgrade_2);
        upgrades.add(upgrade_3);


        System.out.println(objeto);
        Mejoras_monedas mo = (Mejoras_monedas) upgrades.get(0);

        System.out.println("AAAAAA" + " " + upgrades.get(0).toString());

        mo.addCoins();

        Mejoras_experiencia ex = (Mejoras_experiencia) upgrades.get(1);
        ex.addExpPerClic();
        
        Mejoras_tiempo tm = (Mejoras_tiempo) upgrades.get(2);
        tm.autoClicks();
        

        System.out.println(objeto);




    }
    
}
