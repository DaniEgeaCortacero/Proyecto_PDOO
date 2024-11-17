package proyecto_pdoo;

/**
 *
 * @author Dani
 */
public class Mejoras {
    protected String name, description, pathImage;
    protected int prize;
    protected ObjetoClicker obj;


    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto
     */
    public Mejoras(){
        this("","","",0, null);
    }

    /**
     * Constructor por parámetros
     * @param name String
     * @param description String
     * @param pathImage String
     * @param prize int
     * @param obj ObjetoClicker
     */
    public Mejoras(String name, String description, String pathImage, int prize, ObjetoClicker obj) {
        this.name = name;
        this.description = description;
        this.pathImage = pathImage;
        this.prize = prize;
        this.obj = obj;
    }

    /**
     * Constructor de copia
     * @param otro Mejoras
     */
    public Mejoras(Mejoras otro){
        this(otro.name, otro.description, otro.pathImage, otro.prize, otro.obj);
    }


    //----------------------------------- Getter y setters ---------------------------------------------//

    //-------- name

    /**
     * Getter name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter name
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    //-------- description

    /**
     * Getter description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter description
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    //-------- pathImage

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

    //-------- prize

    /**
     * Getter prize
     * @return int
     */
    public int getPrize() {
        return prize;
    }

    /**
     * Setter prize
     * @param prize int
     */
    public void setPrize(int prize) {
        this.prize = prize;
    }
    
    //-------- ObjetoClicker

    /**
     * Getter obj
     * @return ObjetoClicker
     */
    public ObjetoClicker getObj() {
        return obj;
    }

    /**
     * Setter obj
     * @param obj ObjetoClicker 
     */
    public void setObj(ObjetoClicker obj) {
        this.obj = obj;
    }
    
    
    //----------------------------------- Funciones ---------------------------------------------//
    
    //------ Comprar mejora
    
    /**
     * buyUpgrade()
     * Este método resta el precio de la mejora al total.
     */
    public void buyUpgrade(){
        this.obj.getMonedas().addCoins(-prize);
        this.obj.getMejoras().add(this);
    }
    

    //----------------------------------- Otros ---------------------------------------------//

    /**
     * Método toString()
     * @return String
     */
    @Override
    public String toString() {
        return  "Name=" + name +
                ", description= " + description +
                ", pathImage= " + pathImage +
                ", prize= " + prize;
    }
    
}
