package proyecto_pdoo;

/**
 *
 * @author forza
 */
public class Experiencia {
    private int nExp, maxExp, level;
    private String pathImage;

    /**
     * Constructor por defecto.
     */
    public Experiencia(){
        this(0, 999999, 0, "Null");
    }
    
    /**
     * Constructor por parámetros.
     * @param nExp int
     * @param maxExp int
     * @param level int
     * @param pathImage String
     */
    public Experiencia(int nExp, int maxExp, int level, String pathImage) {
        this.nExp = nExp;
        this.maxExp = maxExp;
        this.level = level;
        this.pathImage = pathImage;
    }
    
    /**
     * Constructor de copia.
     * @param other Experiencia
     */
    public Experiencia(Experiencia other){
        this(other.nExp, other.maxExp, other.level, other.pathImage);
    }

    /**
     * Getter nExp
     * @return int
     */
    public int getnExp() {
        return nExp;
    }

    /**
     * Setter nExp
     * @param nExp int 
     */
    public void setnExp(int nExp) {
        this.nExp = nExp;
    }

    /**
     * Getter maxExp
     * @return int
     */
    public int getMaxExp() {
        return maxExp;
    }

    /**
     * Setter maxExp
     * @param maxExp int 
     */
    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    /**
     * Getter level
     * @return int
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter level
     * @param level int 
     */
    public void setLevel(int level) {
        this.level = level;
    }

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
     * toString()
     * @return String
     */
    @Override
    public String toString() {
        return "nExp= " + nExp +
                ", maxExp= " + maxExp +
                ", level= " + level +
                ", pathImage= " + pathImage;
    }    
    
}
