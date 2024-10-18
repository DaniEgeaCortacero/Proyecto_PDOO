package proyecto_pdoo;

/**
 *
 * @author forza
 */
public class ObjetoClicker {
    private Experiencia exp;
    private Monedas monedas;
    private String pathImage;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto.
     */
    public ObjetoClicker(){
        this("Null", new Experiencia(), new Monedas());
    }
    
    /**
     * Constructor por parámetros.
     * @param pathImage String
     * @param exp Experiencia
     * @param monedas Monedas
     */
    public ObjetoClicker(String pathImage, Experiencia exp, Monedas monedas) {
        this.setPathImage(pathImage);
        this.exp = exp;
        this.monedas = monedas;
    }
    
    /**
     * Constructor de copia
     * @param otro ObjetoClicker
     */
    public ObjetoClicker(ObjetoClicker otro){
        this(otro.getPathImage(), otro.exp, otro.monedas);
    }

    //----------------------------------- OBJETOS ---------------------------------------------//

    //------ exp

    public Experiencia getExp() {
        return exp;
    }

    public void setExp(Experiencia exp) {
        this.exp = exp;
    }

    //------ monedas

    public Monedas getMonedas() {
        return monedas;
    }

    public void setMonedas(Monedas monedas) {
        this.monedas = monedas;
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
                ", Monedas { " + monedas.toString() + "}";
    }
    
}
