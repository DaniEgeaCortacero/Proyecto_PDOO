package proyecto_pdoo;

/**
 *
 * @author Dani
 */
public class Experiencia {
    private int nExp, maxExp, level;
    private double expMultiplier;
    private String pathImage;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto.
     */
    public Experiencia(){
        this(0, 999999, 1.6, 0, "Null");
    }
    
    /**
     * Constructor por parámetros.
     * @param nExp int
     * @param maxExp int
     * @param expMultiplier double
     * @param level int
     * @param pathImage String
     */
    public Experiencia(int nExp, int maxExp, double expMultiplier, int level, String pathImage) {
        this.setnExp(nExp);
        this.setMaxExp(maxExp);
        this.setExpMultiplier(expMultiplier);
        this.level = level;
        this.pathImage = pathImage;
    }
    
    /**
     * Constructor de copia.
     * @param other Experiencia
     */
    public Experiencia(Experiencia other){
        this(other.nExp, other.maxExp, other.expMultiplier, other.level, other.pathImage);
    }

    //----------------------------------- EXPERIENCIA ---------------------------------------------//

    //-------- nExp

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
        if(nExp >= 0){
            this.nExp = nExp;
        } else {
            System.err.println("El parámetro <nExp> es inferior a 0.");
            this.nExp = 0;
        }
    }

    /**
     * Método addExp.
     * Suma la experiencia actual con la del parámetro.
     * @param n_exp int
     */
    public void addExp(int n_exp){
        if(n_exp < this.maxExp){
            this.nExp += n_exp;
            this.reloadLevel();
        } else {
            this.nExp = this.maxExp;
            this.reloadLevel();
        }
    }

    //-------- maxExp

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
        if(maxExp >= nExp){
            this.maxExp = maxExp;
        } else {
            System.err.println("maxExp es menor que exp. Valor establecido a <exp>.");
            this.maxExp = this.nExp;
        }
    }

    //-------- expMultiplier

    /**
     * Getter expMultiplier
     * @return double
     */
    public double getExpMultiplier() {
        return expMultiplier;
    }

    /**
     * Setter expMultiplier
     * @param expMultiplier double
     */
    public void setExpMultiplier(double expMultiplier) {
        if(expMultiplier > 0){
            this.expMultiplier = expMultiplier;
        } else {
            System.err.println("El parámetro <expMultiplier> es inferior o igual a 0. Establecido valor 1.2");
            this.expMultiplier = 1.2;
        }
    }

    //-------- level

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
        if(level >= 0){
            this.level = level;
        } else {
            System.err.println("El parámetro <level> es inferior a 0.");
            this.level = 0;
        }
    }

    public void reloadLevel(){
        double expBase = 120;

        while (nExp >= expBase * expMultiplier * (level + 1)) {
            level++;
        }
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

    //----------------------------------- OTROS ---------------------------------------------//

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
