package proyecto_pdoo;

public class Mejoras_monedas extends Mejoras{

    private int increaseCoins;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto
     */
    public Mejoras_monedas(){
        this("", "", "", 0, null, 0);
    }

    /**
     * Constructor por parámetros
     * @param name String
     * @param description String
     * @param pathImage String
     * @param prize int
     * @param obj ObjetoClicker
     * @param increaseCoins int
     */
    public Mejoras_monedas(String name, String description, String pathImage, int prize, ObjetoClicker obj, int increaseCoins) {
        super(name, description, pathImage, prize, obj);
        this.increaseCoins = increaseCoins;
    }

    /**
     * Constructor de copia
     * @param otro Mejoras_monedas
     */
    public Mejoras_monedas(Mejoras_experiencia otro){
        this(otro.getName(), otro.getDescription(), otro.getPathImage(), otro.getPrize(), otro.getObj(), otro.getIncreaseExp());
    }


    //----------------------------------- Getter y setters ---------------------------------------------//

    /**
     * Getter increaseCoins
     * @return int
     */
    public int getIncreaseCoins() {
        return increaseCoins;
    }

    /**
     * Setter increasecoins
     * @param increaseCoins int
     */
    public void setIncreaseCoins(int increaseCoins) {
        this.increaseCoins = increaseCoins;
    }


    //----------------------------------- FUNCIONES ---------------------------------------------//


    //------ Añadir o quitar monedas totales.

    /**
     * addCoins
     * Añade o quita monedas del total según el parámetro.
     */
    public void addCoins(){
        super.obj.getMonedas().addCoins(this.increaseCoins);
        super.buyUpgrade(this.prize);
    }


    //------ Añadir monedas por click

    /**
     * addCoinsClick
     * Suma las monedas por clic actuales con el parámetro.
     */
    public void addCoinsClick(){
        super.obj.getMonedas().addCoinsClick(this.increaseCoins);
        super.buyUpgrade(this.prize);
    }


    //----------------------------------- OTROS ---------------------------------------------//


    @Override
    public String toString() {
        return  "Name=" + super.getName() +
                ", description= " + super.getDescription() +
                ", pathImage= " + super.getPathImage() +
                ", prize= " + super.getPrize() +
                ", increaseCoins= " + this.increaseCoins;
    }
}
