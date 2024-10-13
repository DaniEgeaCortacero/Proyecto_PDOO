package proyecto_pdoo;

/**
 *
 * @author forza
 */
public class ObjetoClicker {
    private int coinsClic, exp, maxExp, earnedExp;
    private String pathImage;

    /**
     * Constructor por defecto.
     */
    public ObjetoClicker(){
        this.setCoinsClic(10);
        this.setExp(0);
        this.setMaxExp(100000);
        this.setEarnedExp(10);
        this.setPathImage("");
    }
    
    /**
     * Constructor por parámetros.
     * @param coinsClic int
     * @param exp int
     * @param maxExp int
     * @param earnedExp int
     * @param pathImage String
     */
    public ObjetoClicker(int coinsClic, int exp, int maxExp, int earnedExp, String pathImage) {
        this.setCoinsClic(coinsClic);
        this.setExp(exp);
        this.setMaxExp(maxExp);
        this.setEarnedExp(earnedExp);
        this.setPathImage(pathImage);
    }
    
    /**
     * Constructor de copia
     * @param otro ObjetoClicker
     */
    public ObjetoClicker(ObjetoClicker otro){
        this(otro.getCoinsClic(), otro.getExp(), otro.getMaxExp(),
                otro.getEarnedExp(), otro.getPathImage());
    }

    /**
     * Getter coinsClic
     * @return int
     */
    public int getCoinsClic() {
        return coinsClic;
    }

    /**
     * Setter coinsClic
     * @param coinsClic int
     */
    public void setCoinsClic(int coinsClic) {
        if(coinsClic > 0){
            this.coinsClic = coinsClic;
        } else {
            System.err.println("El parámetro <coinsClic> es inferior a 0.");
            this.coinsClic = 0;
        }
    }

    /**
     * Getter exp
     * @return int
     */
    public int getExp() {
        return exp;
    }

    /**
     * Setter exp
     * @param exp int 
     */
    public void setExp(int exp) {
        if(exp >= 0){
            this.exp = coinsClic;
        } else {
            System.err.println("El parámetro <exp> es inferior a 0.");
            this.exp = 0;
        }
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
        if(maxExp >= exp){
            this.maxExp = maxExp;
        } else {
            System.err.println("maxExp es menor que exp. Valor establecido a <exp>.");
            this.maxExp = this.exp;
        }
    }  

    /**
     * Getter earnedExp
     * @return int
     */
    public int getEarnedExp() {
        return earnedExp;
    }

    /**
     * Setter earnedExp
     * @param earnedExp int 
     */
    public void setEarnedExp(int earnedExp) {
        if(earnedExp > 0){
            this.earnedExp = earnedExp;
        } else {
            System.err.println("El atributo <earnedExp> es inferior a 0.");
            this.earnedExp = 0;
        }
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
     * Método toString()
     * @return String
     */
    @Override
    public String toString() {
        return "coinsClic= " + coinsClic +
                ", exp= " + exp +
                ", maxExp= " + maxExp +
                ", earnedExp= " + earnedExp +
                ", maxExp= " + maxExp +
                ", pathImage= " + pathImage;
    }
       
    
}
