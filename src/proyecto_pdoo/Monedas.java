package proyecto_pdoo;

/**
 *
 * @author Dani
 */
public class Monedas {
    private int coins, coinsClick, maxCoins;
    private String pathImage;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto.
     */
    public Monedas(){
        this(0, 10, 999999, "Null");
    }

    /**
     * Constructor por parámetros.
     * @param coins int
     * @param coinsClick int
     * @param maxCoins int
     * @param pathImage String
     */
    public Monedas(int coins, int coinsClick, int maxCoins, String pathImage) {
        this.coins = coins;
        this.coinsClick = coinsClick;
        this.maxCoins = maxCoins;
        this.pathImage = pathImage;
    }

    /**
     * Constructor de copia
     * @param other Monedas
     */
    public Monedas(Monedas other){
        this(other.coins, other.coinsClick, other.maxCoins, other.pathImage);
    }

    //----------------------------------- GETTERS Y SETTERS ---------------------------------------------//

    //-------- coins

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

    //-------- coinsClick

    /**
     * Getter coinsClick
     * @return int
     */
    public int getCoinsClick() {
        return coinsClick;
    }

    /**
     * Setter coinsClick
     * @param coinsClick int
     */
    public void setCoinsClick(int coinsClick) {
        if(coinsClick > 0){
            this.coinsClick = coinsClick;
        } else {
            System.err.println("El parámetro <coinsClic> es inferior a 0.");
            this.coinsClick = 0;
        }
    }
    
    

    //-------- maxCoins

    /**
     * Getter maxCoins
     * @return int
     */
    public int getMaxCoins() {
        return maxCoins;
    }

    /**
     * Setter maxCoins
     * @param maxCoins int
     */
    public void setMaxCoins(int maxCoins) {
        this.maxCoins = maxCoins;
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
     * Método doClickCoins
     * Añade monedas al total por hacer clic al objetoClicker.
     */
    public void doClickCoins(){
        this.coins += this.coinsClick;
    }
    
    //-------- Añadir monedas al total
    
    /**
     * addCoins
     * Añade o quita monedas del total según el parámetro.
     * @param coins int
     * @return boolean
     */
    public boolean addCoins(int coins){
        int c = this.coins;
        if(c+coins >= 0){
            this.coins += coins;
            return true;
        }
        return false;
    }
    
    //-------- Añadir monedas por clic
    
    /**
     * addCoinsClick
     * Suma las monedas por clic actuales con el parámetro.
     * @param coinsClick 
     */
    public void addCoinsClick(int coinsClick){
        if(coinsClick >= 0){
            this.coinsClick += coinsClick;
        }
    }

    //----------------------------------- OTROS ---------------------------------------------//

    /**
     * toString()
     * @return String
     */
    @Override
    public String toString() {
        return "coins= " + coins +
                ", coinsClick= " + coinsClick +
                ", maxCoins= " + maxCoins +
                ", pathImage= " + pathImage;
    }
}
