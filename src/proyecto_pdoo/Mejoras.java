package proyecto_pdoo;

/**
 *
 * @author forza
 */
public class Mejoras {
    private String name, description, pathImage;
    private int prize;


    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto
     */
    public Mejoras(){
        this("","","",0);
    }

    /**
     * Constructor por parámetros
     * @param name String
     * @param description String
     * @param pathImage String
     * @param prize int
     */
    public Mejoras(String name, String description, String pathImage, int prize) {
        this.name = name;
        this.description = description;
        this.pathImage = pathImage;
        this.prize = prize;
    }

    /**
     * Constructor de copia
     * @param otro Mejoras
     */
    public Mejoras(Mejoras otro){
        this(otro.name, otro.description, otro.pathImage, otro.prize);
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


    //----------------------------------- Otros ---------------------------------------------//

    /**
     * Método toString()
     * @return String
     */
    @Override
    public String toString() {
        return  "Name=" + name +
                ", description='" + description +
                ", pathImage='" + pathImage +
                ", prize=" + prize;
    }
}
