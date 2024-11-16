package proyecto_pdoo;

/**
 *
 * @author Dani
 */
public class Experiencia {
    private int nExp, maxExp, level;
    private int nExpClick;
    private double expMultiplier;
    private String pathImage;
    
    private int expLevel, expNextLevel, expBase;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto.
     */
    public Experiencia(){
        this(0, 10, 120, 999999, 1.2, 0, "Null");
    }
    
    /**
     * Constructor por parámetros.
     * @param nExp int
     * @param nExpClick int
     * @param maxExp int
     * @param expMultiplier double
     * @param level int
     * @param pathImage String
     * @param expBase int
     */
    public Experiencia(int nExp, int nExpClick, int expBase, int maxExp, double expMultiplier, int level, String pathImage) {
        this.setnExp(nExp);
        this.setnExpClick(nExpClick);
        this.setExpBase(expBase);
        this.setMaxExp(maxExp);
        this.setExpMultiplier(expMultiplier);
        this.level = level;
        this.pathImage = pathImage;
        this.reloadLevel();
    }
    
    /**
     * Constructor de copia.
     * @param other Experiencia
     */
    public Experiencia(Experiencia other){
        this(other.nExp, other.expBase, other.nExpClick, other.maxExp, other.expMultiplier, other.level, other.pathImage);
    }

    //----------------------------------- GETTERS Y SETTERS ---------------------------------------------//

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
    
    
    //-------- nExpClick

    /**
     * Getter nExpClick
     * @return int
     */
    public int getnExpClick() {
        return nExpClick;
    }

    /**
     * Setter nExpClick
     * @param nExpClick int 
     */
    public void setnExpClick(int nExpClick) {
        if(nExpClick < this.maxExp){
            this.nExpClick = nExpClick;
        } else {
            this.nExpClick = 10;
            System.err.println("Restaurado nExpClic a valor 10 debido a exceso.");
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

    /**
     * Método reloadLevel()
     * Recarga el nivel, la experiencia del nivel actual y la experiencia del nivel siguiente en función de la experiencia obtenida.
     */
    public void reloadLevel() {
        double exponente = 1.5;

        expLevel = (int) (expBase * expMultiplier * Math.pow(level, exponente));
    
        expNextLevel = (int) (expBase * expMultiplier * Math.pow((level + 1), exponente));
    
        while (nExp >= expNextLevel) {
            level++;
            expLevel = expNextLevel; 
            expNextLevel = (int) (expBase * expMultiplier * Math.pow((level + 1), exponente));
        }
    }

    
    //-------- expBase

    /**
     * Getter expBase
     * @return int
     */
    public int getExpBase() {
        return expBase;
    }

    /**
     * Setter expBase
     * @param expBase int 
     */
    public void setExpBase(int expBase) {
        this.expBase = expBase;
    }
    
    //-------- expLevel

    /**
     * Getter expLevel
     * @return int
     */
    public int getExpLevel() {
        return expLevel;
    }

    /**
     * Setter expLevel
     * @param expLevel int 
     */
    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }
    
    
    //-------- expNextLevel

    /**
     * Getter expNextLevel
     * @return int
     */
    public int getExpNextLevel() {
        return expNextLevel;
    }

    /**
     * Setter expNextLevel
     * @param expNextLevel int 
     */
    public void setExpNextLevel(int expNextLevel) {
        this.expNextLevel = expNextLevel;
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
    
    //----------------------------------- FUNCIONES ---------------------------------------------//
    
    //-------- Al hacer clic
    
    /**
     * Método doClicExp
     * Añade experiencia al hacer click sobre el objetoClicker.
     */
    public void doClickExp(){
        this.nExp += this.nExpClick;
        this.reloadLevel();
    }
    
    //-------- Añadir exp por clic
    
    /**
     * Método addNExpClic.
     * Suma la experiencia por clic actual con la del parámetro.
     * @param n_exp int
     */
    public void addNExpClic(int n_exp){
        if(n_exp+nExpClick < this.maxExp){
            this.nExpClick += n_exp;
            this.reloadLevel();
        } else {
            this.nExpClick = this.maxExp;
            this.reloadLevel();
        }
    }
    

    //----------------------------------- OTROS ---------------------------------------------//

    /**
     * toString()
     * @return String
     */
    @Override
    public String toString() {
        return "nExp= " + nExp +
                ", expBase= " + expBase +
                ", nExpClic= " + nExpClick +
                ", expMultiplier= " + expMultiplier +
                ", maxExp= " + maxExp +
                ", level= " + level +
                ", expLevel= " + expLevel +
                ", expNextLevel= " + expNextLevel +
                ", pathImage= " + pathImage;
    }    

    private double Math(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
