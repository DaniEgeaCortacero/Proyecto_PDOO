package proyecto_pdoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dani
 */
public class ObjetoClicker {
    private Experiencia exp;
    private Monedas monedas;
    private List<Mejoras> mejoras;
    private String pathImage;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto.
     */
    public ObjetoClicker(){
        this("Null", new Experiencia(), new Monedas(), null);
    }
    
    /**
     * Constructor por parámetros.
     * @param pathImage String
     * @param exp Experiencia
     * @param monedas Monedas
     * @param mejoras List<Mejoras>
     */
    public ObjetoClicker(String pathImage, Experiencia exp, Monedas monedas, List<Mejoras> mejoras) {
        this.pathImage = pathImage;
        this.exp = exp;
        this.monedas = monedas;
        this.mejoras = mejoras;
    }

    /**
     * Constructor de copia
     * @param otro ObjetoClicker
     */
    public ObjetoClicker(ObjetoClicker otro){
        this(otro.getPathImage(), otro.exp, otro.monedas, otro.mejoras);
    }

    //----------------------------------- OBJETOS ---------------------------------------------//

    //------ exp

    /**
     * Getter exp
     * @return Experiencia
     */
    public Experiencia getExp() {
        return exp;
    }

    /**
     * Setter exp
     * @param exp Experiencia
     */
    public void setExp(Experiencia exp) {
        this.exp = exp;
    }

    //------ monedas

    /**
     * Getter monedas
     * @return Monedas
     */
    public Monedas getMonedas() {
        return monedas;
    }

    /**
     * Setter monedas
     * @param monedas Monedas
     */
    public void setMonedas(Monedas monedas) {
        this.monedas = monedas;
    }

    //------ mejoras

    /**
     * Getter mejoras
     * @return List<Mejoras>
     */
    public List<Mejoras> getMejoras() {
        return mejoras;
    }

    /**
     * Setter mejoras
     * @param mejoras List<Mejoras>
     */
    public void setMejoras(List<Mejoras> mejoras) {
        this.mejoras = mejoras;
    }

    //----------------------------------- IMAGEN ---------------------------------------------//

    /**
     * Getter pathImage
     * @return String
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Setter pathImage
     * @param pathImage String 
     */
    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    /**
     * Método toString()
     * @return String
     */
    @Override
    public String toString() {
        return "pathImage= " + pathImage +
                ", Experiencia { " + exp.toString() + "}" +
                ", Monedas { " + monedas.toString() + "}" +
                ", Mejoras { " + mejoras.toString() + "}";
    }
    
}
