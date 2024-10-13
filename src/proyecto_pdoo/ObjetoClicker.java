package proyecto_pdoo;

/**
 *
 * @author forza
 */
public class ObjetoClicker {
    private int coins, coinsClic, exp, maxExp;
    private String pathImage;

    /**
     * Constructor por defecto.
     */
    public ObjetoClicker(){
        this.setCoins(0);
        this.setCoinsClic(10);
        this.setExp(10);
        this.setMaxExp(100000);
        this.setPathImage("");
    }
    
    /**
     * Constructor por parámetros.
     * @param coins int
     * @param coinsClic int
     * @param exp int
     * @param maxExp int
     * @param pathImage String
     */
    public ObjetoClicker(int coins, int coinsClic, int exp, int maxExp,  String pathImage) {
        this.setCoins(coins);
        this.setCoinsClic(coinsClic);
        this.setExp(exp);
        this.setMaxExp(maxExp);
        this.setPathImage(pathImage);
    }
    
    /**
     * Constructor de copia
     * @param otro ObjetoClicker
     */
    public ObjetoClicker(ObjetoClicker otro){
        this(otro.getCoins(), otro.getCoinsClic(), otro.getExp(), otro.getMaxExp(), otro.getPathImage());
    }

    /**
     * Getter coins.
     * @return int
     */
    public int getCoins() {
        return coins;
    }

    /**
     * Setter coins
     * @param coins int
     */
    public void setCoins(int coins) {
        if(coins >= 0){
            this.coins = coins;
        } else {
            System.err.println("El parámetro coins no puede ser inferior a 0. Inicializando atributo a 0.");
            this.coins = 0;
        }
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
            this.exp = exp;
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
     * Método addExp.
     * @param n_exp int
     */
    public void addExp(int n_exp){
        if(n_exp < this.maxExp){
            this.setExp(n_exp);
        } else {
            this.setExp(this.maxExp);
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
        return "coins= " + coins +
                ", coinsClic= " + coinsClic +
                ", exp= " + exp +
                ", maxExp= " + maxExp +
                ", pathImage= " + pathImage;
    }
    
}
